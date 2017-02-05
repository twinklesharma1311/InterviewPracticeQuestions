import java.util.LinkedList;

/**
 * Created by twinklesharma on 1/27/17.
 */
public class PathExists {

    public boolean isPathExist(Graph g, Vertex start, Vertex dest){

        if(start==dest)
            return true;
        for(Vertex v:g.getNodes()){
            v.seen=false;
        }
        LinkedList<Vertex> q=new LinkedList<>();
        q.add(start);
        start.seen=true;
        Vertex u;

        while(!q.isEmpty()){
            u=q.remove();
            for(Vertex v: u.getAdj()){
                if(v.seen==false){

                    if(v==dest) return true;
                    else{
                        q.add(v);
                        v.seen=true;

                    }
                }




            }

        }
        return false;
    }

}
