import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by twinklesharma on 2/27/17.
 */
public class ContinuousSubArraySum {
    static int sum[];
    int n;

    public ContinuousSubArraySum(int n) {
       sum=new int[n];
    }

    public static void makeSum(int arr[],int n){
        int temp=0;
        for(int i=n-1;i>=0;i--){
            temp+=arr[i];
            sum[i]=temp;

        }
        System.out.println(Arrays.toString(sum));
    }

    public static int returnSum(int first,int last){
        return sum[first]-sum[last];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        ContinuousSubArraySum ob=new ContinuousSubArraySum(n);
        ob.makeSum(arr,n);

        boolean isSum = isContSubArrSum(arr, n - 1, k);
        System.out.println(isSum);

    }

    private static boolean isContSubArrSum(int[] arr, int i, int k) {
        if(k<0 || i<1)
            return false;
        else{
            boolean op=isContSubArrSum(arr,i-1,k);
            for(int j=i-1;j>=0;j--){
                op|=returnSum(j,i)%k==0;
            }
            return op;
        }
    }

}
