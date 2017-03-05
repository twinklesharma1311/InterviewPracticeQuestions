import java.util.Scanner;

/**
 * Created by twinklesharma on 2/17/17.
 */
public class OneCharDiff {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        findDiffChar(input1, input2);


    }

    public static void findDiffChar(String str1, String str2) {
        if (Math.abs(str1.length() - str2.length()) != 1) {
            System.out.println("the two strings do not differ by one character");
        } else {
            char c;
            if (str1.length() > str2.length()) {
                c = findDiffChar(str1, str2, 0, 0, str1.length() - 1, str2.length() - 1);
            } else {
                c = findDiffChar(str2, str1, 0, 0, str2.length() - 1, str1.length() - 1);
            }
            System.out.println("the different character is: " + c);

        }


    }

    public static char findDiffChar(String str1, String str2, int first1, int first2, int last1, int last2) {
        while (first1 < last1 && first2 < last2) {
            int mid1 = (first1 + last1) / 2;
            int mid2 = (first2 + last2) / 2;

            if (str1.charAt(mid1) != str2.charAt(mid2)) {
                if (str1.charAt(mid1 - 1) == str2.charAt(mid2))
                    mid1--;
                else if (str1.charAt(mid1 + 1) == str2.charAt(mid2))
                    mid1++;

            }
            //go to either side
            if (count(first1, mid1 - 1) == count(first2, mid2 - 1))
            //number of characters on left side of str1=number of characters on left side of str2
            {
                //go to right side
                first1 = mid1 + 1;
                first2 = mid2 + 1;
            } else if (count(mid1 + 1, last1) == count(mid2 + 1, last2))
            //number of characters on right side of str1=number of characters on right side of str2
            {
                //go to left side
                last1 = mid1 - 1;
                last2 = mid2 - 1;
            }
        }
        //when two characters are left in one string and one is left in another
        if (str1.charAt(first1) != str2.charAt(first1))
            return str1.charAt(first1);
        else
            return str1.charAt(last1);

    }

    public static int count(int beg, int last) {
        return last - beg + 1;

    }

}

