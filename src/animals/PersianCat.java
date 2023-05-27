package animals;

public class PersianCat extends Cat{
    private String colour;
    public PersianCat(String name, int age, int weight, String colour) {
        super(name, age, weight);
        this.colour = colour;

    }


    public void scream(PersianCat cat) {
        System.out.println(cat.getName() + " is screaming");
    }
}
