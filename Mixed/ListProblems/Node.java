/**
 * Created by twinklesharma on 1/29/17.
 */
public class Node {

        int key;
        int value;
        DLLNode prev;
        DLLNode next;
        public Node(int key,int value){
            this.key=key;
            this.value=value;
            this.prev=null;
            this.next=null;
        }


}
