/**
 * Created by twinklesharma on 1/21/17.
 */
public class Insertion {

    public static void main(String[] args) {

        int val=insertion(3,155,2,4);
        System.out.println(val);
    }
    public static int insertion(int m,int n, int i, int j){
int allone=~0;
int left=allone<<(j+1);
int right=((1<<i)-1);
 int mask=left|right;
 n=n&mask;
 m=m<<i;


return n|m;

    }
}
