package Week10.yl28;

import java.util.ArrayList;
import java.util.List;

public class Main implements Movable{
    private List<Movable> groupList;

    public Main() {
        this.groupList = new ArrayList<Movable>();
    }

    public void addToGroup(Movable movable){
        this.groupList.add(movable);
    }

    @Override
    public String toString() {
        StringBuilder position = new StringBuilder();
        for(Movable temp : this.groupList){
            Organism temp_o = (Organism) temp;
            position.append(temp_o.toString());
            position.append("\n");
        }
        return position.toString();
    }



    @Override
    public void move(int x, int y) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (Movable item : groupList) {
            item.move(x, y);
        }
    }
}
