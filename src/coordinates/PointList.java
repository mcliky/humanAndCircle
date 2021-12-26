package coordinates;

import java.util.ArrayList;
import java.util.List;

public class PointList  {
    private final List<Double> pointList = new ArrayList<>();



    public void add(double x,double y) {
    pointList.add(x);
    pointList.add(y);
    }
    public int size(){
        return pointList.size();
    }
    public double getIndex(int index){
        return pointList.get(index);
    }
}
