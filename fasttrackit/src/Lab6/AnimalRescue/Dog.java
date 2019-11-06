package Lab6.AnimalRescue;

public abstract class Dog extends Animal {

    @Override
    public void sleep() {
        System.out.println("Zzzz");
    }

    public void eat() {
        System.out.println("Miamm miammm");
    }

    public void speak() {
        System.out.println("Hamm Hammm");
    }

}
