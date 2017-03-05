import java.util.Arrays;

/**
 * Created by twinklesharma on 2/22/17.
 */
public class LIS {

    public static void main(String[] args) {
        int arr[]= {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int maxLength=longestIncreasingSub(arr,arr.length-1);
        System.out.println("lis: "+ maxLength);
    }
    public static int longestIncreasingSub(int[] arr,int n){
        int dp[]=new int[n+1];
        int aux[]=new int[n+1];

        for(int i=0;i<=n;i++){
            dp[i]=1;
        }
        for(int i=0;i<=n;i++){
            aux[i]=-1;
        }

        for(int i=1;i<=n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i] && dp[i]<dp[j]+1)
                {   dp[i]=dp[j]+1;
                    aux[i]=j;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(dp));
        int max=dp[0];
        int pos=0;
        for(int i=1;i<=n;i++){
            if(max<dp[i]) {
                max=dp[i];
                pos=i;
            }
        }
        print(pos,arr,aux);
        return max;
    }

    public static void print(int pos,int arr[],int aux[]){
        if(pos==-1){
            return;
        }
        else{
            print(aux[pos],arr,aux);
            System.out.println(arr[pos]);
        }


    }
}
