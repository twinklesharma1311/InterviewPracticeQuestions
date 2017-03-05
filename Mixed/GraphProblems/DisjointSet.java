import java.util.Arrays;

/**
 * Created by twinklesharma on 2/15/17.
 */
public class DisjointSet {
   int parent[];
    int rank[];
    //makes n sets in which each element is representative of itself
    public void makeSet(int n){
        rank=new int[n];
        parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;

        }

    }
   //finds representative of i in the set
    public int find(int i){
        if(parent[i]==i)
        {
            return i; //means i is representative of itself
        }
        else
        {
            parent[i]=find(parent[i]);
            return parent[i];
        }


    }

    //makes a union of set containing i and set containing j
    public void union(int i, int j){
        int irep=find(i);
        int jrep=find(j);

       if(rank[irep]>rank[jrep]){

           parent[jrep]=irep;

       }else if(rank[irep]<rank[jrep]){

           parent[irep]=jrep;
       }
        else{
           parent[jrep]=irep;
           rank[irep]++;

       }

    }

    public static void main(String[] args) {
        DisjointSet ob=new DisjointSet();
        ob.makeSet(5);
        ob.union(0,1);
       ob.union(1,2);
       ob.find(1);
       ob.union(2,3);
        ob.union(3,4);
        ob.find(3);
        System.out.println();
    }
}
