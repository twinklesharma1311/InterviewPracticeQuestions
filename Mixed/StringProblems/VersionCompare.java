import java.util.Arrays;
import java.util.Comparator;

/**
 * Given a array of version numbers, Return the sorted version numbers
 */
public class VersionCompare {
    public static void main(String[] args) {
        String[] arr = {"1.0", "5.5", "1.0.0.0.9", "2.5", "10.5", "1"};
        Arrays.sort(arr, new VersionNumberComparator());
        System.out.println(Arrays.toString(arr));
    }
}

class VersionNumberComparator implements Comparator<String> {

    @Override
    public int compare(String version1, String version2) {
        String v1[] = version1.split("\\.");
        String v2[] = version2.split("\\.");
        int counter = 0;
        int maxlength = Math.max(v1.length, v2.length);
        while (counter < maxlength) {

            int c1 = counter < v1.length ? Integer.parseInt(v1[counter]) : 0;
            int c2 = counter < v2.length ? Integer.parseInt(v2[counter]) : 0;

            if (c1 == c2) {
                counter++;
            } else if (c1 > c2) {
                return -1;
            } else if (c1 < c2) {
                return 1;
            }
        }
        return 0;

    }
}
