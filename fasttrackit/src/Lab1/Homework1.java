package Lab1;

public class Homework1 {
    public static void main(String[] args) {

        //Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
        System.out.println("Hello");
        System.out.println("Roxana");

        //Printati rezultatul sumei a doua numere(orice numere)
        int no1=9;
        int no2=562;
        int suma= no1 + no2;
        System.out.println("Rezultatul sumei dintre " +no1 +" si "+ no2 + " este: " + suma );


        /* Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.

                Ex: 10 / 3 =  3.33333*/
        double nr1=16;
        double nr2=3;
        double impartire= nr1 / nr2;
        System.out.println("Rezultatul impartirii dintre " +nr1+ " si "+ nr2+" este: "+ impartire);

        //Printati rezultatul urmatoarelor operatiuni:

        //a. -5 + 8 * 6
        int x=-5;
        int y=8;
        int z=6;
        int r1= x + y * z;
        System.out.println("Rezultatul operatiei este "+r1);


        //b. (55+9) % 9
        int a=55;
        int b=9;
        int c=9;
        int r2= (a+b) % c;
        System.out.println("Rezultatul operatiei este "+r2);

        //c. 20 + -3*5 / 8
        int l=20;
        int m=-3;
        int n=5;
        int o=8;
        int r3= l+ -3 * 5 / 8;
        System.out.println("Rezultatul operatiei este " +r3);

        //d. 5 + 15 / 3 * 2 - 8 % 3
        int p=5;
        int q=15;
        int r=3;
        int s=2;
        int t=8;
        int u=3;
        int r4= p + q / r * s - t % u;
        System.out.println("Rezultatul operatiei este " +r4 );



    }
}
