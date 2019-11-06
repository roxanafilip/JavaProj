package Lab2;


public class Main {
    public static void main(String[] args) {
        int x = 15;
        int y = 4;
        int z = 3;
        int w = 100;
        float result = sum(x, y);
        System.out.println(result);
        result = substract(x, y);
        System.out.println(result);
        result = product(x, y);
        System.out.println(result);
        result = divisible(x, y);
        System.out.println(result);

        System.out.println("Rezultatul adunarii este = " + sum(2, 3));
        System.out.println();
        System.out.println("Rezultatul scaderii este = " + substract(4, 3));
        System.out.println();
        System.out.println("Rezultatul inmultirii este = " + product(2, 3));
        System.out.println();
        System.out.println("Rezultatul impartirii este = " + divisible(6, 4));
        System.out.println();
        displayJava();
        System.out.println();
        System.out.println("Media celor trei numere este = " + media(x, y, z));
        System.out.println();
        displaymodel();
        System.out.println();
        System.out.println("Restul impartirii celor doua numere este = " + rest(x, z));
        System.out.println();
        System.out.println("Rezultatul temperaturii in Celsius este:" + grade (y));
        System.out.println();
        System.out.println("Distanta in metri este:" + convertorInchToCm(y));
        System.out.println();
        viteza(w, x, y, z);
    }


 private static int sum (int first, int second) {
     return first + second;
 }
private static int substract (int first, int second){
    return first - second;
 }

private static int product (int first, int second) {
    return first * second;
}

private static float divisible (float first, float second) {
        return first/second;
}

private static void displayJava()  {
    System.out.println("    J   a    v     v  a");
    System.out.println("    J  a a    v   v  a a");
    System.out.println(" J  J aaaaa    V V  aaaaa");
    System.out.println("  JJ a     a    V  a     a");
    }

    private static double media (double first, double second, double third) {
        return ( first + second + third)/3;
    }
private static void displaymodel () {
    System.out.println("  + '' '' '' '' + ");
    System.out.println("[ |   o     o   | ]   " );
    System.out.println("  |      ^      |");
    System.out.println("  |    ' _ '    |");
    System.out.println("  +_ _ _ _ _ _ _+ ");
    }

    private static float rest (float first, float second) {
        return first % second;

    }
private static float grade (float F) {
        float imp =divisible(5,9);
        return (imp * (F -32));
}
private static double convertorInchToCm (double inch)  {
        return inch*2.54;
}

private static void viteza (double meter, double hours, double minutes, double seconds) {
        double km= meter/1000;
        double mile=meter*1609;
        double ms= meter/seconds;
        double kmh= km/hours;
        double mlh= mile/hours;

    System.out.println("Speed in meter/seconds = " + ms );
    System.out.println("Speed in kilometer/hours = " + kmh );
    System.out.println("Speed in miles/hours = " + mlh);

    }
}


