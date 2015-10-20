package ahp.design;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;

import ahp.AHPFactory;
import ahp.Alternative;
import ahp.Criterion;
import ahp.CriterionAlternative;
import ahp.DoubleHashMap;

public class ViewModel {
	public static final ViewModel INSTANCE = new ViewModel();
	
	private DoubleHashMap<Criterion, Alternative, CriterionAlternative> map = new DoubleHashMap<Criterion, Alternative, CriterionAlternative>();
	
	private ViewModel() {
	}
	
	public CriterionAlternative getAlternative(Criterion criterion, Alternative alternative) {
		if (map.containsKey(criterion, alternative)) {
			return map.get(criterion, alternative);
		}
		CriterionAlternative ca = AHPFactory.eINSTANCE.createCriterionAlternative();
		ca.setCriterion(criterion);
		ca.setAlternative(alternative);
		map.put(criterion, alternative, ca);
		return ca;
	}
	
	public Collection<CriterionAlternative> getAlternatives(Criterion criterion) {
		Collection<CriterionAlternative> result = new BasicEList<CriterionAlternative>();
		for (Alternative alternative : criterion.getHierarchy().getAlternatives()) {
			result.add(getAlternative(criterion, alternative));
		}
		return result;		
	}
	
	public Collection<CriterionAlternative> getAlternatives(Alternative alternative) {
		Collection<CriterionAlternative> result = new BasicEList<CriterionAlternative>();
		for (Criterion criterion : alternative.getHierarchy().getCriteria()) {
			result.add(getAlternative(criterion, alternative));
		}
		return result;		
	}
}
