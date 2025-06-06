package QueueAndCircularLists.src.queueopgaver;

/**
 * An interface of a deque
 */
public interface DequeI<E> {

	/**
	 * Checks whether this deque is empty.
	 *
	 * @return true if this queue is empty
	 */
	public boolean isEmpty();

	/**
	 * Adds an element to the head of this deque.
	 *
	 * @param newElement
	 *            the element to add
	 */
	public void addFirst(E newElement);

	/**
	 * Adds an element to the tail of this deque.
	 *
	 * @param newElement
	 *            the element to add
	 */
	public void addLast(E newElement);

	/**
	 * Removes an element from the head of this deque.
	 * Pre: is not empty
	 * @return the removed element
	 */
	public E removeFirst();

	/**
	 * Removes an element from the tail of this deque.
	 * Pre: is not empty
	 * @return the removed element
	 */
	public E removeLast();

	/**
	 * Returns the head of this deque. The deque is unchanged.
	 * Pre: is not empty
	 * @return the head element
	 */
	public E getFirst();

	/**
	 * Returns the tail of this deque. The deque is unchanged.
	 * Pre: is not empty
	 * @return the tail element
	 */
	public E getLast();

	/**
	 * The number of elements on the deque.
	 *
	 * @return the number of elements on the queue
	 */
	public int size();
}
