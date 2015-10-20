package ahp;

import java.util.HashMap;

// It's better to use a single HashMap with a TupleKey but
// the current implementation is simpler
public class DoubleHashMap<K1, K2, V> {
    private HashMap<K1, HashMap<K2, V>> hash = new HashMap<K1, HashMap<K2, V>>();
    
    public DoubleHashMap() {
    }
    
    public boolean containsKey(K1 key1, K2 key2) {
    	if (hash.containsKey(key1)) {
    		HashMap<K2, V> nested = hash.get(key1);
    		return nested.containsKey(key2);
    	}
    	return false;
    }
    
    public V get(K1 key1, K2 key2) {
        HashMap<K2, V> nested = hash.get(key1);
        return nested != null ? nested.get(key2) : null;
    }
    
    public V put(K1 key1, K2 key2, V value) {
        HashMap<K2, V> nested = hash.get(key1);
        if (nested == null) {
            nested = new HashMap<K2, V>();
            hash.put(key1, nested);
        }
        return nested.put(key2, value);
    }
}
