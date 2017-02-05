import java.util.Scanner;

/**
 * Created by twinklesharma on 1/26/17.
 */
public class MinimalBST {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();

        }
        TreeNode node=createMinBST(arr,0,arr.length-1);

    }


    static TreeNode createMinBST(int arr[],int start, int end){

        if(end<start) return new TreeNode();

        int mid=(start+end)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=createMinBST(arr,start,mid-1);
        root.right=createMinBST(arr,mid+1,end);

        return root;

    }
}
