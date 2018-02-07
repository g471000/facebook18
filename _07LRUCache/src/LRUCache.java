import java.util.*;

public class LRUCache {
	private int capacity;
	private int size;
	LRULList list;
	private HashMap<Integer, Integer> map;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		size = 0;
		map = new HashMap<>();
		list = new LRULList();
	}

	public void put(int key, int value) {
		if (capacity <= size) {
			map.remove(list.removeFront());
		}
		list.insertEnd(key);
		map.put(key, value);
		size++;
	}
	
	public int get(int key) {
		if(map.containsKey(key)) {
			list.remove(key);
			list.insertEnd(key);
			return map.get(key);
		} else {
			return -1;
		}
	}
}
