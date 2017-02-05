import java.util.Scanner;

/**
 * Created by Twinkle on 2/10/2016.
 */
public class BinarySearch {
    public static void main(String args [])
    {
        int array[]={1,2,3,4,5,6,7};
        int size=array.length;
        int first=0;
        int last=size-1;
        int mid=0;
        boolean flag=false;
         Scanner s= new Scanner(System.in);
        int search=s.nextInt();
        while(first<=last)
        {
            mid=(first+last)/2;

            if(array[mid]==search)
            {
                flag=true;
                break;
            }
            else if(array[mid]<search)
            {
                first=mid+1;

            }
            else
            {
                last=mid-1;

            }

        }

        if(flag)
            System.out.println("found at " + mid);
        else
            System.out.println("not found");

    }
}
