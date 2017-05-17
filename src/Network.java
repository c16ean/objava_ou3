import java.util.HashMap;

/**
 * Created by erika on 2017-05-17.
 */
public class Network {
    private HashMap<Position,Node> theNetwork;
    private int xSize, ySize, distanceRowCol, searchDistance;


    public Network(int xSize, int ySize, int distanceRowCol, int searchDistance) {
        this.xSize = xSize;
        this.ySize = ySize;
        this.distanceRowCol = distanceRowCol;
        this.searchDistance = searchDistance;
        theNetwork = new HashMap<>();


        for (int i=0; i<xSize; i++){
            for (int j=0; i<ySize; j++) {
                Node n = new Node(i * distanceRowCol, j * distanceRowCol);
                for (Position pos: theNetwork.keySet()){

                    if ( Math.sqrt(Math.pow(n.getPos().getX() - pos.getX(),2)
                            + Math.pow(n.getPos().getY()- pos.getY(),2)) <= searchDistance){


                    }
                }
                theNetwork.put(n.getPos(), n);
            }
        }
    }

    public void addEvent(){

    }

    public void timeTick(){

    }
}
