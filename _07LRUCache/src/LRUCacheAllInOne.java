

import java.util.HashMap;

class LRUCacheAllInOne {
    private int capacity;
    private Node head;
    private Node tail;
    private int size;
    private HashMap<Integer, Integer> map;
    public LRUCacheAllInOne(int capacity) {
    	System.out.println("start");
        this.capacity = capacity;
        this.size = 0;
        map = new HashMap<>(); 
        head = new Node(-1);
        tail = new Node(-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            remove(key);
            insertEnd(key);
            return map.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(key);
        }
        else if(size >= capacity){
            map.remove(removeFront());
        } else {
            size++;
        }
        map.put(key, value);
        insertEnd(key);
    }
    
    private int removeFront(){
        if(isEmpty()){
            return -1;
        }
        Node node = head.next;
        head.next = head.next.next;
        head.next.prev = head;
        return node.val;
    }
    
    private int remove(int key){
        Node curr = head.next;
        while(curr != tail){
            if(curr.val == key){
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
                return key;
            }
            curr = curr.next;
        }
        return -1;
    }
    
    private void insertEnd(int key){
        Node newNode = new Node(key);
        newNode.next = tail;
        newNode.prev = tail.prev;
        newNode.prev.next = newNode;
        tail.prev = newNode;
    }
    
    private boolean isEmpty(){
        return head.next == tail && tail.prev == head;
    }

    class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
        
        
    }
}
