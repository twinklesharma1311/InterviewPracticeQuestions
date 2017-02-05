/**
 * Created by twinklesharma on 1/26/17.
 */
public class CheckBalanced {

    boolean isBalanced(TreeNode root){

            return checkHeight(root)!=Integer.MIN_VALUE;
    }

    int checkHeight(TreeNode root){
        if(root==null) return -1;
        int left_height=checkHeight(root.left);
        if(left_height==Integer.MIN_VALUE) return Integer.MIN_VALUE;
        int right_height=checkHeight(root.right);
        if(right_height==Integer.MIN_VALUE) return Integer.MIN_VALUE;

        if(Math.abs(left_height-right_height)>1)
            return Integer.MIN_VALUE;
        else
            return Math.max(left_height,right_height)+1;


    }


}
