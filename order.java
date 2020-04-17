/*
 * Name: Satvir Singh
 * PSU ID: 911285383
 * Class: CS202
 * Date: 11/29/2017
 * Assignment: 4
 * This is the class that holds the information for any given order including the name of the
 * person ordering, the total cost of the order, the number of items ordered, any special
 * instructions the customer may have specified, and it also has a 'has a' relationship with
 * the LLL class as it holds the list of all the specific food items ordered in any given order.
 */
public class order {
	protected String name;				// name associated with an order
	protected double total_cost;			// total cost of the order
	protected int total_num_of_items;		// number of items ordered
	protected String special_instructions;		// special instructions for any given order
	protected LLL ord;		// LLL of the items ordered
	public order(){
		this.name = null;
		this.total_cost = 0;
		this.total_num_of_items = 0;
		this.special_instructions = null;
		this.ord = null;
	}
	// parameterized constructor
	public order(String n,double tc,int tn,String si, LLL o){
		this.name = n;
		this.total_cost = tc;
		this.total_num_of_items = tn;
		this.special_instructions = si;
		this.ord = o;
	}
	// method that displays the name of the person
	public void displayName(){
		System.out.println("Name: " + name);
	}
	// method that displays the total cost of any given order
	public void displayTotalCost(){
		System.out.print("Total Cost: ");
		System.out.printf("%.2f", total_cost);
	}
	// method that displays the number of items in any given order
	public void displayTotalNumOfItems(){
		System.out.print("Number of items: " + total_num_of_items);
	}
	// method that displays the special instructions given for any order
	public void displaySpecialInstructions(){
		System.out.println("Special Instructions: " + special_instructions);
	}
}
