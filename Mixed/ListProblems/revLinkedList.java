import java.util.LinkedList;
import java.util.List;

/**
 * Created by twinklesharma on 2/20/17.
 */
public class revLinkedList {

    public static void main(String[] args) {

        ListNode node1=new ListNode(10);
        ListNode node2=new ListNode(8);
        ListNode node3=new ListNode(6);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(2);
        ListNode head=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        System.out.println("List is: ");
        print(head);
        head=reverseList(head);
        System.out.println("Reversed List is: ");
        print(head);

    }

    public static ListNode reverseList(ListNode head){
            if(head==null) return null;
            else {
                    ListNode prev=null;
                    ListNode curr=head;
                    ListNode next=head.next;

                    while(next!=null){
                        curr.next=prev;
                        prev=curr;
                        curr=next;
                        next=curr.next;
                    }
                    curr.next=prev;
                    head=curr;
                    return head;

            }

    }
    public static void print(ListNode head){
        ListNode curr=head;
            while(curr!=null){
                System.out.print(curr.data+" ");
                curr=curr.next;
            }
        System.out.println();
    }

}
class ListNode{
    int data;
    ListNode next;
    public ListNode(int data){
        this.data=data;
        this.next=null;
    }

}
