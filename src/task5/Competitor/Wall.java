package task5.Competitor;

import task5.Competitor.Competitor;
import task5.Competitor.Obstacle;

public class Wall extends Obstacle {
    public Wall(int height, int length, String model) {
        super(height, length, model);
    }
    @Override
    public boolean overCome(Competitor competitor){
        return super.getHeight()< competitor.getMaxJump();
    }
    @Override
    public int checkingObstacle(Competitor competitor){
        return super.getHeight();
    }
}
