package ahp;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class AHPResource extends XMIResourceImpl {

    public AHPResource() {
        super();
    }
    
    public AHPResource(URI uri) {
        super(uri);
    }
    
    @Override
    protected boolean useUUIDs() {
        return true;
    }
}
