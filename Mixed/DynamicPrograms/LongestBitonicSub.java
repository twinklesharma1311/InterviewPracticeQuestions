/**
 * Created by twinklesharma on 2/25/17.
 */
public class LongestBitonicSub {

    public static void main(String[] args) {
        int arr[]= {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5,
                13, 3, 11, 7, 15};
        int maxLength=longestBitonicSub(arr,arr.length-1);
        System.out.println("lbs: "+ maxLength);
    }

    private static int longestBitonicSub(int[] arr, int n) {
        int lds[]=new int[n+1];
        int lis[]=new int[n+1];
        for (int i=0;i<=n;i++){
            lds[i]=1;
            lis[i]=1;
        }
        //lis
        for(int i=1;i<=n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i] && lis[i]<lis[j]+1){
                    lis[i]=lis[j]+1;
                }
            }
        }

        //lds
        for (int i=n-1;i>=0;i--){
            for(int j=i+1;j<=n;j++){
                if(arr[j]<arr[i] && lds[i]<lds[j]+1){
                    lds[i]=lds[j]+1;
                }
            }
        }

        //max
        int max=lds[0]+lis[0]-1;
        for(int i=1;i<=n;i++){
            max=Math.max(max,lds[i]+lis[i]-1);
        }

        return max;
    }

}
