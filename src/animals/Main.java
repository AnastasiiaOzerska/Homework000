package animals;

public class Main {
    public static void main(String[] args) {


    Animal animal = new Animal("Bob", 5);
    Cat murzik = new PersianCat("Murzik", 3, 3, "red");
    Cat cat = new Cat("Kyzia", 2, 1);
    PersianCat pushok = new PersianCat("Pushok", 3, 3, "white");
    Animal bobik = new Dog("Bobik", 5);


    animal.selfRepresentation(animal);
    murzik.scream();
    cat.scream();
    pushok.scream(pushok);
    bobik.selfRepresentation(bobik);
    bobik.makeSound();
    murzik.makeSound();




}}
