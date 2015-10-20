/**
 */
package ahp.impl;

import ahp.AHPFactory;
import ahp.AHPPackage;
import ahp.Alternative;
import ahp.AlternativeJudgment;
import ahp.Criterion;
import ahp.CriterionAlternativePriority;
import ahp.CriterionInconsistency;
import ahp.CriterionJudgment;
import ahp.Goal;
import ahp.GoalAlternativePriority;
import ahp.GoalCriterionPriority;
import ahp.GoalInconsistency;
import ahp.Hierarchy;
import ahp.Inconsistency;
import ahp.Judgment;
import ahp.JudgmentMatrix;
import ahp.Matrix;
import ahp.Priority;
import ahp.Vector;

import com.google.common.base.Objects;

import com.google.common.collect.Iterables;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ahp.impl.HierarchyImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link ahp.impl.HierarchyImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link ahp.impl.HierarchyImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link ahp.impl.HierarchyImpl#getJudgments <em>Judgments</em>}</li>
 *   <li>{@link ahp.impl.HierarchyImpl#getPriorities <em>Priorities</em>}</li>
 *   <li>{@link ahp.impl.HierarchyImpl#getInconsistencies <em>Inconsistencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HierarchyImpl extends MinimalEObjectImpl.Container implements Hierarchy {
	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected Goal goal;

	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<Criterion> criteria;

	/**
	 * The cached value of the '{@link #getAlternatives() <em>Alternatives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternatives()
	 * @generated
	 * @ordered
	 */
	protected EList<Alternative> alternatives;

	/**
	 * The cached value of the '{@link #getJudgments() <em>Judgments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJudgments()
	 * @generated
	 * @ordered
	 */
	protected EList<Judgment<?>> judgments;

	/**
	 * The cached value of the '{@link #getPriorities() <em>Priorities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorities()
	 * @generated
	 * @ordered
	 */
	protected EList<Priority> priorities;

	/**
	 * The cached value of the '{@link #getInconsistencies() <em>Inconsistencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInconsistencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Inconsistency> inconsistencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HierarchyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AHPPackage.Literals.HIERARCHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal getGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal(Goal newGoal, NotificationChain msgs) {
		Goal oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AHPPackage.HIERARCHY__GOAL, oldGoal, newGoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(Goal newGoal) {
		if (newGoal != goal) {
			NotificationChain msgs = null;
			if (goal != null)
				msgs = ((InternalEObject)goal).eInverseRemove(this, AHPPackage.GOAL__HIERARCHY, Goal.class, msgs);
			if (newGoal != null)
				msgs = ((InternalEObject)newGoal).eInverseAdd(this, AHPPackage.GOAL__HIERARCHY, Goal.class, msgs);
			msgs = basicSetGoal(newGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AHPPackage.HIERARCHY__GOAL, newGoal, newGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Criterion> getCriteria() {
		if (criteria == null) {
			criteria = new EObjectContainmentWithInverseEList<Criterion>(Criterion.class, this, AHPPackage.HIERARCHY__CRITERIA, AHPPackage.CRITERION__HIERARCHY);
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alternative> getAlternatives() {
		if (alternatives == null) {
			alternatives = new EObjectContainmentWithInverseEList<Alternative>(Alternative.class, this, AHPPackage.HIERARCHY__ALTERNATIVES, AHPPackage.ALTERNATIVE__HIERARCHY);
		}
		return alternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Judgment<?>> getJudgments() {
		if (judgments == null) {
			judgments = new EObjectContainmentWithInverseEList<Judgment<?>>(Judgment.class, this, AHPPackage.HIERARCHY__JUDGMENTS, AHPPackage.JUDGMENT__HIERARCHY);
		}
		return judgments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Priority> getPriorities() {
		if (priorities == null) {
			priorities = new EObjectContainmentEList<Priority>(Priority.class, this, AHPPackage.HIERARCHY__PRIORITIES);
		}
		return priorities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inconsistency> getInconsistencies() {
		if (inconsistencies == null) {
			inconsistencies = new EObjectContainmentEList<Inconsistency>(Inconsistency.class, this, AHPPackage.HIERARCHY__INCONSISTENCIES);
		}
		return inconsistencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriterionJudgment findJudgment(final Goal goal, final Criterion first, final Criterion second) {
		EList<Judgment<?>> _judgments = this.getJudgments();
		Iterable<CriterionJudgment> _filter = Iterables.<CriterionJudgment>filter(_judgments, CriterionJudgment.class);
		final Function1<CriterionJudgment, Boolean> _function = new Function1<CriterionJudgment, Boolean>() {
			public Boolean apply(final CriterionJudgment j) {
				boolean _and = false;
				boolean _and_1 = false;
				Goal _goal = j.getGoal();
				boolean _equals = Objects.equal(_goal, goal);
				if (!_equals) {
					_and_1 = false;
				} else {
					Criterion _first = j.getFirst();
					boolean _equals_1 = Objects.equal(_first, first);
					_and_1 = _equals_1;
				}
				if (!_and_1) {
					_and = false;
				} else {
					Criterion _second = j.getSecond();
					boolean _equals_2 = Objects.equal(_second, second);
					_and = _equals_2;
				}
				return Boolean.valueOf(_and);
			}
		};
		return IterableExtensions.<CriterionJudgment>findFirst(_filter, _function);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeJudgment findJudgment(final Criterion criterion, final Alternative first, final Alternative second) {
		EList<Judgment<?>> _judgments = this.getJudgments();
		Iterable<AlternativeJudgment> _filter = Iterables.<AlternativeJudgment>filter(_judgments, AlternativeJudgment.class);
		final Function1<AlternativeJudgment, Boolean> _function = new Function1<AlternativeJudgment, Boolean>() {
			public Boolean apply(final AlternativeJudgment j) {
				boolean _and = false;
				boolean _and_1 = false;
				Criterion _criterion = j.getCriterion();
				boolean _equals = Objects.equal(_criterion, criterion);
				if (!_equals) {
					_and_1 = false;
				} else {
					Alternative _first = j.getFirst();
					boolean _equals_1 = Objects.equal(_first, first);
					_and_1 = _equals_1;
				}
				if (!_and_1) {
					_and = false;
				} else {
					Alternative _second = j.getSecond();
					boolean _equals_2 = Objects.equal(_second, second);
					_and = _equals_2;
				}
				return Boolean.valueOf(_and);
			}
		};
		return IterableExtensions.<AlternativeJudgment>findFirst(_filter, _function);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updatePriorities() {
		try {
			EList<Priority> _priorities = this.getPriorities();
			_priorities.clear();
			EList<Inconsistency> _inconsistencies = this.getInconsistencies();
			_inconsistencies.clear();
			EList<Criterion> _criteria = this.getCriteria();
			final JudgmentMatrix<Criterion> mat = new JudgmentMatrix<Criterion>(_criteria);
			EList<Judgment<?>> _judgments = this.getJudgments();
			Iterable<CriterionJudgment> _filter = Iterables.<CriterionJudgment>filter(_judgments, CriterionJudgment.class);
			final Function1<CriterionJudgment, Boolean> _function = new Function1<CriterionJudgment, Boolean>() {
				public Boolean apply(final CriterionJudgment cj) {
					Goal _goal = cj.getGoal();
					Goal _goal_1 = HierarchyImpl.this.getGoal();
					return Boolean.valueOf(Objects.equal(_goal, _goal_1));
				}
			};
			final Iterable<CriterionJudgment> criteriaJudgments = IterableExtensions.<CriterionJudgment>filter(_filter, _function);
			for (final CriterionJudgment judgment : criteriaJudgments) {
				Criterion _first = judgment.getFirst();
				Criterion _second = judgment.getSecond();
				int _weight = judgment.getWeight();
				mat.set(_first, _second, _weight);
			}
			EList<Criterion> _criteria_1 = this.getCriteria();
			for (final Criterion criterion : _criteria_1) {
				{
					final GoalCriterionPriority priority = AHPFactory.eINSTANCE.createGoalCriterionPriority();
					Goal _goal = this.getGoal();
					priority.setGoal(_goal);
					priority.setCriterion(criterion);
					double _findEigenvectorElement = mat.findEigenvectorElement(criterion);
					priority.setValue(_findEigenvectorElement);
					EList<Priority> _priorities_1 = this.getPriorities();
					_priorities_1.add(priority);
				}
			}
			final GoalInconsistency goalInconsistency = AHPFactory.eINSTANCE.createGoalInconsistency();
			Goal _goal = this.getGoal();
			goalInconsistency.setGoal(_goal);
			double _inconsistency = mat.getInconsistency();
			goalInconsistency.setValue(_inconsistency);
			EList<Inconsistency> _inconsistencies_1 = this.getInconsistencies();
			_inconsistencies_1.add(goalInconsistency);
			EList<Alternative> _alternatives = this.getAlternatives();
			int _size = _alternatives.size();
			EList<Criterion> _criteria_2 = this.getCriteria();
			int _size_1 = _criteria_2.size();
			final Matrix mat2 = new Matrix(_size, _size_1);
			EList<Criterion> _criteria_3 = this.getCriteria();
			final Procedure2<Criterion, Integer> _function_1 = new Procedure2<Criterion, Integer>() {
				public void apply(final Criterion criterion, final Integer j) {
					try {
						EList<Alternative> _alternatives = HierarchyImpl.this.getAlternatives();
						final JudgmentMatrix<Alternative> mat3 = new JudgmentMatrix<Alternative>(_alternatives);
						EList<Judgment<?>> _judgments = HierarchyImpl.this.getJudgments();
						Iterable<AlternativeJudgment> _filter = Iterables.<AlternativeJudgment>filter(_judgments, AlternativeJudgment.class);
						final Function1<AlternativeJudgment, Boolean> _function = new Function1<AlternativeJudgment, Boolean>() {
							public Boolean apply(final AlternativeJudgment aj) {
								Criterion _criterion = aj.getCriterion();
								return Boolean.valueOf(Objects.equal(_criterion, criterion));
							}
						};
						final Iterable<AlternativeJudgment> alternativeJudgments = IterableExtensions.<AlternativeJudgment>filter(_filter, _function);
						for (final AlternativeJudgment judgment : alternativeJudgments) {
							Alternative _first = judgment.getFirst();
							Alternative _second = judgment.getSecond();
							int _weight = judgment.getWeight();
							mat3.set(_first, _second, _weight);
						}
						final CriterionInconsistency criterionInconsistency = AHPFactory.eINSTANCE.createCriterionInconsistency();
						criterionInconsistency.setCriterion(criterion);
						double _inconsistency = mat3.getInconsistency();
						criterionInconsistency.setValue(_inconsistency);
						EList<Inconsistency> _inconsistencies = HierarchyImpl.this.getInconsistencies();
						_inconsistencies.add(criterionInconsistency);
						EList<Alternative> _alternatives_1 = HierarchyImpl.this.getAlternatives();
						final Procedure2<Alternative, Integer> _function_1 = new Procedure2<Alternative, Integer>() {
							public void apply(final Alternative alternative, final Integer i) {
								try {
									final CriterionAlternativePriority priority = AHPFactory.eINSTANCE.createCriterionAlternativePriority();
									priority.setCriterion(criterion);
									priority.setAlternative(alternative);
									double _findEigenvectorElement = mat3.findEigenvectorElement(alternative);
									priority.setValue(_findEigenvectorElement);
									EList<Priority> _priorities = HierarchyImpl.this.getPriorities();
									_priorities.add(priority);
									double _value = priority.getValue();
									mat2.set((i).intValue(), (j).intValue(), _value);
								}
								catch (Throwable _e) {
									throw org.eclipse.xtext.xbase.lib.Exceptions.sneakyThrow(_e);
								}
							}
						};
						IterableExtensions.<Alternative>forEach(_alternatives_1, _function_1);
					}
					catch (Throwable _e) {
						throw org.eclipse.xtext.xbase.lib.Exceptions.sneakyThrow(_e);
					}
				}
			};
			IterableExtensions.<Criterion>forEach(_criteria_3, _function_1);
			Vector _eigenvector = mat.getEigenvector();
			final Vector mat4 = mat2.multiply(_eigenvector);
			EList<Alternative> _alternatives_1 = this.getAlternatives();
			final Procedure2<Alternative, Integer> _function_2 = new Procedure2<Alternative, Integer>() {
				public void apply(final Alternative alternative, final Integer i) {
					final GoalAlternativePriority priority = AHPFactory.eINSTANCE.createGoalAlternativePriority();
					Goal _goal = HierarchyImpl.this.getGoal();
					priority.setGoal(_goal);
					priority.setAlternative(alternative);
					double _get = mat4.get((i).intValue());
					priority.setValue(_get);
					EList<Priority> _priorities = HierarchyImpl.this.getPriorities();
					_priorities.add(priority);
				}
			};
			IterableExtensions.<Alternative>forEach(_alternatives_1, _function_2);
		}
		catch (Throwable _e) {
			throw org.eclipse.xtext.xbase.lib.Exceptions.sneakyThrow(_e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AHPPackage.HIERARCHY__GOAL:
				if (goal != null)
					msgs = ((InternalEObject)goal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AHPPackage.HIERARCHY__GOAL, null, msgs);
				return basicSetGoal((Goal)otherEnd, msgs);
			case AHPPackage.HIERARCHY__CRITERIA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCriteria()).basicAdd(otherEnd, msgs);
			case AHPPackage.HIERARCHY__ALTERNATIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlternatives()).basicAdd(otherEnd, msgs);
			case AHPPackage.HIERARCHY__JUDGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getJudgments()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AHPPackage.HIERARCHY__GOAL:
				return basicSetGoal(null, msgs);
			case AHPPackage.HIERARCHY__CRITERIA:
				return ((InternalEList<?>)getCriteria()).basicRemove(otherEnd, msgs);
			case AHPPackage.HIERARCHY__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
			case AHPPackage.HIERARCHY__JUDGMENTS:
				return ((InternalEList<?>)getJudgments()).basicRemove(otherEnd, msgs);
			case AHPPackage.HIERARCHY__PRIORITIES:
				return ((InternalEList<?>)getPriorities()).basicRemove(otherEnd, msgs);
			case AHPPackage.HIERARCHY__INCONSISTENCIES:
				return ((InternalEList<?>)getInconsistencies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AHPPackage.HIERARCHY__GOAL:
				return getGoal();
			case AHPPackage.HIERARCHY__CRITERIA:
				return getCriteria();
			case AHPPackage.HIERARCHY__ALTERNATIVES:
				return getAlternatives();
			case AHPPackage.HIERARCHY__JUDGMENTS:
				return getJudgments();
			case AHPPackage.HIERARCHY__PRIORITIES:
				return getPriorities();
			case AHPPackage.HIERARCHY__INCONSISTENCIES:
				return getInconsistencies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AHPPackage.HIERARCHY__GOAL:
				setGoal((Goal)newValue);
				return;
			case AHPPackage.HIERARCHY__CRITERIA:
				getCriteria().clear();
				getCriteria().addAll((Collection<? extends Criterion>)newValue);
				return;
			case AHPPackage.HIERARCHY__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends Alternative>)newValue);
				return;
			case AHPPackage.HIERARCHY__JUDGMENTS:
				getJudgments().clear();
				getJudgments().addAll((Collection<? extends Judgment<?>>)newValue);
				return;
			case AHPPackage.HIERARCHY__PRIORITIES:
				getPriorities().clear();
				getPriorities().addAll((Collection<? extends Priority>)newValue);
				return;
			case AHPPackage.HIERARCHY__INCONSISTENCIES:
				getInconsistencies().clear();
				getInconsistencies().addAll((Collection<? extends Inconsistency>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AHPPackage.HIERARCHY__GOAL:
				setGoal((Goal)null);
				return;
			case AHPPackage.HIERARCHY__CRITERIA:
				getCriteria().clear();
				return;
			case AHPPackage.HIERARCHY__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case AHPPackage.HIERARCHY__JUDGMENTS:
				getJudgments().clear();
				return;
			case AHPPackage.HIERARCHY__PRIORITIES:
				getPriorities().clear();
				return;
			case AHPPackage.HIERARCHY__INCONSISTENCIES:
				getInconsistencies().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AHPPackage.HIERARCHY__GOAL:
				return goal != null;
			case AHPPackage.HIERARCHY__CRITERIA:
				return criteria != null && !criteria.isEmpty();
			case AHPPackage.HIERARCHY__ALTERNATIVES:
				return alternatives != null && !alternatives.isEmpty();
			case AHPPackage.HIERARCHY__JUDGMENTS:
				return judgments != null && !judgments.isEmpty();
			case AHPPackage.HIERARCHY__PRIORITIES:
				return priorities != null && !priorities.isEmpty();
			case AHPPackage.HIERARCHY__INCONSISTENCIES:
				return inconsistencies != null && !inconsistencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AHPPackage.HIERARCHY___FIND_JUDGMENT__GOAL_CRITERION_CRITERION:
				return findJudgment((Goal)arguments.get(0), (Criterion)arguments.get(1), (Criterion)arguments.get(2));
			case AHPPackage.HIERARCHY___FIND_JUDGMENT__CRITERION_ALTERNATIVE_ALTERNATIVE:
				return findJudgment((Criterion)arguments.get(0), (Alternative)arguments.get(1), (Alternative)arguments.get(2));
			case AHPPackage.HIERARCHY___UPDATE_PRIORITIES:
				updatePriorities();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //HierarchyImpl
