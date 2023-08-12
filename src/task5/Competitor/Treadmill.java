package task5.Competitor;

import task5.Competitor.Competitor;
import task5.Competitor.Obstacle;

public class Treadmill extends Obstacle {

    public Treadmill(int height, int length, String model) {
        super(height, length, model);
    }
    @Override
    public boolean overCome(Competitor competitor){
        return super.getLength()< competitor.getMaxDistance();
    }
    @Override
    public int checkingObstacle(Competitor competitor){
        return super.getLength();
    }
}
