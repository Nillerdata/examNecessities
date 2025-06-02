package KædetStruktur.src.listeaaastudent;

/**
 * A double-linked nodes based implementation of the List ADT.
 */
public class DoubleLinkedListEAaa<E> implements ListEAaa<E> {
    private final Node<E> header = new Node<>(null);
    private final Node<E> trailer = new Node<>(null);
    private int size = 0;

    public DoubleLinkedListEAaa() {
        header.next = trailer;
        trailer.prev = header;
    }

    /**
     * Add the element to the end of this list.
     */
    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        // insert newNode between trailer.prev and trailer
        newNode.prev = trailer.prev;
        newNode.next = trailer;
        trailer.prev.next = newNode;
        trailer.prev = newNode;
        size++;
    }

    /**
     * Remove the element from this list.
     * Return true, if this list is modified.
     */
    @Override
    public boolean remove(E e) {
        boolean remove = false;
        Node<E> current = header.next;

        while (!remove && current != trailer) {
            if (current.element.equals(e)) {
                current.prev.next = current.next; //Forrige node bliver til current næste
                current.next.prev = current.prev;
                size--;
                remove = true;
            }
            current = current.next;
        }
        return remove;
    }

    /**
     * Return true, if this list contains the element.
     */
    @Override
    public boolean contains(E e) {
        boolean contain = false;
        Node<E> current = header.next;

        while (!contain && current != trailer) {
            if (current.element.equals(e)) {
                contain = true;
            }
            current = current.next;
        }
        return contain;
    }

    /**
     * Remove all elements from this list.
     */
    @Override
    public void clear() {
        header.next = trailer;
        trailer.prev = header;
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
        return header.next == trailer;
    }

    /**
     * Return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> current = header.next;
        E ele = null;
        int count = 0;

        while (current != trailer) {
            count++;
            if (count == index) {
                ele = current.element;
            }
            current = current.next;
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
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> temp = header.next;
        int count = 0;

        while (count < index - 1 && temp != trailer) {
            temp = temp.next;
            count++;
        }
        // Indsæt den nye node på den korrekte position
        temp.prev.next = newN; //Forrige node bliver til current næste
        temp.next.prev = newN;

        size++;
    }

    /**
     * Remove and return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> current = header.next;
        E ele;

        // Find noden lige før den, der skal fjernes
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        // Fjern noden og gem dens element
        ele = current.element;

        current.prev.next = current.next; //Forrige node bliver til current næste
        current.next.prev = current.prev;

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
        Node<E> current = header.next;

        while (current != trailer){
            count++;
            if (current.element.equals(e)){
                index = count;
                current = current.next;
            }else {
                current = current.next;
            }
        }
        return index;
    }

//-------------------------------------------

    private static class Node<T> {
        private final T element;
        private Node<T> next;
        private Node<T> prev;

        public Node(T t) {
            this.element = t;
            this.next = null;
            this.prev = null;
        }
    }

//-------------------------------------------

    @Override
    public String toString() {
        return null;
    }
}
