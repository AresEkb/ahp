package ahp.design;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNodeList;
import org.eclipse.sirius.diagram.DNodeListElement;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.table.metamodel.table.DColumn;
import org.eclipse.sirius.table.metamodel.table.DLine;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import ahp.AHPPackage;
import ahp.Alternative;
import ahp.AlternativeJudgment;
import ahp.Criterion;
import ahp.CriterionAlternative;
import ahp.CriterionAlternativePriority;
import ahp.CriterionJudgment;
import ahp.Goal;
import ahp.Hierarchy;
import ahp.Inconsistency;
import ahp.Judgment;
import ahp.Priority;

public class Service {

	public EObject print(EObject obj) {
		System.out.println("print");
		System.out.println(obj);
		return obj;
	}

	public String toString(Priority priority) {
		return String.format("%.4f", priority.getValue());
	}
	
	public String toString(Inconsistency inconsistency) {
		return String.format("(%.0f%%)", inconsistency.getValue() * 100);
	}
	
	public String getWeightString(Judgment<?> judgment) {
		return EcoreUtil.convertToString(AHPPackage.eINSTANCE.getWeight(), judgment.getWeight());
	}
	
	public String getInverseWeightString(Judgment<?> judgment) {
		return EcoreUtil.convertToString(AHPPackage.eINSTANCE.getWeight(), -judgment.getWeight());
	}

	public boolean notEmptyWeight(EObject fake, String weight) {
		return !(weight == null || weight.trim().length() == 0 ||
				weight.equals("0") || weight.equals("1") || weight.equals("-1"));
	}
	
	public int getEdgeWidth(Criterion criterion) {
		Priority priority = criterion.getPriority();
		return (int) (priority.getValue() * 7);
	}

	public int getEdgeWidth(Alternative alternative, EdgeTarget targetView) {
		DSemanticDecorator targetNode = (DSemanticDecorator)targetView;
		Criterion criterion = (Criterion)targetNode.getTarget();
		Priority priority = alternative.getPriority(criterion);
		return (int) (priority.getValue() * 7);
	}

	public Priority getPriority(Alternative alternative, EdgeTarget targetView) {
		DSemanticDecorator targetNode = (DSemanticDecorator)targetView;
		Criterion criterion = (Criterion)targetNode.getTarget();
		return alternative.getPriority(criterion);
	}

	public Collection<CriterionAlternative> getAlternatives(Criterion criterion) {
		return ViewModel.INSTANCE.getAlternatives(criterion);
	}

	public CriterionAlternative getFirstAlternative(AlternativeJudgment judgment) {
		return ViewModel.INSTANCE.getAlternative(judgment.getCriterion(), judgment.getFirst());
	}

	public CriterionAlternative getSecondAlternative(AlternativeJudgment judgment) {
		return ViewModel.INSTANCE.getAlternative(judgment.getCriterion(), judgment.getSecond());
	}

	public CriterionJudgment getCriterionJudgment(Hierarchy hierarchy, DLine line, DColumn column) {
		return hierarchy.findJudgment(
				hierarchy.getGoal(),
				(Criterion)line.getTarget(),
				(Criterion)column.getTarget());
	}

	public CriterionJudgment getCriterionJudgment(Hierarchy hierarchy, DColumn column, DLine line) {
		return hierarchy.findJudgment(
				hierarchy.getGoal(),
				(Criterion)column.getTarget(),
				(Criterion)line.getTarget());
	}

	public AlternativeJudgment getAlternativeJudgment(Hierarchy hierarchy, DLine line, DColumn column) {
		CriterionAlternative ca = (CriterionAlternative)line.getTarget();
		return hierarchy.findJudgment(
				ca.getCriterion(),
				ca.getAlternative(),
				(Alternative)column.getTarget());
	}

	public AlternativeJudgment getAlternativeJudgment(Hierarchy hierarchy, DColumn column, DLine line) {
		CriterionAlternative ca = (CriterionAlternative)line.getTarget();
		return hierarchy.findJudgment(
				ca.getCriterion(),
				(Alternative)column.getTarget(),
				ca.getAlternative());
	}

}
