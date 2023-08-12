package task5.Competitor;

import task5.Competitor.Competitor;

public class Human extends Competitor {
    public Human(int maxDistance, int maxJump, String name) {
        super(maxDistance, maxJump, name);
    }
    @Override
    public void toJump(){
        System.out.println("task5.Competitor.Human is jumping");
    }
    @Override
    public void toRun(){
        System.out.println("task5.Competitor.Human is running");
    }
}
