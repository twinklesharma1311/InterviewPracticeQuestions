import java.util.Scanner;

/**
 * Created by twinklesharma on 1/22/17.
 */
public class Combination {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        boolean[] A = new boolean[n + 1];
        combination(A, n, k);

    }

    public static void combination(boolean[] A, int n, int k) {

        if (k > n) return;
        else if (k == 0) {
            visit(A);
        } else {
            combination(A, n - 1, k);
            A[n] = true;
            combination(A, n - 1, k - 1);
            A[n] = false;
        }


    }

    public static void visit(boolean[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i])
                System.out.print(i);
        }
        System.out.println();

    }

}
