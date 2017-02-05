import java.util.Scanner;

/**
 * Created by twinklesharma on 1/24/17.
 */
public class ArrayToString {
    public static void main(String args []){
        Scanner in=new Scanner(System.in);

      String s=in.next();
        char arr[]=s.toCharArray();
       int n=s.length();
        String op=convert(arr,n);
        System.out.println(op);


    }

    public static String convert(char []a, int n) {
        if(n==0)
        return "";
        else{
            char c=a[n-1];
            return convert(a,n-1)+c;

        }


    }
}
