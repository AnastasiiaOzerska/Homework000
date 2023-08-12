package task5.Competitor;

import task5.Competitor.Competitor;

public class Robot extends Competitor {
    public Robot(int maxDistance, int maxJump, String name) {
        super(maxDistance, maxJump, name);
    }
    @Override
    public void toJump(){
        System.out.println("task5.Competitor.Robot is jumping");
    }
    @Override
    public void toRun(){
        System.out.println("task5.Competitor.Robot is running");
    }
}
