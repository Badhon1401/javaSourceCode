package JavaSourceCode;

@SuppressWarnings("serial")
//Custom exception class
class CustomException extends Exception {
 public CustomException(String message) {
     super(message);
 }
}

//Example class using the custom exception
public class CustomExceptionExample {
 public static void main(String[] args) {
     try {
         // Some code that may throw the custom exception
         validateInput(10);
     } catch (CustomException e) {
         // Handle the custom exception
         System.out.println("Caught CustomException: " + e.getMessage());
     }
 }

 // Method that throws the custom exception
 private static void validateInput(int value) throws CustomException {
     if (value < 0) {
         throw new CustomException("Input value cannot be negative");
     }
     // Other validation logic...
 }
}

