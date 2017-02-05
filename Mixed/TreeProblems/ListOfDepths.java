import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by twinklesharma on 1/27/17.
 */
public class ListOfDepths {
    ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root){

        ArrayList<LinkedList<TreeNode>> result=new ArrayList<LinkedList<TreeNode>>();
        LinkedList<TreeNode> current=new LinkedList<>();
        if(root!=null){
            current.add(root);
        }

        while(current.size()>0){
            result.add(current);
            LinkedList<TreeNode> parents=current;
            current= new LinkedList<TreeNode>();
            for(TreeNode parent: parents){
                if(parent.left!=null)
                    current.add(parent.left);
                if(parent.right!=null)
                    current.add(parent.right);

            }


        }

        return result;
    }





}
