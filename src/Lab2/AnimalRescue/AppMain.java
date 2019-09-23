package Lab2.AnimalRescue;

public class AppMain {

    public static void main  (String [] args) {
        Cat Puffy = new Cat();

        System.out.println(Puffy.name);
        Puffy.meows ();
        Puffy.run ();
        Puffy.sleep();
    }
}
