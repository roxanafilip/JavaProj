package Lab6.Calculator;

import java.util.Collections;
import java.util.List;

class LogicalOp {

        void displayElementsLits(List<Integer> list) {
                for (int i = 0; i<=list.size()-1; i++ ) {
                        System.out.println(list.get(i));
                }

        }

        void addElement(List<Integer> list, int nr){
                list.add(nr);
        }

        void displaySpecificPosition(List<Integer> list, int nr)  {
                for (int i = nr; i<=list.size()-1; i++ ) {
                        System.out.println(list.get(i));
                }
        }

        void displayReverseElementsLits(List<Integer> list) {

                for (int i = list.size()-1; i>=0; i-- ) {
                        System.out.print(list.get(i) + " ");

                }

        }

        void addElementToSpecificPosition(List<String> list, int nr, String name) {
                list.add(nr, name);
        }

        void addOnFirstPosition(List<String> list, String name ){
                list.add(0, name);
        }

        void displayComplexList(List<Integer> list) {
                for (int i = 0; i<=list.size()-1; i++ ) {
                        System.out.println("Pe pozitia " + i + " valoarea este " + list.get(i));
                }
        }

        void maxNumberFromList(List<Integer> list) {
                System.out.println(Collections.max(list));
                }
        }

