import java.io.File;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by twinklesharma on 1/4/17.
 */
public class Acronym {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner in = new Scanner(new FileInputStream("test1.txt"));
        int count = in.nextInt();
        in.nextLine();
        while (count != 0) {
            String str = in.nextLine();
            String acronym = makeAcronym(str);
            System.out.println(acronym);
            count--;
        }
    }

    public static String makeAcronym(String longName) {
        StringBuilder acronym = new StringBuilder();
        longName = longName.trim();
        if(!longName.isEmpty()) {
            HashSet<String> hash = new HashSet<>();
            hash.add("of");
            hash.add("the");
            hash.add("and");

            for (String s : longName.split(" ")) {
                if(!s.isEmpty() && !hash.contains(s))
                    acronym.append(s.charAt(0));

            }

        }
        return acronym.toString().toUpperCase();
    }

}

