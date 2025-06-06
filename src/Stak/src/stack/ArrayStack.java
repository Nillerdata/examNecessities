package Stak.src.stack;

import java.util.NoSuchElementException;

/**
 * An implementation of a stack as a sequence of nodes.
 */
public class ArrayStack<E> implements StackI<E> {
	private E[] stack;
	private int top;

	/**
	 * Constructs an empty stack.
	 */
	public ArrayStack(int antal) {
		top = -1;
		stack = (E[])new Object[antal];
	}

	/**
	 * Adds an element to the top of the stack.
	 *
	 * @param element
	 *            the element to add
	 */
	@Override
	public void push(E element) {
		growIfNeccassary();
		top++;
		stack[top] = element;

	}

	private void growIfNeccassary() {
		if (top + 1 == stack.length) {
			E[] newElements = (E[])new Object[stack.length * 2];
			for (int i = 0; i < stack.length; i++) {
				newElements[i] = stack[i];
			}
			stack = newElements;
		}
	}

	/**
	 * Removes the element from the top of the stack.
	 *
	 * @return the removed element
	 */
	@Override
	public E pop() {
		if (top < 0) {
			throw new NoSuchElementException();
		}
		E element = stack[top];
		stack[top] = null;
		top--;
		return element;
	}

	/**
	 * Returns the element from the top of the stack. The stack is unchanged
	 *
	 * @return the element from the top of the stack
	 */
	@Override
	public E peek() {
		if (top < 0) {
			throw new NoSuchElementException();
		}
		return stack[top];
	}

	/**
	 * The number of elements on the stack.
	 *
	 * @return the number of elements on the stack
	 */
	@Override
	public int size() {
		return top + 1;
	}

	/**
	 * Checks whether this stack is empty.
	 *
	 * @return true if the stack is empty
	 */
	@Override
	public boolean isEmpty() {
		return top == -1;
	}

}
