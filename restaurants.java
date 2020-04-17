/*
 * Name: Satvir Singh
 * PSU ID: 911285383
 * Class: CS202
 * Date: 12/6/2017
 * Assignment: 5
 * This class is responsible for holding information about all of the restaurants.
 * The tacobell, olivegarden, redrobin, and pandaexpress classes are all derived from
 * it. It holds a balanced tree of all the drivers available for any particular restaurant.
 */
public class restaurants {
	protected String name;	// name of the restaurant
	protected BST_AVL listOfDrivers;		// list of drivers available
	// default constructor
	restaurants(){
		this.name = null;
		this.listOfDrivers = null;
	}
	// parameterized constructor
	restaurants(String n){
		this.name = n;
		this.listOfDrivers = null;
	}
	// method that displays the name of the restaurant
	public void displayName(){
		System.out.println(name);
	}
	// method that displays the list of drivers available
	public void displayDriver(){
		listOfDrivers.displayInOrder();
	}
	// derived taco bell class
	public class tacobell extends restaurants{
		tacobell(){
			super("Taco Bell");
		}
	}
	// derived olive garden class
	public class olivegarden extends restaurants{
		olivegarden(){
			super("Olive Garden");
		}
	}
	// derived red robin class
	public class redrobin extends restaurants{
		redrobin(){
			super("Red Robin");
		}
	}
	// derived pand aexpress class
	public class pandaexpress extends restaurants{
		pandaexpress(){
			super("Panda Express");
		}
	}
}
