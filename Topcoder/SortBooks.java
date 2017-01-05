import java.util.*;

/**
SortBooks 
https://community.topcoder.com/stat?c=problem_statement&pm=4557&rd=7996
**/
public class SortBooks{
    
    
    HashSet<String> hash=new HashSet<>();
     public int[] checkManually(String[] field1, String[] field2){
        hash.add("the");
        hash.add("and");
        hash.add("of");
     ArrayList<Integer> arr=new ArrayList<>(field1.length);
         for(int i=0;i<field1.length;i++){
         boolean isFirstTitle=checkTitle(field1[i]);
         boolean isSecondTitle=checkTitle(field2[i]);
         if(!(isFirstTitle ^ isSecondTitle))
             arr.add(i);
         }
     
     int[] output = new int[arr.size()];
         for(int i=0;i<arr.size();i++){
         output[i]=arr.get(i);
         }
       return output;
     }
    
   public  Boolean checkTitle(String field){
    String words[]=field.split(" ");
       int count=0;
            for(int i=0;i<words.length;i++){
                if(!words[i].isEmpty()){
                    count++;
            if(hash.contains(words[i].toLowerCase())) return true;
            }
                }
            return count>3;
        }
}