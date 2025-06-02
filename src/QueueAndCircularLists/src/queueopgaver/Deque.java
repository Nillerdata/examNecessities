package QueueAndCircularLists.src.queueopgaver;




public class Deque<E> implements DequeI<E>{
    private Node head;
    private Node tail;
    private int size = 0;
    public Deque() {

        head = null;
        tail = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void addFirst(E newElement) {
        Node node = new Node();
        node.data = newElement;
        if(isEmpty()){
            head = node;
            tail = node;
        }else{
            head.next = head;
            head.previous = node;
            head = node;
        }
        size++;


    }

    @Override
    public void addLast(E newElement) {
        Node node = new Node();
        node.data = newElement;
       if(isEmpty()){
           head = node;
           tail = node;
       }else{
           node.previous = tail;
           tail.next = node;
           tail = node;
       }
       size++;
    }

    @Override
    public E removeFirst() {
        if(isEmpty()){
            throw new IllegalStateException("Deque is empty");
        }
        E removeFirst = head.data;
        head = head.next;
        if(head != null){
            tail = null;
        }else{
            head.previous = null;
        }
        size--;
        return removeFirst;
    }

    @Override
    public E removeLast() {
        E removeLast = tail.data;
        tail = tail.previous;
        if(tail != null){
            tail.next = null;
        }else{
            head = null;
        }
        size--;
        return removeLast;
    }

    @Override
    public E getFirst() {

        return head.data;
    }

    @Override
    public E getLast() {
        return tail.data;
    }

    @Override
    public int size() {
        return size;
    }
    private class Node {
        private Node next;
        private Node previous;
        private E data;
    }
}
