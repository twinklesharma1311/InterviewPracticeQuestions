import java.util.*;
import java.io.*;


/**
 * Created by Twinkle on 2/9/2016.
 */
public class HashingDemo {
    public static boolean bracket(String str) {
        Character c1, c2;
        if (str.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stk = new Stack<>();
        HashMap<Character, Character> myHash = new HashMap<>();
        myHash.put(')', '(');
        myHash.put(']', '[');
        myHash.put('}', '{');
        myHash.put('>', '<');

        for (int i = 0; i < str.length(); i++) {
            c1 = str.charAt(i);
            if (myHash.values().contains(c1)) {
                stk.push(c1);
            } else {
                if (stk.isEmpty())
                    return false;
                c2 = stk.pop();
                if (c2 != myHash.get(c1))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner s = new Scanner(new File("demo.txt"));
        int num = s.nextInt();
        for (int i = 1; i <= num; i++) {
            String str = s.next();
            boolean b = bracket(str);
            System.out.println("case " + i + ": " + b);

        }


    }

}