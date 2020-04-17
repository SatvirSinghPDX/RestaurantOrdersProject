/*
 * Name: Satvir Singh
 * PSU ID: 911285383
 * Class: CS202
 * Date: 11/29/2017
 * Assignment: 4
 * This is the function that prompts the user and guides them through the ordering 
 * process based on what restaurant they have selected.
 */
import java.util.Scanner;
public class prompts {
	protected static Scanner scan;
	protected DLL listOfOrders = new DLL();
	public void promptTacoBellOrder(){
		LLL list = new LLL();
		food we;
		double total = 0;
		int count = 0;
		String response;
		String n;
		do{
			scan = new Scanner(System.in);
			System.out.println("What is the name for this order?");
			n = scan.nextLine();
			entree e = new entree();
			System.out.println("Okay " + n + ", what would you like your entree to be? ");
			scan = new Scanner(System.in);
			String entree_response;
			entree_response = scan.nextLine();
			e.name = entree_response;
			if(entree_response.equals("Soft Taco")){
				e.price = 1.89;
				e.calories = 210;
				System.out.print("The price of a " + entree_response + " is ");
				e.displayPrice();
				System.out.print("The calorie count of a " + entree_response + " is ");
				e.displayCalories();
				int num_of;
				System.out.println("How many " + entree_response + "s would you like? ");
				num_of = scan.nextInt();
				e.price*=num_of;
				count += num_of;
				we = e;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(entree_response.equals("Bean Burrito")){
				e.price = 2.99;
				e.calories = 386;
				System.out.print("The price of a " + entree_response + " is ");
				e.displayPrice();
				System.out.print("The calorie count of a " + entree_response + " is ");
				e.displayCalories();
				int num_of;
				System.out.println("How many " + entree_response + "s would you like? ");
				num_of = scan.nextInt();
				e.price*=num_of;
				count += num_of;
				we = e;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(entree_response.equals("Quesadilla")){
				e.price = 3.49;
				e.calories = 528;
				System.out.print("The price of a " + entree_response + " is ");
				e.displayPrice();
				System.out.print("The calorie count of a " + entree_response + " is ");
				e.displayCalories();
				int num_of;
				System.out.println("How many " + entree_response + "s would you like? ");
				num_of = scan.nextInt();
				e.price*=num_of;
				count += num_of;
				we = e;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(entree_response.equals("Chalupa"))
			{
				e.price = 2.99;
				e.calories = 360;
				System.out.print("The price of a " + entree_response + " is ");
				e.displayPrice();
				System.out.print("The calorie count of a " + entree_response + " is ");
				e.displayCalories();
				int num_of;
				System.out.println("How many " + entree_response + "s would you like? ");
				num_of = scan.nextInt();
				e.price*=num_of;
				count += num_of;
				we = e;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else{
				System.out.println(entree_response + " is not a valid entree!");
			}
			total+=e.price;
			System.out.print("Your total so far is $");
			System.out.printf("%.2f", total);
			System.out.println();
			System.out.println("Would you like to add another entree? (Yes/No) ");
			response = scan.next();
		}
		while(response.equals("Yes") || response.equals("yes") && !response.equals("No") && !response.equals("no"));
		do{
			appetizer a = new appetizer();
			System.out.println("What would you like your appetizer to be? ");
			scan = new Scanner(System.in);
			String appetizer_response;
			appetizer_response = scan.nextLine();
			a.name = appetizer_response;
			if(appetizer_response.equals("Fiesta Potatoes")){
				a.price = 3.99;
				System.out.print("The price of " + appetizer_response + " is ");
				a.displayPrice();
				int num_of;
				System.out.println("How many servings of " + appetizer_response + "s would you like? ");
				num_of = scan.nextInt();
				a.price*=num_of;
				count += num_of;
				we = a;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(appetizer_response.equals("Chips & Salsa")){
				a.price = 1.49;
				System.out.print("The price of " + appetizer_response + " is ");
				a.displayPrice();
				int num_of;
				System.out.println("How many servings of " + appetizer_response + " would you like? ");
				num_of = scan.nextInt();
				a.price*=num_of;
				count += num_of;
				we = a;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(appetizer_response.equals("Nachos")){
				a.price = 1.59;
				System.out.print("The price of a plate of " + appetizer_response + " is ");
				a.displayPrice();
				int num_of;
				System.out.println("How many plates of " + appetizer_response + " would you like? ");
				num_of = scan.nextInt();
				a.price*=num_of;
				count += num_of;
				we = a;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(appetizer_response.equals("Seasoned Rice"))
			{
				a.price = 1.49;
				System.out.print("The price of " + appetizer_response + " is ");
				a.displayPrice();
				int num_of;
				System.out.println("How many servings of " + appetizer_response + " would you like? ");
				num_of = scan.nextInt();
				a.price*=num_of;
				count += num_of;
				we = a;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else{
				System.out.println(appetizer_response + " is not a valid appetizer!");
			}
			total+=a.price;
			System.out.print("Your total so far is $");
			System.out.printf("%.2f", total);
			System.out.println();
			System.out.println("Would you like to add another appetizer? (Yes/No) ");
			response = scan.next();
		}
		while(response.equals("Yes") || response.equals("yes") && !response.equals("No") && !response.equals("no"));
		do{
			dessert d = new dessert();
			System.out.println("What would you like your dessert to be? ");
			scan = new Scanner(System.in);
			String dessert_response;
			dessert_response = scan.nextLine();
			d.name = dessert_response;
			if(dessert_response.equals("Ice Cream")){
				d.price = 2.99;
				System.out.print("The price of an " + dessert_response + " is ");
				d.displayPrice();
				int num_of;
				System.out.println("How many " + dessert_response + "s would you like? ");
				num_of = scan.nextInt();
				d.price*=num_of;
				count += num_of;
				we = d;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(dessert_response.equals("Cinnabon")){
				d.price = 1.99;
				System.out.print("The price of " + dessert_response + "s is ");
				d.displayPrice();
				int num_of;
				System.out.println("How many " + dessert_response + "s would you like? ");
				num_of = scan.nextInt();
				d.price*=num_of;
				count += num_of;
				we = d;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(dessert_response.equals("Cinnamon Twists")){
				d.price = 3.49;
				System.out.print("The price of " + dessert_response + " is ");
				d.displayPrice();
				int num_of;
				System.out.println("How many " + dessert_response + " would you like? ");
				num_of = scan.nextInt();
				d.price*=num_of;
				count += num_of;
				we = d;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else{
				System.out.println(dessert_response + " is not a valid dessert!");
			}
			total+=d.price;
			System.out.print("Your total so far is $");
			System.out.printf("%.2f", total);
			System.out.println();
			System.out.println("Would you like to add another dessert? (Yes/No) ");
			response = scan.next();
			scan.nextLine();
		}
		while(response.equals("Yes") || response.equals("yes") && !response.equals("No") && !response.equals("no"));
		String special;
		System.out.println("Enter any special instructions for your order (Enter 'none' if there isn't any)");
		special = scan.nextLine();
		order or = new order(n,total,count,special,list);
		if(or != null){
			listOfOrders.insert(or);
		}
		System.out.println("Your order includes " + count + " items.");
		list.display();
		System.out.print("Your total cost is $");
		System.out.printf("%.2f", total);
		System.out.println();
	}
	public void promptOliveGardenOrder(){
		LLL list = new LLL();
		food we;
		double total = 0;
		int count = 0;
		String response;
		String n;
		do{
			scan = new Scanner(System.in);
			System.out.println("What is the name for this order?");
			n = scan.nextLine();
			entree e = new entree();
			System.out.println("Okay " + n + ", what would you like your entree to be? ");
			scan = new Scanner(System.in);
			String entree_response;
			entree_response = scan.nextLine();
			e.name = entree_response;
			if(entree_response.equals("Pizza")){
				e.price = 12.29;
				e.calories = 2269;
				System.out.print("The price of a " + entree_response + " is ");
				e.displayPrice();
				System.out.print("The calorie count of a " + entree_response + " is ");
				e.displayCalories();
				int num_of;
				System.out.println("How many " + entree_response + "s would you like? ");
				num_of = scan.nextInt();
				e.price*=num_of;
				count += num_of;
				we = e;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(entree_response.equals("Lasagna")){
				e.price = 12.99;
				e.calories = 344;
				System.out.print("The price of a " + entree_response + " is ");
				e.displayPrice();
				System.out.print("The calorie count of a " + entree_response + " is ");
				e.displayCalories();
				int num_of;
				System.out.println("How many " + entree_response + "s would you like? ");
				num_of = scan.nextInt();
				e.price*=num_of;
				count += num_of;
				we = e;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(entree_response.equals("Cheese Ravioli")){
				e.price = 5.99;
				e.calories = 187;
				System.out.print("The price of " + entree_response + " is ");
				e.displayPrice();
				System.out.print("The calorie count of  " + entree_response + " is ");
				e.displayCalories();
				int num_of;
				System.out.println("How many servings of " + entree_response + " would you like? ");
				num_of = scan.nextInt();
				e.price*=num_of;
				count += num_of;
				we = e;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(entree_response.equals("Spaghetti"))
			{
				e.price = 7.99;
				e.calories = 221;
				System.out.print("The price of a plate of " + entree_response + " is ");
				e.displayPrice();
				System.out.print("The calorie count of a plate of " + entree_response + " is ");
				e.displayCalories();
				int num_of;
				System.out.println("How many plates of " + entree_response + " would you like? ");
				num_of = scan.nextInt();
				e.price*=num_of;
				count += num_of;
				we = e;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(entree_response.equals("Macaroni & Cheese"))
			{
				e.price = 5.99;
				e.calories = 310;
				System.out.print("The price of a serving of " + entree_response + " is ");
				e.displayPrice();
				System.out.print("The calorie count of a serving of " + entree_response + " is ");
				e.displayCalories();
				int num_of;
				System.out.println("How many servings of " + entree_response + " would you like? ");
				num_of = scan.nextInt();
				e.price*=num_of;
				count += num_of;
			}
			else{
				System.out.println(entree_response + " is not a valid entree!");
			}
			total+=e.price;
			System.out.print("Your total so far is $");
			System.out.printf("%.2f", total);
			System.out.println();
			System.out.println("Would you like to add another entree? (Yes/No) ");
			response = scan.next();
		}
		while(response.equals("Yes") || response.equals("yes") && !response.equals("No") && !response.equals("no"));
		do{
			appetizer a = new appetizer();
			System.out.println("What would you like your appetizer to be? ");
			scan = new Scanner(System.in);
			String appetizer_response;
			appetizer_response = scan.nextLine();
			a.name = appetizer_response;
			if(appetizer_response.equals("Pizza Frita")){
				a.price = 7.79;
				System.out.print("The price of " + appetizer_response + " is ");
				a.displayPrice();
				int num_of;
				System.out.println("How many " + appetizer_response + "s would you like? ");
				num_of = scan.nextInt();
				a.price*=num_of;
				count += num_of;
				we = a;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(appetizer_response.equals("Dip Duo")){
				a.price = 12.29;
				System.out.print("The price of " + appetizer_response + " is ");
				a.displayPrice();
				int num_of;
				System.out.println("How many servings of " + appetizer_response + " would you like? ");
				num_of = scan.nextInt();
				a.price*=num_of;
				count += num_of;
				we = a;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(appetizer_response.equals("Calamari")){
				a.price = 11.29;
				System.out.print("The price of " + appetizer_response + " is ");
				a.displayPrice();
				int num_of;
				System.out.println("How many servings of " + appetizer_response + " would you like? ");
				num_of = scan.nextInt();
				a.price*=num_of;
				count += num_of;
				we = a;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(appetizer_response.equals("Fried Mozzarella"))
			{
				a.price = 7.29;
				System.out.print("The price of " + appetizer_response + " is ");
				a.displayPrice();
				int num_of;
				System.out.println("How many servings of " + appetizer_response + " would you like? ");
				num_of = scan.nextInt();
				a.price*=num_of;
				count += num_of;
				we = a;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(appetizer_response.equals("Breadsticks"))
			{
				a.price = 3.99;
				System.out.print("The price of " + appetizer_response + " is ");
				a.displayPrice();
				int num_of;
				System.out.println("How many " + appetizer_response + "s would you like? ");
				num_of = scan.nextInt();
				a.price*=num_of;
				count += num_of;
				we = a;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else{
				System.out.println(appetizer_response + " is not a valid appetizer!");
			}
			total+=a.price;
			System.out.print("Your total so far is $");
			System.out.printf("%.2f", total);
			System.out.println();
			System.out.println("Would you like to add another appetizer? (Yes/No) ");
			response = scan.next();
		}
		while(response.equals("Yes") || response.equals("yes") && !response.equals("No") && !response.equals("no"));
		do{
			dessert d = new dessert();
			System.out.println("What would you like your dessert to be? ");
			scan = new Scanner(System.in);
			String dessert_response;
			dessert_response = scan.nextLine();
			d.name = dessert_response;
			if(dessert_response.equals("Buttercream Cake")){
				d.price = 7.79;
				System.out.print("The price of " + dessert_response + " is ");
				d.displayPrice();
				int num_of;
				System.out.println("How many pieces of " + dessert_response + " would you like? ");
				num_of = scan.nextInt();
				d.price*=num_of;
				count += num_of;
				we = d;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(dessert_response.equals("Cheesecake")){
				d.price = 1.99;
				System.out.print("The price of " + dessert_response + " is ");
				d.displayPrice();
				int num_of;
				System.out.println("How many pieces of " + dessert_response + " would you like? ");
				num_of = scan.nextInt();
				d.price*=num_of;
				count += num_of;
				we = d;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(dessert_response.equals("Tiramisu")){
				d.price = 3.49;
				System.out.print("The price of " + dessert_response + " is ");
				d.displayPrice();
				int num_of;
				System.out.println("How many pieces of " + dessert_response + " would you like? ");
				num_of = scan.nextInt();
				d.price*=num_of;
				count += num_of;
				we = d;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(dessert_response.equals("Zeppoli")){
				d.price = 7.49;
				System.out.print("The price of " + dessert_response + " is ");
				d.displayPrice();
				int num_of;
				System.out.println("How many servings of " + dessert_response + " would you like? ");
				num_of = scan.nextInt();
				d.price*=num_of;
				count += num_of;
				we = d;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else{
				System.out.println(dessert_response + " is not a valid dessert!");
			}
			total+=d.price;
			System.out.print("Your total so far is $");
			System.out.printf("%.2f", total);
			System.out.println();
			System.out.println("Would you like to add another dessert? (Yes/No) ");
			response = scan.next();
			scan.nextLine();
		}
		while(response.equals("Yes") || response.equals("yes") && !response.equals("No") && !response.equals("no"));
		String special;
		System.out.println("Enter any special instructions for your order (Enter 'none' if there isn't any)");
		special = scan.nextLine();
		order or = new order(n,total,count,special,list);
		if(or != null){
			listOfOrders.insert(or);
		}
		System.out.println("Your order includes " + count + " items.");
		list.display();
		System.out.print("Your total cost is $");
		System.out.printf("%.2f", total);
		System.out.println();
	}
	public void promptRedRobinOrder(){
		LLL list = new LLL();
		food we;
		double total = 0;
		int count = 0;
		String response;
		String n;
		do{
			scan = new Scanner(System.in);
			System.out.println("What is the name for this order?");
			n = scan.nextLine();
			entree e = new entree();
			System.out.println("Okay " + n + ", what would you like your entree to be? ");
			scan = new Scanner(System.in);
			String entree_response;
			entree_response = scan.nextLine();
			e.name = entree_response;
			if(entree_response.equals("Veggie Burger")){
				e.price = 9.99;
				e.calories = 124;
				System.out.print("The price of a " + entree_response + " is ");
				e.displayPrice();
				System.out.print("The calorie count of a " + entree_response + " is ");
				e.displayCalories();
				int num_of;
				System.out.println("How many " + entree_response + "s would you like? ");
				num_of = scan.nextInt();
				e.price*=num_of;
				count += num_of;
				we = e;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(entree_response.equals("Cheeseburger")){
				e.price = 9.79;
				e.calories = 303;
				System.out.print("The price of a " + entree_response + " is ");
				e.displayPrice();
				System.out.print("The calorie count of a " + entree_response + " is ");
				e.displayCalories();
				int num_of;
				System.out.println("How many " + entree_response + "s would you like? ");
				num_of = scan.nextInt();
				e.price*=num_of;
				count += num_of;
				we = e;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(entree_response.equals("Royal Red Robin")){
				e.price = 11.19;
				e.calories = 1191;
				System.out.print("The price of a " + entree_response + " is ");
				e.displayPrice();
				System.out.print("The calorie count of a " + entree_response + " is ");
				e.displayCalories();
				int num_of;
				System.out.println("How many " + entree_response + "s would you like? ");
				num_of = scan.nextInt();
				e.price*=num_of;
				count += num_of;
				we = e;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(entree_response.equals("Four Cheese Melt"))
			{
				e.price = 7.99;
				e.calories = 1070;
				System.out.print("The price of a " + entree_response + " is ");
				e.displayPrice();
				System.out.print("The calorie count of a " + entree_response + " is ");
				e.displayCalories();
				int num_of;
				System.out.println("How many " + entree_response + "s would you like? ");
				num_of = scan.nextInt();
				e.price*=num_of;
				count += num_of;
				we = e;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else{
				System.out.println(entree_response + " is not a valid entree!");
			}
			total+=e.price;
			System.out.print("Your total so far is $");
			System.out.printf("%.2f", total);
			System.out.println();
			System.out.println("Would you like to add another entree? (Yes/No) ");
			response = scan.next();
		}
		while(response.equals("Yes") || response.equals("yes") && !response.equals("No") && !response.equals("no"));
		do{
			appetizer a = new appetizer();
			System.out.println("What would you like your appetizer to be? ");
			scan = new Scanner(System.in);
			String appetizer_response;
			appetizer_response = scan.nextLine();
			a.name = appetizer_response;
			if(appetizer_response.equals("Onion Rings")){
				a.price = 8.99;
				System.out.print("The price of " + appetizer_response + " is ");
				a.displayPrice();
				int num_of;
				System.out.println("How many servings of " + appetizer_response + "s would you like? ");
				num_of = scan.nextInt();
				a.price*=num_of;
				count += num_of;
				we = a;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(appetizer_response.equals("Cheese Fries")){
				a.price = 6.99;
				System.out.print("The price of " + appetizer_response + " is ");
				a.displayPrice();
				int num_of;
				System.out.println("How many servings of " + appetizer_response + " would you like? ");
				num_of = scan.nextInt();
				a.price*=num_of;
				count += num_of;
				we = a;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(appetizer_response.equals("Spinach Dip")){
				a.price = 6.99;
				System.out.print("The price of " + appetizer_response + " is ");
				a.displayPrice();
				int num_of;
				System.out.println("How many servings of " + appetizer_response + " would you like? ");
				num_of = scan.nextInt();
				a.price*=num_of;
				count += num_of;
				we = a;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(appetizer_response.equals("Pretzel Bites"))
			{
				a.price = 4.99;
				System.out.print("The price of " + appetizer_response + " is ");
				a.displayPrice();
				int num_of;
				System.out.println("How many servings of " + appetizer_response + " would you like? ");
				num_of = scan.nextInt();
				a.price*=num_of;
				count += num_of;
				we = a;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else{
				System.out.println(appetizer_response + " is not a valid appetizer!");
			}
			total+=a.price;
			System.out.print("Your total so far is $");
			System.out.printf("%.2f", total);
			System.out.println();
			System.out.println("Would you like to add another appetizer? (Yes/No) ");
			response = scan.next();
		}
		while(response.equals("Yes") || response.equals("yes") && !response.equals("No") && !response.equals("no"));
		do{
			dessert d = new dessert();
			System.out.println("What would you like your dessert to be? ");
			scan = new Scanner(System.in);
			String dessert_response;
			dessert_response = scan.nextLine();
			d.name = dessert_response;
			if(dessert_response.equals("Double Cheesecake")){
				d.price = 5.99;
				System.out.print("The price of " + dessert_response + " is ");
				d.displayPrice();
				int num_of;
				System.out.println("How many pieces of " + dessert_response + " would you like? ");
				num_of = scan.nextInt();
				d.price*=num_of;
				count += num_of;
				we = d;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(dessert_response.equals("Kids Sundae")){
				d.price = 2.99;
				System.out.print("The price of a " + dessert_response + " is ");
				d.displayPrice();
				int num_of;
				System.out.println("How many " + dessert_response + "s would you like? ");
				num_of = scan.nextInt();
				d.price*=num_of;
				count += num_of;
				we = d;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(dessert_response.equals("Chocolate Fruffles")){
				d.price = 5.99;
				System.out.print("The price of " + dessert_response + " is ");
				d.displayPrice();
				int num_of;
				System.out.println("How many " + dessert_response + " would you like? ");
				num_of = scan.nextInt();
				d.price*=num_of;
				count += num_of;
				we = d;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(dessert_response.equals("Cinnamon Rings")){
				d.price = 8.99;
				System.out.print("The price of a tower of " + dessert_response + " is ");
				d.displayPrice();
				int num_of;
				System.out.println("How many towers of " + dessert_response + "s would you like? ");
				num_of = scan.nextInt();
				d.price*=num_of;
				count += num_of;
				we = d;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else{
				System.out.println(dessert_response + " is not a valid dessert!");
			}
			total+=d.price;
			System.out.print("Your total so far is $");
			System.out.printf("%.2f", total);
			System.out.println();
			System.out.println("Would you like to add another dessert? (Yes/No) ");
			response = scan.next();
			scan.nextLine();
		}
		while(response.equals("Yes") || response.equals("yes") && !response.equals("No") && !response.equals("no"));
		String special;
		System.out.println("Enter any special instructions for your order (Enter 'none' if there isn't any)");
		special = scan.nextLine();
		order or = new order(n,total,count,special,list);
		if(or != null){
			listOfOrders.insert(or);
		}
		System.out.println("Your order includes " + count + " items.");
		list.display();
		System.out.print("Your total cost is $");
		System.out.printf("%.2f", total);
		System.out.println();
	}
	public void promptPandaExpressOrder(){
		LLL list = new LLL();
		food we;
		double total = 0;
		int count = 0;
		String response;
		String n;
		do{
			scan = new Scanner(System.in);
			System.out.println("What is the name for this order?");
			n = scan.nextLine();
			entree e = new entree();
			System.out.println("Okay " + n + ", what would you like your entree to be? ");
			scan = new Scanner(System.in);
			String entree_response;
			entree_response = scan.nextLine();
			e.name = entree_response;
			if(entree_response.equals("Orange Chicken")){
				e.price = 6.90;
				e.calories = 380;
				System.out.print("The price of " + entree_response + " is ");
				e.displayPrice();
				System.out.print("The calorie count of a serving of " + entree_response + " is ");
				e.displayCalories();
				int num_of;
				System.out.println("How many servings of " + entree_response + " would you like? ");
				num_of = scan.nextInt();
				e.price*=num_of;
				count += num_of;
				we = e;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(entree_response.equals("Eggplant Tofu")){
				e.price = 7.79;
				e.calories = 340;
				System.out.print("The price of " + entree_response + " is ");
				e.displayPrice();
				System.out.print("The calorie count of a piece of " + entree_response + " is ");
				e.displayCalories();
				int num_of;
				System.out.println("How many pieces of " + entree_response + " would you like? ");
				num_of = scan.nextInt();
				e.price*=num_of;
				count += num_of;
				we = e;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(entree_response.equals("Mushroom Chicken")){
				e.price = 11.99;
				e.calories = 170;
				System.out.print("The price of " + entree_response + " is ");
				e.displayPrice();
				System.out.print("The calorie count of " + entree_response + " is ");
				e.displayCalories();
				int num_of;
				System.out.println("How many pieces of " + entree_response + " would you like? ");
				num_of = scan.nextInt();
				e.price*=num_of;
				count += num_of;
				we = e;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(entree_response.equals("Honey Walnut Shrimp"))
			{
				e.price = 13.49;
				e.calories = 370;
				System.out.print("The price of " + entree_response + " is ");
				e.displayPrice();
				System.out.print("The calorie count of " + entree_response + " is ");
				e.displayCalories();
				int num_of;
				System.out.println("How many servings of " + entree_response + " would you like? ");
				num_of = scan.nextInt();
				e.price*=num_of;
				count += num_of;
				we = e;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else{
				System.out.println(entree_response + " is not a valid entree!");
			}
			total+=e.price;
			System.out.print("Your total so far is $");
			System.out.printf("%.2f", total);
			System.out.println();
			System.out.println("Would you like to add another entree? (Yes/No) ");
			response = scan.next();
		}
		while(response.equals("Yes") || response.equals("yes") && !response.equals("No") && !response.equals("no"));
		do{
			appetizer a = new appetizer();
			System.out.println("What would you like your appetizer to be? ");
			scan = new Scanner(System.in);
			String appetizer_response;
			appetizer_response = scan.nextLine();
			a.name = appetizer_response;
			if(appetizer_response.equals("Cream Cheese Rangoon")){
				a.price = 4.99;
				System.out.print("The price of " + appetizer_response + " is ");
				a.displayPrice();
				int num_of;
				System.out.println("How many servings of " + appetizer_response + "s would you like? ");
				num_of = scan.nextInt();
				a.price*=num_of;
				count += num_of;
				we = a;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(appetizer_response.equals("Veggie Spring Roll")){
				a.price = 7.99;
				System.out.print("The price of a " + appetizer_response + " is ");
				a.displayPrice();
				int num_of;
				System.out.println("How many " + appetizer_response + "s would you like? ");
				num_of = scan.nextInt();
				a.price*=num_of;
				count += num_of;
				we = a;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(appetizer_response.equals("Chicken Potsticker")){
				a.price = 6.99;
				System.out.print("The price of a plate of " + appetizer_response + "s is ");
				a.displayPrice();
				int num_of;
				System.out.println("How many plates of " + appetizer_response + "s would you like? ");
				num_of = scan.nextInt();
				a.price*=num_of;
				count += num_of;
				we = a;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(appetizer_response.equals("Crispy Shrimp"))
			{
				a.price = 5.99;
				System.out.print("The price of " + appetizer_response + " is ");
				a.displayPrice();
				int num_of;
				System.out.println("How many servings of " + appetizer_response + " would you like? ");
				num_of = scan.nextInt();
				a.price*=num_of;
				count += num_of;
				we = a;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else{
				System.out.println(appetizer_response + " is not a valid appetizer!");
			}
			total+=a.price;
			System.out.print("Your total so far is $");
			System.out.printf("%.2f", total);
			System.out.println();
			System.out.println("Would you like to add another appetizer? (Yes/No) ");
			response = scan.next();
		}
		while(response.equals("Yes") || response.equals("yes") && !response.equals("No") && !response.equals("no"));
		do{
			dessert d = new dessert();
			System.out.println("What would you like your dessert to be? ");
			scan = new Scanner(System.in);
			String dessert_response;
			dessert_response = scan.nextLine();
			d.name = dessert_response;
			if(dessert_response.equals("Fortune Cookie")){
				d.price = 0.99;
				System.out.print("The price of a " + dessert_response + " is ");
				d.displayPrice();
				int num_of;
				System.out.println("How many " + dessert_response + "s would you like? ");
				num_of = scan.nextInt();
				d.price*=num_of;
				count += num_of;
				we = d;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(dessert_response.equals("Egg Cake")){
				d.price = 5.99;
				System.out.print("The price of a piece of " + dessert_response + " is ");
				d.displayPrice();
				int num_of;
				System.out.println("How many pieces of " + dessert_response + " would you like? ");
				num_of = scan.nextInt();
				d.price*=num_of;
				count += num_of;
				we = d;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else if(dessert_response.equals("Thai Fried Bananas")){
				d.price = 4.99;
				System.out.print("The price of " + dessert_response + " is ");
				d.displayPrice();
				int num_of;
				System.out.println("How many " + dessert_response + " would you like? ");
				num_of = scan.nextInt();
				d.price*=num_of;
				count += num_of;
				we = d;
				for(int i = 0; i < num_of; i++){
					list.insert(we);
				}
			}
			else{
				System.out.println(dessert_response + " is not a valid dessert!");
			}
			total+=d.price;
			System.out.print("Your total so far is $");
			System.out.printf("%.2f", total);
			System.out.println();
			System.out.println("Would you like to add another dessert? (Yes/No) ");
			response = scan.next();
			scan.nextLine();
		}
		while(response.equals("Yes") || response.equals("yes") && !response.equals("No") && !response.equals("no"));
		String special = null;
		System.out.println("Enter any special instructions for your order (Enter 'none' if there isn't any)");
		special = scan.nextLine();
		order or = new order(n,total,count,special,list);
		if(or != null){
			listOfOrders.insert(or);
		}
		System.out.println("Your order includes " + count + " items.");
		list.display();
		System.out.print("Your total cost is $");
		System.out.printf("%.2f", total);
		System.out.println();
	}
	public void display(){
		listOfOrders.display();
	}
	public void detailedDisplay(){
		listOfOrders.detailedDisplay();
	}
}
