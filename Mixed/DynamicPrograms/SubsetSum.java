import java.util.Scanner;

/**
 * Created by twinklesharma on 1/24/17.
 */
public class SubsetSum {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

        }
        int sum = in.nextInt();
        boolean isSumRecur=isSubsetSumRecursive(n,arr,sum);
        boolean isSumDP = isSubsetSumDP(n, arr, sum);
        System.out.println(isSumRecur);
        System.out.println(isSumDP);


    }


    public static boolean isSubsetSumRecursive(int n, int[] arr, int sum) {
        if (n == 0 && sum != 0)
            return false;
        else if (sum == 0)
            return true;
        else {
            if (arr[n - 1] > sum)
                return isSubsetSumRecursive(n - 1, arr, sum);
            else
            return isSubsetSumRecursive(n - 1, arr, sum) || isSubsetSumRecursive(n - 1, arr, sum - arr[n - 1]);

        }


    }

    public static boolean isSubsetSumDP(int n, int[] arr, int k) {
        boolean[][] isSubsetSum = new boolean[n + 1][k + 1];

        //base cases
        for (int i = 0; i <= n; i++)
            isSubsetSum[i][0] = true;
        for (int j = 1; j <= k; j++)
            isSubsetSum[0][j] = false;


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {


                //when element is > sum we can't take it so we decrease number of elements by 1
                if (arr[i-1] >j)
                    isSubsetSum[i][j] = isSubsetSum[i - 1][j];
                else{

                        isSubsetSum[i][j] = isSubsetSum[i - 1][j] || isSubsetSum[i - 1][j - arr[i - 1]];
                }
            }
        }

        return isSubsetSum[n][k];

    }


}
