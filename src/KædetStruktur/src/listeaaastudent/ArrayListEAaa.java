package KædetStruktur.src.listeaaastudent;

import java.util.Arrays;

/**
 * An array based implementation of the List ADT.
 */
public class ArrayListEAaa<E> implements ListEAaa<E> {
    @SuppressWarnings("unchecked")
    private E[] data = (E[]) new Object[4];
    private int size = 0;
    // data contains elements at index 0..size-1 and null else

    /**
     * Add the element to the end of this list.
     */
    @Override
    public void add(E e) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size] = e;
        size++;
    }

    /**
     * Remove the element from this list.
     * Return true, if this list is modified.
     */
    @Override
    public boolean remove(E e) {
        int index = 0;
        boolean removed = false;
        while (!removed && index < size) {
            if (data[index].equals(e)) {
                removed = true;
            } else index++;
        }
        size--;
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
        return removed;
    }

    /**
     * Return true, if this list contains the element.
     */
    @Override
    public boolean contains(E e) {
        boolean found = false;
        int i = 0;
        while (!found && i < size) {
            if (data[i].equals(e)) {
                found = true;
            } else i++;
        }
        return found;
    }

    /**
     * Remove all elements from this list.
     */
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    /**
     * Return the size of this list.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Return true, if this list is empty.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        return data[index];
    }

    /**
     * Add the element to this list at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index > size().
     * Note: The element can be added at an index equal to size().
     */
    @Override
    public void add(int index, E e) {

        if (index < 0 || index > size) {
            throw new IllegalArgumentException();
        }
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     * Remove and return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException();
        }
        E toReturn = data[index];
        size--;
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
        return toReturn;
    }

    /**
     * Return the index of the element in this list.
     * Return -1, if this list does not contain the element.
     */
    @Override
    public int indexOf(E e) {
        int toReturn = -1;
        int i = 0;
        while (toReturn == -1 && i < size) {
            if (data[i].equals(e)) {
                toReturn = i;
            } else {
                i++;
            }
        }
        return toReturn;
    }


    //-------------------------------------------

    @Override
    public String toString() {
        String toReturn = "[";
        if (size > 0) {
            toReturn = toReturn + data[0];
        }
        for (int i = 1; i < size; i++) {
            toReturn = toReturn + ", " + data[i];
        }
        return toReturn + "]";
    }
}
