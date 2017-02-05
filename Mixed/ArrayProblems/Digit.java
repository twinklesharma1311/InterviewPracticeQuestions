import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Twinkle on 2/9/2016.
 */
public class Digit {

    public static ArrayList<Integer> digit(int num)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        while(num!=0)
        {
            arr.add(num%10);
            num=num/10;
        }

        return  arr;

    }

    public static int[] convertToArray(ArrayList<Integer> arr)
    {
        int s = arr.size();
        int[] intArray = new int[s];
        for (int i = 0; i < s; i++) {
            intArray[i] = arr.get(i);
        }
        return intArray;
    }

    public static int[] decOddIndex(int arr[])
    {
        for(int i=1;i<arr.length;i=i+2)
        {
            arr[i]--;

        }

        return arr;
    }

    public static int convertToNum(int arrOdd[])
    {       int sum=0;
        int size=arrOdd.length;
        for(int i=0;i<size;i++)
        {

            sum=sum+(arrOdd[i]*(int)Math.pow(10,i));

        }
        return sum;
    }

    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        ArrayList<Integer> arr=digit(num);
        System.out.println("array form of digit "+arr);
        int array[]=convertToArray(arr);
        //System.out.println(Arrays.toString(array));
        int arrOdd[]=decOddIndex(array);
        System.out.println("after decrementing odd places "+Arrays.toString(arrOdd));
        int data=convertToNum(arrOdd);
        System.out.println("final number is "+data);
    }
}
