import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Twinkle on 2/8/2016.
 */


class Node {
    int data;
    Node leftptr;
    Node rightptr;

    public Node(int data) {
        this.data = data;

    }
}

class Tree {
    Node root;

    void insertNode(int data) {
        root=insert(root,new Node(data));
    }

       Node insert(Node root, Node newNode )
       {
           if(root==null){
               return newNode;
           }

           else if (root.data>=newNode.data){
               root.leftptr=insert(root.leftptr,newNode);
           }
           else
           {
               root.rightptr=insert(root.rightptr,newNode);
           }
           return root;
       }


    void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.data+" ");
            preOrderTraversal(root.leftptr);
            preOrderTraversal(root.rightptr);
        }

    }

    void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        } else {

            inOrderTraversal(root.leftptr);
            System.out.print(root.data+" ");
            inOrderTraversal(root.rightptr);
        }

    }

    void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        } else {

            postOrderTraversal(root.leftptr);
            postOrderTraversal(root.rightptr);
            System.out.print(root.data+" ");
        }

    }


    void bfsTraversal(Node root)
    {
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {   Node n=q.remove();
            System.out.print(n.data+" ");
            if(n.leftptr!=null)
            {
                q.add(n.leftptr);
            }
            if(n.rightptr!=null)
            {
                q.add(n.rightptr);
            }

        }

    }
}

public class TreeDemo {
    public static void main(String args[]) {
        Tree t = new Tree();
        t.insertNode(10);
        t.insertNode(5);
        t.insertNode(3);
        t.insertNode(8);
        t.insertNode(12);
        t.insertNode(1);
        t.insertNode(9);
        t.insertNode(20);
        t.insertNode(15);
        t.insertNode(2);
        System.out.println("preorder traversal is- ");
        t.preOrderTraversal(t.root);
        System.out.println();
        System.out.println("inorder traversal is- ");
        t.inOrderTraversal(t.root);
        System.out.println();
        System.out.println("postorder traversal is- ");

        t.postOrderTraversal(t.root);
        System.out.println();
        System.out.println("BFS traversal is- ");
        t.bfsTraversal(t.root);

    }

}
