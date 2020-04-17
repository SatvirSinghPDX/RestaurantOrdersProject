/*
 * Name: Satvir Singh
 * PSU ID: 911285383
 * Class: CS202
 * Date: 11/29/2017
 * Assignment: 4
 * This is the abstract class that holds all the information that is common
 * amongst all types of food. It is the parent class of the 'entree', 'appetizer',
 * and 'dessert' classes.
 */
public abstract class food {
	protected String name;		// name of the food item
	protected double price;		// price of the food
	// default constructor
	protected food(){		
		this.name = null;
		this.price = 0.00;
	}
	// method that displays the name of the food item
	public void displayName(){
		System.out.println(name);
	}
	// method that displays the price of the food item
	public void displayPrice(){
		System.out.println("$" + price);
	}
}
