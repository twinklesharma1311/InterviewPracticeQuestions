import java.util.LinkedList;

/**
 * Created by twinklesharma on 1/27/17.
 */
public class Vertex {
    int data;
    boolean seen;
    LinkedList<Vertex> adjList=new LinkedList<>();

    public Vertex(int data) {
        this.data = data;
        this.seen=false;
        this.adjList=null;

    }

    LinkedList<Vertex> getAdj(){
        return adjList;


    }
}
