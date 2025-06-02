package KædetStruktur.src.listeaaastudent;

import citylinkedlist.CityList;

/** A single-linked nodes based implementation of the List ADT. */
public class SingleLinkedListEAaa<E> implements ListEAaa<E> {
    private Node<E> head = null;
    private int size = 0;

    /**
     * Add the element to the end of this list.
     */
    @Override
    public void add(E e) {
        Node<E> node = new Node<>(e);
        size++;
        if (head == null) {
            head = node;

        }
        else{
            Node<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    /**
     * Remove the element from this list.
     * Return true, if this list is modified.
     */
    @Override
    public boolean remove(E e) {
        boolean remove = false;

        if (head.next.next != null) {
            if (head.next.element.equals(e)) {
                head = head.next;
                remove = true;
            } else {
                Node<E> temp = head;
                while (!remove && temp.next != null) {
                    if (temp.next.element.equals(e)) {
                        remove = true;
                        temp.next = temp.next.next;
                        size--;
                    }
                    temp = temp.next;
                }
            }
        }
        return remove;
    }

    /**
     * Return true, if this list contains the element.
     */
    @Override
    public boolean contains(E e) {
        boolean contain = false;
        Node<E> temp = head;
        while (!contain && temp.next != null){
            if (temp.next.element.equals(e)){
                contain = true;
            } else {
                temp = temp.next;
            }
        }
        return contain;
    }

    /**
     * Remove all elements from this list.
     */
    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    /**
     * Return the size of this list.
     */
    public int size() {
        return size;
    }

    /**
     * Return true, if this list is empty.
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E get(int index) {
        Node<E> temp = head;
        E ele = null;
        int count = 0;

        if (index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }

        while (temp.next != null){
            count++;
            if (count == index){
                ele = temp.element;
            }else {
                temp = temp.next;
            }
        }
        return ele;
    }

    /**
     * Add the element to this list at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index > size().
     * Note: The element can be added at an index equal to size().
     */
    @Override
    public void add(int index, E e) {
        // Laver ny node
        Node<E> newN = new Node<>(e);

        // Tjekker for IndexOutOfBoundsException
        if (index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        }
        // Tilføj elementet i starten af listen
        if (index == 0){
            newN.next = head;  // Forbind den nye node til den nuværende head
            head = newN;       // Opdater head til at pege på den nye node
        }else {
            // Traversér listen for at finde indsættelsespunktet
            Node<E> temp = head;
            int count = 0;

            while (count < index && temp != null) {
                temp = temp.next;
                count++;
            }
            // Indsæt den nye node på den korrekte position
            newN.next = temp.next; // Forbind den nye node til næste node
            temp.next = newN;      // Forbind den tidligere node til den nye node
        }
    }

    /**
     * Remove and return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E remove(int index) {
        Node<E> temp = head;
        E ele;

        if (index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }

        // Håndter fjernelse af det første element
        if (index == 0) {
            ele = head.element;  // Gemmer elementet, der skal fjernes
            head = head.next;    // Opdater head til næste node
        } else {
            // Find noden lige før den, der skal fjernes
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            // Fjern noden og gem dens element
            Node<E> nodeToRemove = temp;      // Noden, der skal fjernes
            ele = nodeToRemove.element;       // Gem elementet
            temp.next = nodeToRemove.next;    // Skift linket for at springe over noden
        }

        size--;
        return ele;
    }

    /**
     * Return the index of the element in this list.
     * Return -1, if this list does not contain the element.
     */
    @Override
    public int indexOf(E e) {
        int index = -1;
        int count = 0;
        Node<E> temp = head;

        while (temp.next != null){
            count++;
            if (temp.element.equals(e)){
                index = count;
                temp = temp.next;
            }else {
                temp = temp.next;
            }
        }
        return index;
    }



    //-------------------------------------------

    private static class Node<T> {
        private final T element;
        private Node<T> next;

        public Node(T t) {
            this.element = t;
            this.next = null;
        }
    }

    //-------------------------------------------


    @Override
    public String toString() {
        return "head: " + head;
    }
}
