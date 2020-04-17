/*
 * Name: Satvir Singh
 * PSU ID: 911285383
 * Class: CS202
 * Date: 11/29/2017
 * Assignment: 4
 * This is the class that differentiates an entree from any other food type.
 */
public class entree extends food{
	protected int calories;		// calorie count of any given entree
	// default constructor
	public entree(){
		this.calories = 0;
	}
	// method that displays the calorie count of any given entree
	public void displayCalories(){
		System.out.println(calories);
	}
}
