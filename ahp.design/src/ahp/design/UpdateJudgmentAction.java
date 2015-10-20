package ahp.design;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.table.ui.tools.api.editor.DTableEditor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import ahp.Hierarchy;

public class UpdateJudgmentAction extends AbstractExternalJavaAction {

	public UpdateJudgmentAction() {
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Iterator<? extends EObject> iter = selections.iterator();
		if (!iter.hasNext()) {
			System.out.println("Selections is empty");
			return;
		}
		EObject obj = selections.iterator().next();
		System.out.println(obj);
		/*
		if (!(obj instanceof DSemanticDiagram)) {
			System.out.println("DSemanticDiagram is expected");
		}
		DSemanticDiagram diagram = (DSemanticDiagram)obj;
		EObject target = diagram.getTarget();
		if (!(target instanceof Hierarchy)) {
			System.out.println("Hierarchy is expected");
		}
		Hierarchy hierarchy = (Hierarchy)target;
*/
		
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		System.out.println(editor);
		DTableEditor table = (org.eclipse.sirius.table.ui.tools.api.editor.DTableEditor)editor;
		//table.
		System.out.println(table.getControl());
		System.out.println(table.getEditorInput());
		
		/*if(editor instanceof DDiagramEditorImpl) {
			DDiagramEditorImpl diagEditor = (DDiagramEditorImpl) editor;
			final DSemanticDiagramSpec spec = (DSemanticDiagramSpec) diagEditor.getDiagram().getElement();
			DSemanticDiagramSpec diagram = (DSemanticDiagramSpec) spec;	
			GeneChartSirius genechart = (GeneChartSirius) diagram.getTarget();
			final Collection collection = new ArrayList();
			collection.add(genechart);

			TransactionalEditingDomain ted = TransactionUtil.getEditingDomain(genechart);
			ted.getCommandStack().execute(new RecordingCommand(ted) {

				@Override
				protected void doExecute() {
					DummySimulation sim = new DummySimulation();
					sim.execute(collection, null);
					spec.refresh();
				}
			});
		}*/		
		
		
		Session session = SessionManager.INSTANCE.getSession(obj);
		TransactionalEditingDomain ted = session.getTransactionalEditingDomain();
		/*
		RecordingCommand cmd = new RecordingCommand(ted) {

			@Override
			protected void doExecute() {
				System.out.println(hierarchy.getPriorities().size());
				hierarchy.updatePriorities();
				System.out.println(hierarchy.getPriorities().size());
				
			}
			
		};
		
		ted.getCommandStack().execute(cmd);*/
	}

}
