import java.util.List;
import java.util.Scanner;

/**
 * Created by twinklesharma on 1/24/17.
 */
public class SumList {
    public static void main(String args []){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();

        }
        int sum=sumList(arr,n);
        System.out.println(sum);


    }

    public static int sumList(int []a,int n){
        if(n==0)
        return 0;
        else{
            int i=a[n-1];
            return i+sumList(a,n-1);


        }

    }


}
