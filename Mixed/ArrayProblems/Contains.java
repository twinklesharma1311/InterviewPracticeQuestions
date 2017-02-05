import java.util.Scanner;

/**
 * Created by twinklesharma on 1/24/17.
 */
public class Contains {

    public static void main(String args []){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();

        }
        boolean val=contains(arr,n,k);
        System.out.println(val);


    }

    public static boolean contains(int []a,int n,int k){
        if(n==0)
            return false;
        else{
            int i=a[n-1];
            if(i==k) return true;
            else
            return contains(a,n-1,k);


        }

    }


}
