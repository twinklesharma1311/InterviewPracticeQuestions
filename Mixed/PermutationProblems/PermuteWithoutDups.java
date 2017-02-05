import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by twinklesharma on 2/1/17.
 */
public class PermuteWithoutDups {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        ArrayList<String> arr=permuteWithoutDups(s);
        System.out.println("arr = " + arr);
    }
    public static ArrayList<String> permuteWithoutDups(String str){
        if(str==null) return null;

        ArrayList<String> op=new ArrayList<>();
        if(str.length()==0){
            op.add("");
            return op;
        }

        char first=str.charAt(0);
        String remainder=str.substring(1);
        ArrayList<String> words=permuteWithoutDups(remainder);
        for(String word:words){
            for(int j=0;j<=word.length();j++) {
                String s = insertCharAt(word, j, first);
                op.add(s);

            }

        }

        return op;
    }

    public static String insertCharAt(String word,int j,char first){
        String beg=word.substring(0,j);
        String end=word.substring(j);
        return beg+first+end;

    }


}
