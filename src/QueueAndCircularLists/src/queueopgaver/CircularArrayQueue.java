package QueueAndCircularLists.src.queueopgaver;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a circular array.
 */
public class CircularArrayQueue<E> implements QueueI<E> {
	private E[] elements;
	private int currentSize;
	private int head;
	private int tail;

	/**
	 * Constructs an empty queue.
	 */
	public CircularArrayQueue() {
		final int INITIAL_SIZE = 10;
		elements = (E[]) new Object[10];
		currentSize = 0;
		head = 0;
		tail = 0;
	}

	/**
	 * Checks whether this queue is empty.
	 *
	 * @return true if this queue is empty
	 */
	@Override
	public boolean isEmpty() {
		return currentSize == 0;
	}

	/**
	 * Adds an element to the tail of this queue.
	 *
	 * @param newElement
	 *            the element to add
	 */
	@Override
	public void enqueue(E newElement) {
		growIfNecessary();
		currentSize++;
		elements[tail] = newElement;
		tail = (tail + 1) % elements.length;
	}

	/**
	 * Removes an element from the head of this queue.
	 *
	 * @return the removed element
	 */
	@Override
	public E dequeue() {
		if (currentSize == 0) {
			throw new NoSuchElementException();
		}
		E removed = elements[head];
		head = (head + 1) % elements.length;
		currentSize--;
		return removed;
	}

	/**
	 * Grows the element array if the current size equals the capacity.
	 */
	private void growIfNecessary() {
		if (currentSize == elements.length) {
			E[] newElements = (E[])new Object[2 * elements.length];
			for (int i = 0; i < elements.length; i++) {
				newElements[i] = elements[(head + i) % elements.length];
			}
			elements = newElements;
			head = 0;
			tail = currentSize;
		}
	}

	@Override
	public E getFront() {
		if (currentSize == 0) {
			throw new NoSuchElementException();
		}
		return elements[head];
	}

	@Override
	public int size() {
		return currentSize;
	}
}
