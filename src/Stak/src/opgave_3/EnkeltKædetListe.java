package Stak.src.opgave_3;

import stack.StackI;

import java.util.NoSuchElementException;

/**
 * An implementation of a stack as a sequence of nodes.
 */
public class EnkeltKædetListe<E> implements StackI<E> {
	private Node top;
	private final int max = 5;
	/**
	 * Constructs an empty stack.
	 */
	public EnkeltKædetListe() {
		top = null;
	}

	/**
	 * Adds an element to the top of the stack.
	 *
	 * @param element
	 *            the element to add
	 */
	@Override
	public void push(E element) {
		Node temp = new Node();
		temp.data = element;
		if (top == null) {
			top = temp;
		}
		else {
			if(size() == max) {
				Node temp2 = top;
				while(temp2.next.next != null) {
					temp2 = temp2.next;
				}
				temp2.next = null;
			}
			temp.next = top;
			top = temp;
		}
	}

	/**
	 * Removes the element from the top of the stack.
	 *
	 * @return the removed element
	 */
	@Override
	public E pop() {

		if(top == null){
			throw new NoSuchElementException();
		}
		else{
			E e = top.data;
			top = top.next;
			return e;
		}

	}

	/**
	 * Returns the element from the top of the stack. The stack is unchanged
	 *
	 * @return the element from the top of the stack
	 */
	@Override
	public E peek() {

		if(top == null){
			throw new NoSuchElementException();
		}
		return top.data;
	}

	/**
	 * The number of elements on the stack.
	 *
	 * @return the number of elements on the stack
	 */
	@Override
	public int size() {
		int size = 0;
		Node temp = top;
		while(temp != null){
			temp = temp.next;
			size++;
		}


		return size;
	}

	/**
	 * Checks whether this stack is empty.
	 *
	 * @return true if the stack is empty
	 */
	@Override
	public boolean isEmpty() {
		//TODO
		boolean empty = false;
		if(top == null){
			empty = true;
		}
		return empty;
	}

	class Node {
		public E data;
		public Node next;
	}

}
