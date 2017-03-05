import org.omg.CORBA.INTERNAL;

/**
 * Created by twinklesharma on 2/27/17.
 */
public class absoluteDiffTree {

    static class Result {
        long min;
        long max;
        long minDiff;

        public Result(long min, long max, long minDiff) {
            this.min = min;
            this.max = max;
            this.minDiff = minDiff;
        }
    }

    public static void main(String[] args) {
        BSTNode one = new BSTNode(6);
        BSTNode two = new BSTNode(4);
        BSTNode three = new BSTNode(9);
        BSTNode four = new BSTNode(1);
        BSTNode five = new BSTNode(15);
        one.left = two;
        one.right = three;
        two.left = four;
        three.right = five;

        Result ob = minAbsoluteDiff(one);
        System.out.println(ob.minDiff);
    }

    public static Result minAbsoluteDiff(BSTNode root) {

        if (root == null) {
            return new Result(Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);

        } else if (root.left == null && root.right == null) {

            return new Result(root.val, root.val, Integer.MAX_VALUE);
        } else {
            Result obl = minAbsoluteDiff(root.left);
            Result obr = minAbsoluteDiff(root.right);
            long max = Math.max(obr.max, root.val);
            long min = Math.min(root.val, obl.min);
            long minDiffl = Math.min(Math.abs(root.val - obl.max), obl.minDiff);
            long minDiffr = Math.min(Math.abs(obr.min - root.val), obr.minDiff);
            long minDiff = Math.min(minDiffl, minDiffr);
            return new Result(min, max, minDiff);

        }

    }
}

class BSTNode {
    int val;
    BSTNode left;
    BSTNode right;

    BSTNode(int x) {
        val = x;
    }
}
