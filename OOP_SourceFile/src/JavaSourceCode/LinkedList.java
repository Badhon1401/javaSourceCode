package JavaSourceCode;

import java.util.NoSuchElementException;

public class LinkedList<E> {
    private Node<E> head;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void addFirst(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        E removedData = head.data;
        head = head.next;
        size--;
        return removedData;
    }

    public boolean remove(E data) {
        if (isEmpty()) {
            return false;
        }

        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }

        Node<E> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            size--;
            return true;
        }

        return false;
    }

    public boolean contains(E data) {
        Node<E> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("Linked List:");
        linkedList.display();  // Output: 1 2 3

        linkedList.addFirst(0);
        linkedList.add(4);

        System.out.println("Updated Linked List:");
        linkedList.display();  // Output: 0 1 2 3 4

        System.out.println("Removed Element: " + linkedList.removeFirst());
        System.out.println("Linked List after Removal:");
        linkedList.display();  // Output: 1 2 3 4

        System.out.println("Contains 2: " + linkedList.contains(2));  // Output: true
        System.out.println("Contains 5: " + linkedList.contains(5));  // Output: false

        System.out.println("Removed Element 3: " + linkedList.remove(3));
        System.out.println("Linked List after Removal:");
        linkedList.display();  // Output: 1 2 4
    }
}
