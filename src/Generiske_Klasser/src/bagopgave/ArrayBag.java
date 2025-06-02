package Generiske_Klasser.src.bagopgave;

import java.util.Arrays;

public class ArrayBag<E> implements Bag<E> {
    // the array to hold the items
    private final E[] items;
    // current number of items in the bag,
    // items are at index 0..size-1
    private int size;

    /**
     * Create a bag with the given capacity.
     */
    public ArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        E[] empty = (E[]) new Object[capacity];
        items = empty;
        size = 0;
    }

    /**
     * Create a bag with capacity 10.
     */

    public ArrayBag() {
        this(10);
    }


    /**
     * Gets the current number of entries in this bag.
     *
     * @return the integer number of entries currently in the bag
     */
    @Override
    public int getCurrentSize() {
        return size;
    }

    /**
     * Sees whether this bag is full.
     *
     * @return true if the bag is full, or false if not
     */
    @Override
    public boolean isFull() {
        return size == items.length;
    }

    /**
     * Sees whether this bag is empty.
     *
     * @return true if the bag is empty, or false if not
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Adds a new entry to this bag.
     *
     * @param newEntry the object to be added as a new entry
     * @return true if the addition is successful, or false if not
     */
    @Override
    public boolean add(E newEntry) {
        boolean succesfull = false;
        if (!isFull()) {
            items[size] = newEntry;
            size++;
            succesfull = true;
        }
        return succesfull;
    }

    /**
     * Removes one unspecified entry from this bag, if possible.
     *
     * @return either the removed entry, if the removal was successful, or null
     */
    @Override
    public E remove() {
        E e = null;
        if (!isEmpty()) {
            e = items[size - 1];
            items[size - 1] = null;
            size--;

        }

        return e;
    }

    /**
     * Removes one occurrence of a given entry from this bag.
     *
     * @param anEntry the entry to be removed
     * @return true if the removal was successful, or false if not
     */
    @Override
    public boolean remove(E anEntry) {
        boolean deSkalIkkeIntegreresDeSkalHjem = false;

        for (int i = 0; i < size; i++) {
            if (items[i].equals(anEntry) && items[i] != null) {
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[size - 1] = null;
                size--;

                deSkalIkkeIntegreresDeSkalHjem = true;
            }
        }
        return deSkalIkkeIntegreresDeSkalHjem;
    }

    /**
     * Removes all entries from this bag.
     */
    @Override
    public void clear() {
        Arrays.fill(items, null);
        size = 0;
    }

    /**
     * Counts the number of times a given entry appears in this bag.
     *
     * @param anEntry the entry to be counted
     * @return the number of times anEntry appears in the bag
     */
    @Override
    public int getFrequencyOf(E anEntry) {
        int frequency = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].equals(anEntry) && items[i] != null) {
                frequency++;
            }
        }
        return frequency;
    }

    /**
     * Tests whether this bag contains a given entry.
     *
     * @param anEntry the entry to locate
     * @return true if this bag contains anEntry, or false otherwise
     */
    @Override
    public boolean contains(E anEntry) {
        boolean contains = false;
        if (anEntry == null) {
            for (int i = 0; i < size; i++) {
                if (items[i] == null) {
                    contains = true;
                    return contains;
                }

            }
        } else {
            for (int i = 0; i < size; i++) {
                if (items[i].equals(anEntry)) {
                    contains = true;
                    return contains;
                }
            }
        }


        return contains;
    }

    /**
     * Retrieves all entries that are in this bag.
     *
     * @return a newly allocated array of all the entries in the bag
     */
    @Override
    @SuppressWarnings("unchecked")
    public E[] toArray() {
        E[] newArray = ((E[]) new Object[size]);
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                newArray[i] = items[i];

            }
        }
        return newArray;
    }
}
