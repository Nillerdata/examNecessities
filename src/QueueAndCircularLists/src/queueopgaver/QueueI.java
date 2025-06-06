package QueueAndCircularLists.src.queueopgaver;

/**
 * An interface of a queue
 */
public interface QueueI<E> {

	/**
	 * Checks whether this queue is empty.
	 *
	 * @return true if this queue is empty
	 */
	public boolean isEmpty();

	/**
	 * Adds an element to the tail of this queue.
	 *
	 * @param newElement
	 *            the element to add
	 */
	public void enqueue(E newElement);

	/**
	 * Removes an element from the head of this queue.
	 * Pre: is not empty
	 * @return the removed element
	 */
	public E dequeue();

	/**
	 * Returns the head of this queue. The queue is unchanged.
	 * Pre: is not empty
	 * @return the head element
	 */
	public E getFront();

	/**
	 * The number of elements on the queue.
	 *
	 * @return the number of elements on the queue
	 */
	public int size();

}
