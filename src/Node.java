import java.util.ArrayList;

/**
 * Created by erika on 2017-05-17.
 */
public class Node {
    private ArrayList<Node> neighbourList;
    private Position pos;

    public Node(int x, int y) {
        pos = new Position(x,y);
        neighbourList = new ArrayList();
    }

    public Position getPos() {
        return pos;
    }

    public void updateNeighbours(Node neighbour){
        neighbourList.add(neighbour);
    }
}
