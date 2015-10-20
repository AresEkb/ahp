package ahp;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class AHPResourceFactory extends XMIResourceFactoryImpl {

    public AHPResourceFactory() {
        super();
    }
    
    @Override
    public Resource createResource(URI uri) {
        return new AHPResource(uri);
    }
}
