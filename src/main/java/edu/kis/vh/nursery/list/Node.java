package edu.kis.vh.nursery.list;

/**
 * class representing element of IntLinkedList in form of a node with int value
 * @see IntLinkedList
 */
public class Node {

	private int value;
	private Node prev;
	private Node next;


	/**
	 * creates element with value i
	 * @param i value of node to be created
	 */
	public Node(int i) {
		this.value = i;
	}

	/**
	 *
	 * @return value of specific Node
	 */
	public int getValue() {
		return value;
	}

	/**
	 *
	 * @return value of previous node
	 */
	public Node getPrev() {
		return prev;
	}

	/**
	 *
	 * @param prev new value of previous node
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}

	/**
	 *
	 * @return value of next node
	 */
	public Node getNext() {
		return next;
	}

	/**
	 *
	 * @param next new value of next node
	 */
	public void setNext(Node next) {
		this.next = next;
	}
}
