import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by twinklesharma on 2/1/17.
 */
public class PowerSet {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        char arr[]=s.toCharArray();
         List<List<Character>> op=  findPowerSet(arr);
        System.out.println(op);
    }

    public static List<List<Character>> findPowerSet(char set[]){
        int n=set.length;
        int max=1<<set.length;
        List<List<Character>> oplist=new LinkedList<>();

        for(int i=0;i<max;i++){
            List<Character> list=new LinkedList<>();
            for(int j=0;j<n;j++){

                if(((i>>j)&1)==1)
                list.add(set[j]);

            }
            oplist.add(list);

        }
return oplist;

    }
}
