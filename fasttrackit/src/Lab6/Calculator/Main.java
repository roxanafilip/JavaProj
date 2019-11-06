package Lab6.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(0);
        myList.add(1);
        myList.add(25);
        myList.add(3);
        myList.add(4);

        List<String> myList1 = new ArrayList<>();

        myList1.add("Opel");
        myList1.add("Skoda");
        myList1.add("VW");
        myList1.add("Toyota");

        LogicalOp op = new LogicalOp();
        System.out.println("Problema 1");
        op.displayElementsLits(myList);
        System.out.println();
        System.out.println("Problema 2");
        op.addElement(myList,5);
        System.out.println(myList);
        System.out.println();
        System.out.println("Problema 3");
        op.displaySpecificPosition(myList,3);
        System.out.println();
        System.out.println("Problema 4");
        op.displayReverseElementsLits(myList);
        System.out.println();
        System.out.println("Problema 5");
        op.addElementToSpecificPosition(myList1, 3, "Suzuki");
        System.out.println(myList1);
        System.out.println();
        System.out.println("Problema 6");
        op.addOnFirstPosition(myList1, "CARS");
        System.out.println(myList1);
        System.out.println();
        System.out.println("Problema 7");
        op.displayComplexList(myList);
        System.out.println();
        System.out.println("Problema 8");
        op.maxNumberFromList(myList);
    }






}
