package QueueAndCircularLists.src.queueopgaver;

/**
 * An implementation of a queue as a array.
 */
public class ArrayQueue<E> implements QueueI<E> {
	private E[] elements;
	private int tail;

	//TODO

	/**
	 * Constructs an empty queue.
	 */
	public ArrayQueue() {
		elements = (E[])new Object[10];
		//TODO
		tail = 0;

	}


	/**
	 * Checks whether this queue is empty.
	 *
	 * @return true if this queue is empty
	 */
	@Override
	public boolean isEmpty() {
		// TODO
		if (tail == 0){
			return true;
		}
		return false;
	}

	/**
	 * Adds an element to the tail of this queue.
	 *
	 * @param newElement
	 *            the element to add
	 */
	@Override
	public void enqueue(E newElement) {
		// TODO
		elements[tail] = newElement;
		tail++;
	}

	/**
	 * Removes an element from the head of this queue.
	 * Pre: is not empty
	 * @return the removed element
	 */
	@Override
	public E dequeue() {
		// TODO
		if(isEmpty()){
			return null;
		}
		E removed = elements[0];
		elements[0] = null;

		for(int i = 1; i<elements.length; i++){
			elements[i-1] = elements[i];
		}
		tail--;


		return removed;
	}

	/**
	 * Returns the head of this queue. The queue is unchanged.
	 *  Pre: is not empty
	 * @return the head element
	 */
	@Override
	public E getFront() {
		// TODO
		if(elements[0] != null){
			return elements[0];
		}
		return null;
	}

	/**
	 * The number of elements on the queue.
	 *
	 * @return the number of elements in the queue
	 */
	@Override
	public int size() {

		return tail;
	}
}
