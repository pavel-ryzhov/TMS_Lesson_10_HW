package task5;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int capacity = 10;
    private Object[] elements;
    private int size;

    public MyList() {
        elements = new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
    }

    public E get(int index){
        return index >= size ? null: (E)elements[index];
    }

    public void add(E element){
        if (size >= capacity) {
            grow();
        }
        elements[size++] = element;
    }
    public void remove(int index){
        if (index >= size) return;
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }

    public boolean contains(Object element){
        for (Object item: elements) {
            if (element.equals(item)) return true;
        }
        return false;
    }

    public void clear(){
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return capacity;
    }

    /**
     * This method increases size
     */
    private void grow(){
        capacity = capacity * 3 / 2 + 1;
        elements = Arrays.copyOf(elements, capacity);
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }
}
