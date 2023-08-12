package task5.Competitor;

public class Cat extends Competitor {
    public Cat(int maxDistance, int maxJump, String name) {
        super(maxDistance, maxJump, name);
    }
    @Override
    public void toJump(){
        System.out.println("task5.Competitor.Competitor.Cat is jumping");
    }
    @Override
    public void toRun(){
        System.out.println("task5.Competitor.Competitor.Cat is running");
    }
}
