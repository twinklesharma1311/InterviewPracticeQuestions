/**
 * Created by Twinkle on 2/10/2016.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


class OperatingSystem implements Comparable<OperatingSystem>{
    String name;
    int count;

    public OperatingSystem(String name, int count){
        this.name=name;
        this.count=count;
    }
    @Override
    public int compareTo(OperatingSystem o) {
        return this.count-o.count;
    }

    @Override
    public String toString() {
        return name + " " + count ;
    }
}
public class OS {

    public static void main(String args[]) throws FileNotFoundException
    {
        Scanner s= new Scanner(new File("demo.txt"));
        HashMap<String,Integer> myHash=new HashMap<>();
        s.nextLine();

        while(s.hasNext())
        {
            s.next();
            s.next();
            s.next();
            String str=s.next();
            if(myHash.containsKey(str))
            {
                myHash.put(str,myHash.get(str)+1);
            }
            else
            {
                myHash.put(str,1);
            }

        }
        Iterator<String> iter = myHash.keySet().iterator();
        ArrayList<OperatingSystem> arr = new ArrayList<>();
        while (iter.hasNext()){
            String curr = iter.next();
            OperatingSystem os = new OperatingSystem(curr,myHash.get(curr));
            arr.add(os);
        }


        Collections.sort(arr);
        Collections.reverse(arr);
        System.out.println(arr);


    }


}
