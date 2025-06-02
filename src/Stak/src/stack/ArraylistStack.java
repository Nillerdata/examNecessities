package Stak.src.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ArraylistStack<E> implements StackI<E>{
    private List<E> stack = new ArrayList<E>();


    @Override
    public void push(E element) {
        stack.add(element);
    }

    @Override
    public E pop() {

        if(!stack.isEmpty()) {
            return stack.removeLast();
        }
        else throw new NoSuchElementException();
    }

    @Override
    public E peek() {
        if(stack.isEmpty()){
            throw new NoSuchElementException();
        }
        return stack.getLast();
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = false;
        if(stack.isEmpty()){
            isEmpty = true;
        }
        return isEmpty;
    }

    @Override
    public int size() {
        return stack.size();
    }


}
