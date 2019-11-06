package Lab5.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        LogicalOp logicalOp = new LogicalOp();


        System.out.println(calculator.add(2.8f,5.2f,8.9f));
        System.out.println(calculator.add(8, 4,6,1));
        System.out.println(calculator.add(3.4f, 2.9f));
        System.out.println(calculator.add(17,12));

        logicalOp.numberTo100();
        logicalOp.pare(100);





    }
}
