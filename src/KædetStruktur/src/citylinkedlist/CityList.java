package KædetStruktur.src.citylinkedlist;

import java.util.NoSuchElementException;

/**
 * A linked list of cities
 */
public class CityList {
	private Node first;

	/**
	 * Constructs an empty linked list.
	 */
	public CityList() {
		first = null;
	}

	/**
	 * Returns the first element in the linked list.
	 *
	 * @return the first element in the linked list
	 */
	public City getFirst() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}

	/**
	 * Removes the first element in the linked list.
	 *
	 * @return the removed element
	 */
	public City removeFirst() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		City element = first.data;
		first = first.next;
		return element;
	}
	
	
	/**
	 * Adds an element to the front of the linked list.
	 *
	 * @param element
	 *            the element to add
	 */
	public void addFirst(City element) {
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = first;
		first = newNode;
	}

	/**
	 * Returns the number af cities in the list
	 *
	 */
	public int countCities() {
		int count = 0;
		Node temp = first;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;

	}

	public void removeCity(City city) {
		if (first != null) {
			if (first.data.equals(city)) {
				first = first.next;
			} else {
				Node temp = first;
				boolean found = false;
				while (!found && temp.next != null) {
					if (temp.next.data.equals(city)) {
						found = true;
					} else {
						temp = temp.next;
					}
				}
				if (found) {
					Node temp2 = temp.next;
					temp.next = temp2.next;
					temp2.next = null;

				}
			}
		}
	}

	class Node {
		public City data;
		public Node next;
	}

	public int numerInhabitants(){
		int antal = 0;

		if (first == null) {
			throw new NoSuchElementException();
		}

		Node temp = first;
		while (temp != null){
			antal += temp.data.getInhabitants();
			temp = temp.next;
		}

		return antal;
	}

	public City getLast(){
		City city = first.data;
		Node temp = first;

		while (temp != null){
			city = temp.data;
			temp = temp.next;
		}

		return city;
	}

	public City removeLast(){
		// Bruger metode fra før til at få den sidste by
		City city = getLast();

		// Fjerner den sidste by
		removeCity(city);

		return city;
	}

//	public City removeLast() {
//		Node temp = first;
//		City lastCity = getLast();
//		while (temp.next.next != null) {
//			temp = temp.next;
//		}
//		temp.next = null;
//
//		return lastCity;
//	}
}
