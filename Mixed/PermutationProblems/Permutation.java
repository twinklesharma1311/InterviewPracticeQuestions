import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by twinklesharma on 1/15/17.
 */
public class Permutation {


    public static boolean isPermutationOfPalindrome(String str) {
        HashMap<Character, Integer> countTable = buildHashTable(str);
        System.out.println(countTable);

        return checkMaxOneOdd(countTable);

    }

    public static HashMap<Character, Integer> buildHashTable(String str) {
        HashMap<Character, Integer> countTable = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch !=' ') {
                if (countTable.containsKey(ch)) {
                    countTable.put(ch, countTable.get(ch) + 1);
                } else {

                    countTable.put(ch, 1);

                }
            }
        }
        return countTable;

    }

    public static boolean checkMaxOneOdd(HashMap<Character, Integer> countTable) {
        Set<Character> char_set = countTable.keySet();
        boolean foundOdd = false;
        for (Character c : char_set) {

            Integer num = countTable.get(c);
            if (num % 2 == 1) {
                if (foundOdd) {
                    return false;
                }

                foundOdd = true;
            }

        }


        return true;

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean isPermutation = isPermutationOfPalindrome(str);
        System.out.println(isPermutation);

    }
}
