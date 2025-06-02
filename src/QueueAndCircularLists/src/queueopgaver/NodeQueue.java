package QueueAndCircularLists.src.queueopgaver;

public class NodeQueue<E> implements QueueI<E> {
    //TODO
    private Node first = null;
    private Node last = null;
    private int size = 0;

    public NodeQueue() {
        //TODO

    }

    @Override
    public boolean isEmpty() {
        //TODO
        if (first == null) {
            return true;
        }
        return false;
    }

    @Override
    public void enqueue(E newElement) {
        //TODO
        Node node = new Node();
        node.data = newElement;
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }


    @Override
    public E dequeue() {
        //TODO
        E remove = first.data;
        first = first.next;
        size--;

        return remove;
    }

    @Override
    public E getFront() {
        //TODO
        return first.data;
    }

    @Override
    public int size() {
        return size;
    }

    private class Node {
        private Node next;
        private E data;
    }
}


