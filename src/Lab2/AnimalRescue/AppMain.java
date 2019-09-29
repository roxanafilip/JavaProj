package Lab2.AnimalRescue;

public class AppMain {

    public static void main  (String [] args) {
        Cat Puffy = new Cat();
        Adopter adopter = new Adopter();
        Animal animal = new Animal();
        Food food = new Food();
        RecreationActivity activity = new RecreationActivity();
        Veterinarian veterinarian = new Veterinarian();

        System.out.println(Puffy.name);
        Puffy.meows ();
        Puffy.run ();
        Puffy.sleep();

        System.out.println("The name of the adopter is " + adopter.name + ".");
        System.out.println("The animal name is " + animal.name +". It's " + animal.age + " age." + " And the favourite food is " + food.name + ".");
        System.out.println("The favourite activity is " + animal.favouriteActivity + ".");
        System.out.println("The name of the veterinarian is " + veterinarian.name+ ".");


    }
}
