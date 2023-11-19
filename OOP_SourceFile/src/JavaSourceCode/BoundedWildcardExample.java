package JavaSourceCode;

import java.util.List;

//Generic class with a bounded wildcard
class Printer {
 public static void printList(List<? extends Number> list) {
     for (Number element : list) {
         System.out.print(element + " ");
     }
     System.out.println();
 }
}

public class BoundedWildcardExample {
 public static void main(String[] args) {
     List<Integer> integerList = List.of(1, 2, 3, 4, 5);
     List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4, 5.5);

     System.out.print("Integer List: ");
     Printer.printList(integerList);

     System.out.print("Double List: ");
     Printer.printList(doubleList);
 }
}
