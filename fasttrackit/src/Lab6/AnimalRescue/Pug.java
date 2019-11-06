package Lab6.AnimalRescue;

public class Pug extends Dog {

    @Override
    public void eat(){
        System.out.println("Eats bones");
    }

    @Override
    public void speak() {
        System.out.println("Woof");
    }

    public void sleep() {
        System.out.println("ZzZzZzZz");
    }
}
