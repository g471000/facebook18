
public class Runner {
	public static void main(String[] args) {
		LRUCacheAllInOne lru = new LRUCacheAllInOne(2);
		lru.put(1, 1);
		lru.put(2, 2);
		System.out.println(lru.get(1));
		lru.put(3, 3);
		System.out.println(lru.get(2));
		lru.put(4, 4);
		System.out.println(lru.get(1));
		System.out.println(lru.get(3));
		System.out.println(lru.get(4));

		// LRULList list = new LRULList();
		// list.insertEnd(3);
		// list.insertEnd(1);
		// list.insertEnd(4);
		// System.out.println(list.head);
		// list.removeFront();
		// System.out.println(list.head);
		// list.removeFront();
		// System.out.println(list.head);
		// list.removeFront();
		// System.out.println(list.head);
		// list.removeFront();
		// System.out.println(list.head);
		// System.out.println();
		//
		// LRUCache cache = new LRUCache(2);
		// cache.put(1, 1);
		// cache.put(2, 2);
		// System.out.println(cache.list.head);
		//
		// System.out.println(cache.get(1));
		//
		// cache.put(3, 3);
		// System.out.println(cache.list.head);
		//
		// System.out.println(cache.get(2));
		// cache.put(4, 4);
		// System.out.println(cache.list.head);
		//
		// System.out.println(cache.get(1));
		// System.out.println(cache.get(3));
		// System.out.println(cache.get(4));
		//

	}
}
