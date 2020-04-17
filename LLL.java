/*
 * Name: Satvir Singh
 * PSU ID: 911285383
 * Class: CS202
 * Date: 11/29/2017
 * Assignment: 4
 * This is the class that implements the LLL that holds the different types of food in any order.
 */
public class LLL {
	node head;
	class node{
		food ptr;
		node next;
		// default constructor
		node(){
			this.ptr = null;
			this.next = null;
		}
		// parameterized constructor
		node(food n){
			this.ptr = n;
			this.next = null;
		}
	}
	// default constructor
	public LLL(){
		head = null;
	}
	// method that inserts the food into the LLL
	public node insert(node head,food toAdd){
		if(head == null){
			return new node(toAdd);
		}
		head.next = insert(head.next,toAdd);
		return head;
	}
	// wrapper method for LLL insert
	public void insert(food toAdd){
		head = insert(head,toAdd);
	}
	// method that displays the food in any given order
	public void display(node head){
		node curr = head;
		if(curr == null){
			System.out.println("There is no food in the list!");
		}
		System.out.println("The order includes: ");
		while(curr != null){
			curr.ptr.displayName();
			curr = curr.next;
		}
	}
	// wrapper method for LLL display
	public void display(){
		display(head);
	}
}
