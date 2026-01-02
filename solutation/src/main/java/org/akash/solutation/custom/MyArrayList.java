package main.java.org.akash.solutation.custom;

import java.util.Arrays;

public class MyArrayList<T> {

    private Object[] elementData;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    // Constructor
    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    // Add element
    public void add(T element) {
        ensureCapacity();
        elementData[size++] = element;
    }

    // Get element
    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) elementData[index];
    }

    // Remove element
    public T remove(int index) {
        checkIndex(index);

        @SuppressWarnings("unchecked")
        T removedElement = (T) elementData[index];

        int moveCount = size - index - 1;
        if (moveCount > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, moveCount);
        }

        elementData[--size] = null; // avoid memory leak
        return removedElement;
    }

    // Size
    public int size() {
        return size;
    }

    // Ensure capacity
    private void ensureCapacity() {
        if (size == elementData.length) {
            int newCapacity = elementData.length + (elementData.length >> 1);
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }

    // Index check
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
    }
}
