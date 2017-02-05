import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Twinkle on 2/10/2016.
 */
public class NumberToWord {
    public static void convert(int num)
    {int rem;
        HashMap<Integer, String> myHash= new HashMap<>();
        StringBuilder st= new StringBuilder();
        myHash.put(0,"zero");
        myHash.put(1,"one");
        myHash.put(2,"two");
        myHash.put(3,"three");
        myHash.put(4,"four");
        myHash.put(5,"five");
        myHash.put(6,"six");
        myHash.put(7,"seven");
        myHash.put(8,"eight");
        myHash.put(9,"nine");

        while(num!=0)
        {
            rem=num%10;
            st.insert(0,myHash.get(rem)+" ");
            num=num/10;
        }
        System.out.println(st);

    }

    public static void main(String args [])
    {
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        convert(num);
    }
}
