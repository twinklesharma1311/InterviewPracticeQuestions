import java.util.HashMap;

class DLLNode {
    final int key;
    int value;
    DLLNode prev;
    DLLNode next;
    public DLLNode(int key, int value){
        this.key=key;
        this.value=value;
        this.prev=null;
        this.next=null;
    }

}
class DoublyLinkedList {

    private DLLNode head;
    private DLLNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    void addToFront(DLLNode d) {
        if (head == null) {
            head = d;
            d.next = null;
            d.prev = null;
            tail = d;
        } else {
            d.next = head;
            d.prev = null;
            head.prev = d;
            head = d;
        }
    }

    DLLNode removeFromEnd() {
        if(tail!=null){
            DLLNode d = tail;
            tail = tail.prev;
            if (tail != null) tail.next = null;
            else head=null;
            return d;
        }
        else
            return null;

    }

    private void remove(DLLNode d) {
        if (head.key == d.key) {
            head = d.next;
            if (d.next != null) d.next.prev = null;

        } else if (tail.key == d.key) {
            removeFromEnd();
        } else {
            DLLNode left = d.prev;
            DLLNode right = d.next;
            left.next = right;
            right.prev = left;

        }
    }

    void moveToHead(DLLNode d) {
        remove(d);
        addToFront(d);
    }

}
public class LRUCache {
    private final int capacity;
    private HashMap<Integer, DLLNode> hash;
    private DoublyLinkedList dll;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        hash=new HashMap<>();
        dll=new DoublyLinkedList();
    }

    public  int get(int key) {

        DLLNode d=hash.get(key);
        if(d!=null)
        {dll.moveToHead(d);
            return d.value;}
        else return -1;

    }

    public void put(int key, int value) {
        if(hash.containsKey(key))
        {   DLLNode nValue=hash.get(key);
            nValue.value=value;
            dll.moveToHead(nValue);

        }else{
            if(hash.size()>=capacity){
                DLLNode d=dll.removeFromEnd();
                hash.remove(d.key);
            }
            DLLNode v=new DLLNode(key,value);
            hash.put(key,v);
            dll.addToFront(v);
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache( 2 /* capacity */ );
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // returns 1
        cache.put(3, 3);    // evicts key 2
        cache.get(2);       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        cache.get(1);       // returns -1 (not found)
        cache.get(3);       // returns 3
        cache.get(4);       // returns 4

    }
}




/*
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 *
 */