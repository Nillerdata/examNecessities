package Stak.src.stack;

/**
 * An implementation of a stack as a sequence of nodes.
 */
public interface StackI<E> {

	/**
	 * Adds an element to the top of the stack.
	 *
	 * @param element
	 *            the element to add
	 */
	public void push(E element);

	/**
	 * Removes the element from the top of the stack.
	 *
	 * @return the removed element
	 */
	public E pop();

	/**
	 * Returns the element from the top of the stack. The stack is unchanged
	 *
	 * @return the element from the top of the stack
	 */
	public E peek();

	/**
	 * Checks whether this stack is empty.
	 *
	 * @return true if the stack is empty
	 */
	public boolean isEmpty();

	/**
	 * The number of elements on the stack.
	 *
	 * @return the number of elements on the stack
	 */
	public int size();

}
