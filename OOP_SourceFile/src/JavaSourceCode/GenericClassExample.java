package JavaSourceCode;

//Generic class with a placeholder type T
class Box<T> {
 private T content;

 public void setContent(T content) {
     this.content = content;
 }

 public T getContent() {
     return content;
 }
}

public class GenericClassExample {
 public static void main(String[] args) {
     // Creating a Box for Integer
     Box<Integer> integerBox = new Box<>();
     integerBox.setContent(42);
     System.out.println("Integer Box Content: " + integerBox.getContent());

     // Creating a Box for String
     Box<String> stringBox = new Box<>();
     stringBox.setContent("Hello, Generics!");
     System.out.println("String Box Content: " + stringBox.getContent());
 }
}

