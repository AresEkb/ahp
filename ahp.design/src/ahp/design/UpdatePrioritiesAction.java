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

import ahp.Hierarchy;

public class UpdatePrioritiesAction extends AbstractExternalJavaAction {

	public UpdatePrioritiesAction() {
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
		if (!(obj instanceof DSemanticDiagram)) {
			System.out.println("DSemanticDiagram is expected");
		}
		DSemanticDiagram diagram = (DSemanticDiagram)obj;
		EObject target = diagram.getTarget();
		if (!(target instanceof Hierarchy)) {
			System.out.println("Hierarchy is expected");
		}
		Hierarchy hierarchy = (Hierarchy)target;

		Session session = SessionManager.INSTANCE.getSession(target);
		TransactionalEditingDomain ted = session.getTransactionalEditingDomain();
		RecordingCommand cmd = new RecordingCommand(ted) {
			@Override
			protected void doExecute() {
				hierarchy.updatePriorities();
			}
		};
		ted.getCommandStack().execute(cmd);
	}

}
