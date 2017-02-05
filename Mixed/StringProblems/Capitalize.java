import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by twinklesharma on 1/24/17.
 */
public class Capitalize {
    public static void main(String args []){
        Scanner in=new Scanner(System.in);

        String s=in.next();
        String p=in.next();
        List<String> list1=capitalizeAllChar(s);
        List<String> list2=capitalizeOnlyPattern(s,p);
        System.out.println("capital all chars :"+list1);
        System.out.println("capital chars only in pattern :"+list2);


    }
    public static List<String> capitalizeAllChar(String s) {

        if(s.isEmpty())
        {

            List<String> temp=new LinkedList<>();
            temp.add("");
            return temp;
        }
        else{
            char c=s.charAt(0);
            List<String> result=new LinkedList<>();
            List<String> l=capitalizeAllChar(s.substring(1));

            concatenate(c,l,result);
            concatenate(Character.toUpperCase(c),l,result);


            return result;

        }


    }

    public static List<String> capitalizeOnlyPattern(String s, String pattern) {

        if(s.isEmpty())
        {

            List<String> temp=new LinkedList<>();
            temp.add("");
            return temp;
        }
        else{
            char c=s.charAt(0);
            List<String> result=new LinkedList<>();
            List<String> l=capitalizeOnlyPattern(s.substring(1),pattern);

            concatenate(c,l,result);
            if(pattern.contains(String.valueOf(c))){
                concatenate(Character.toUpperCase(c),l,result);
            }

            return result;

        }


    }

    public static void concatenate(char c, List<String> l, List<String> result){

        for(String s:l){
            result.add(c+s);
        }



    }



}
