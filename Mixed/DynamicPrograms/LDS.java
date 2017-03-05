import java.util.Arrays;

/**
 * Created by twinklesharma on 2/22/17.
 */
public class LDS {
    public static void main(String[] args) {
    int arr[]= {100, 80, 120, 65, 70, 40, 50, 25, 10};
    int maxLength=longestDecreasingSub(arr,arr.length-1);
    System.out.println("lds: "+ maxLength);
}
    public static int longestDecreasingSub(int[] arr,int n){
        int lds[]=new int[n+1];
        int print[]=new int[n+1];

        for(int i=0;i<=n;i++){
            lds[i]=1;
        }
        for(int i=0;i<=n;i++){
            print[i]=-1;
        }

        for(int i=n-1;i>=0;i--){
            for(int j=i+1;j<=n;j++){
                if(arr[j]<arr[i] && lds[i]<lds[j]+1)
                {   lds[i]=lds[j]+1;
                    print[i]=j;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(lds));
        int max=lds[0];
        int pos=0;
        for(int i=1;i<=n;i++){
            if(max<lds[i]) {
                max=lds[i];
                pos=i;
            }
        }
        print(pos,arr,print);
        return max;
    }

    public static void print(int pos,int arr[],int print[]){
        if(pos==-1){
            return;
        }
        else{
            System.out.println(arr[pos]);
            print(print[pos],arr,print);

        }


    }
}
