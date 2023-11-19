package JavaSourceCode;

//Generic method to compare two objects of the same type
class ComparisonUtil {
 public static <T extends Comparable<T>> T max(T x, T y) {
     return (x.compareTo(y) > 0) ? x : y;
 }
}

public class GenericMethodExample {
 public static void main(String[] args) {
     System.out.println("Maximum of 5 and 8: " + ComparisonUtil.max(5, 8));
     System.out.println("Maximum of 'apple' and 'orange': " + ComparisonUtil.max("apple", "orange"));
 }
}
