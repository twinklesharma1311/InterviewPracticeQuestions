import java.util.LinkedList;
import java.util.List;

/**
 * Created by twinklesharma on 1/28/17.
 */
public class Permuation {
    public static void main(String[] args) {
        int[] nums = new int[2];
        nums[0]=1;
        nums[1]=2;
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        return permute(nums,nums.length);
    }

    public static  List<List<Integer>> permute(int[] nums, int n) {
        List<List<Integer>> output=new LinkedList<>();

        if(n>0)
        {
            int last=nums[n-1];
            List<List<Integer>> list=permute(nums,n-1);


            if(list.isEmpty()) list.add(new LinkedList<>());

            for(List<Integer> innerList: list){
                List<List<Integer>> updatedList=insertAtPosition(innerList,last);
                output.addAll(updatedList);
            }


        }

        return output;

    }

    public static  List<List<Integer>> insertAtPosition(List<Integer>list, int number){
        List<List<Integer>> output=new LinkedList<>();
        for(int i=0;i<=list.size();i++){
            List<Integer> temp=new LinkedList<>();
            for(Integer x: list){
                temp.add(new Integer(x));
            }
            temp.add(i,number);
            output.add(temp);
        }
        return output;

    }
}
