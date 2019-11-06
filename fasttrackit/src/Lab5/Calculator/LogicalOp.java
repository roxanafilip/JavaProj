package Lab5.Calculator;

public class LogicalOp {

    public void numberTo100() {
        int[] myArray = new int[100];


        for (int i = 0; i<= myArray.length-1; i++){

            myArray[i] = i;

            System.out.println("[" + i + "] =" + myArray[i]);
        }

    }

    public int[] pare(int size) {

        int[] tempArray = new int[size];

        for (int i=0; i<size;i++) {
            if(i % 2 == 0) {
                tempArray[i] = i;
                System.out.println(tempArray[i]);
            }
        }

        return tempArray;
    }

    }

