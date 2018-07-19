package v1ch13.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * 使用LinkedHashMap来模拟LRU算法  需要重写removeEldestEntry方法
 * @author DONG
 *
 */
public class CacheMapTest {
	public static void main(String[] args) {
		CacheMapTest test  = new CacheMapTest();
		Map<Integer, String> cacheMap = test.new LRUCache<>(128, 0.75f, true);
		for (int i = 0; i < 10; i++) {
			cacheMap.put(i, "A" + i);
		}
		cacheMap.get(5);
		cacheMap.get(6);
		cacheMap.put(100, "A" + 100);
		
		Set<Entry<Integer,String>> entrySet = cacheMap.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
		
		
	}
	
	class LRUCache<K,V> extends LinkedHashMap<K, V>{
		
		public LRUCache(int initialCapacity, float loadFactor, boolean accessOrder) {
			super(initialCapacity, loadFactor, accessOrder);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected boolean removeEldestEntry(Entry<K, V> eldest) {
			// TODO Auto-generated method stub
			return size() > 10;
		}
		
	}

}
