package JavaSourceCode;

import java.util.Arrays;

public class CustomArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public CustomArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E element) {
        ensureCapacity();
        elements[size++] = element;
    }

    @SuppressWarnings("unchecked")
	public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    public void set(int index, E element) {
        checkIndex(index);
        elements[index] = element;
    }

    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }

    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public static void main(String[] args) {
        CustomArrayList<String> customList = new CustomArrayList<>();

        customList.add("Apple");
        customList.add("Banana");
        customList.add("Cherry");

        System.out.println("Size: " + customList.size());  // Output: 3
        System.out.println("Is Empty: " + customList.isEmpty());  // Output: false

        System.out.println("Element at index 1: " + customList.get(1));  // Output: Banana

        customList.set(1, "Grapes");
        System.out.println("Updated element at index 1: " + customList.get(1));  // Output: Grapes

        customList.remove(0);
        System.out.println("After removing element at index 0:");
        for (int i = 0; i < customList.size(); i++) {
            System.out.println(customList.get(i));
        }

        System.out.println("Contains 'Cherry': " + customList.contains("Cherry"));  // Output: false
        System.out.println("Index of 'Grapes': " + customList.indexOf("Grapes"));  // Output: 0
    }
}
