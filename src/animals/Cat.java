package animals;

public class Cat extends Animal{
    private int weight;

    public Cat(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void makeSound() {
        System.out.println("meow meooow meow");
    }
    public void scream(){
        System.out.println("cat is screaming");
    }



}

