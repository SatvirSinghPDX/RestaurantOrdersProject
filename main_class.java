/*
 * Name: Satvir Singh
 * PSU ID: 911285383
 * Class: CS202
 * Date: 11/29/2017
 * Assignment: 4
 * This is the main class in which the program runs.
 */
import java.util.Scanner;
public class main_class {
	protected static Scanner scan; 
	public static void main(String[] args) {
		String another_order;
		String restaurant = null;
		prompts p = new prompts();
		BST_AVL tblist = new BST_AVL();
		BST_AVL oglist = new BST_AVL();
		BST_AVL rrlist = new BST_AVL();
		BST_AVL pelist = new BST_AVL();
		do{
			menu m = new menu();
			String r;
			scan = new Scanner(System.in);
			System.out.println("Here are your restaurant options: \n"
					+ "1) Taco Bell\n"
					+ "2) Olive Garden\n"
					+ "3) Red Robin\n"
					+ "4) Panda Express");
			System.out.println("What restaurant would you like to order from? ");
			r = scan.nextLine();
			if(r.equals("Taco Bell") || r.equals("taco bell")){
				restaurant = "Tace Bell";
				restaurants tb = new restaurants(restaurant);
				driver a = new driver("John",(int) (Math.random()*20));
				driver b = new driver("Sarah", (int) (Math.random()*20));
				driver c = new driver("Zach", (int) (Math.random()*20));
				driver d = new driver("William", (int) (Math.random()*20));
				tblist.insert(a);
				tblist.insert(b);
				tblist.insert(c);
				tblist.insert(d);
				tb.listOfDrivers = tblist;
				m.openFile("tacobell.txt");
				m.displayMenu();
				p.promptTacoBellOrder();
			}
			else if(r.equals("Olive Garden") || r.equals("olive garden")){
				restaurant = "Olive Garden";
				restaurants og = new restaurants(restaurant);
				driver a = new driver("James",(int) (Math.random()*20));
				driver b = new driver("Drake", (int) (Math.random()*20));
				driver c = new driver("Travis", (int) (Math.random()*20));
				driver d = new driver("Jay", (int) (Math.random()*20));
				oglist.insert(a);
				oglist.insert(b);
				oglist.insert(c);
				oglist.insert(d);
				og.listOfDrivers = oglist;
				m.openFile("olivegarden.txt");
				m.displayMenu();
				p.promptOliveGardenOrder();
			}
			else if(r.equals("Red Robin") || r.equals("red robin")){
				restaurant = "Red Robin";
				restaurants rr = new restaurants(restaurant);
				driver a = new driver("Robyn",(int) (Math.random()*20));
				driver b = new driver("Kaylie", (int) (Math.random()*20));
				driver c = new driver("Joe", (int) (Math.random()*20));
				driver d = new driver("Bob", (int) (Math.random()*20));
				rrlist.insert(a);
				rrlist.insert(b);
				rrlist.insert(c);
				rrlist.insert(d);
				rr.listOfDrivers = rrlist;
				m.openFile("redrobin.txt");
				m.displayMenu();
				p.promptRedRobinOrder();
			}
			else if(r.equals("Panda Express") || r.equals("panda express")){
				restaurant = "Panda Express";
				restaurants pe = new restaurants(restaurant);
				driver a = new driver("Lily", (int) (Math.random()*20));
				driver b = new driver("Liza", (int) (Math.random()*20));
				driver c = new driver("Paul", (int) (Math.random()*20));
				driver d = new driver("Emily", (int) (Math.random()*20));
				pelist.insert(a);
				pelist.insert(b);
				pelist.insert(c);
				pelist.insert(d);
				pe.listOfDrivers = pelist;
				m.openFile("pandaexpress.txt");
				m.displayMenu();
				p.promptPandaExpressOrder();
			}
			else{
				System.out.println("'" + r + "' is not a valid restaurant!");
			}
			System.out.println("Is there another order? (Yes/No)");
			another_order = scan.next();			
		}
		while(another_order.equals("Yes") || another_order.equals("yes") && !another_order.equals("No") && !another_order.equals("no"));
		p.display();
		System.out.println("Manage Orders: \n"
				+ "1) Add Order\n"
				+ "2) Remove Order\n"
				+ "3) View All Orders\n"
				+ "4) View All Orders (detailed)\n"
				+ "5) Continue");
		scan = new Scanner(System.in);
		int order_response;
		order_response = scan.nextInt();
		do{
			if(order_response == 1){
				do{
					menu m = new menu();
					String r;
					scan = new Scanner(System.in);
					System.out.println("Here are your restaurant options: \n"
							+ "1) Taco Bell\n"
							+ "2) Olive Garden\n"
							+ "3) Red Robin\n"
							+ "4) Panda Express");
					System.out.println("What restaurant would you like to order from? ");
					r = scan.nextLine();
					if(r.equals("Taco Bell") || r.equals("taco bell")){
						m.openFile("tacobell.txt");
						m.displayMenu();
						p.promptTacoBellOrder();
					}
					else if(r.equals("Olive Garden") || r.equals("olive garden")){
						m.openFile("olivegarden.txt");
						m.displayMenu();
						p.promptOliveGardenOrder();
					}
					else if(r.equals("Red Robin") || r.equals("red robin")){
						m.openFile("redrobin.txt");
						m.displayMenu();
						p.promptRedRobinOrder();
					}
					else if(r.equals("Panda Express") || r.equals("panda express")){
						m.openFile("pandaexpress.txt");
						m.displayMenu();
						p.promptPandaExpressOrder();
					}
					else{
						System.out.println("'" + r + "' is not a valid restaurant!");
					}
					System.out.println("Is there another order? (Yes/No)");
					another_order = scan.next();			
				}
				while(another_order.equals("Yes") || another_order.equals("yes") && !another_order.equals("No") && !another_order.equals("no"));
				System.out.println("Manage Orders: \n"
						+ "1) Add Order\n"
						+ "2) Remove Order\n"
						+ "3) View All Orders\n"
						+ "4) View All Orders (detailed)\n"
						+ "5) Continue");
				scan = new Scanner(System.in);
				order_response = scan.nextInt();
			}
			if(order_response == 2){
				System.out.println("Enter the name of the person whose order you would like to remove: ");
				String removal;
				scan = new Scanner(System.in);
				removal = scan.nextLine();
				p.listOfOrders.remove(removal);
				System.out.println("Manage Orders: \n"
						+ "1) Add Order\n"
						+ "2) Remove Order\n"
						+ "3) View All Orders\n"
						+ "4) View All Orders (detailed)\n"
						+ "5) Continue");
				scan = new Scanner(System.in);
				order_response = scan.nextInt();
			}
			if(order_response == 3){
				p.display();
				System.out.println("Manage Orders: \n"
						+ "1) Add Order\n"
						+ "2) Remove Order\n"
						+ "3) View All Orders\n"
						+ "4) View All Orders (detailed)\n"
						+ "5) Continue");
				scan = new Scanner(System.in);
				order_response = scan.nextInt();
			}
			if(order_response == 4){
				p.detailedDisplay();
				System.out.println("Manage Orders: \n"
						+ "1) Add Order\n"
						+ "2) Remove Order\n"
						+ "3) View All Orders\n"
						+ "4) View All Orders (detailed)\n"
						+ "5) Continue");
				scan = new Scanner(System.in);
				order_response = scan.nextInt();
			}
		}
		while(order_response != 5);
		int ask;
		System.out.println("Now that we have all the orders, let's manage the delivery.");
		System.out.println("1) Manage Taco Bell drivers\n"
				+ "2) Manage Olive Garden drivers\n"
				+ "3) Manage Red Robin drivers\n"
				+ "4) Manage Panda Express Drivers\n"
				+ "5) Quit");
		scan = new Scanner(System.in);
		ask = scan.nextInt();
		do{
			if(ask == 1){
				System.out.println("Tace Bell Drivers:");
				tblist.displayInOrder();
				System.out.println("\n1) Add a driver\n"
						+ "2) Remove All drivers\n"
						+ "3) Display All drivers\n"
						+ "4) Go back");
				int asktb;
				asktb = scan.nextInt();
				if(asktb == 1){
					System.out.println("What is the drivers name?");
					String n;
					scan.nextLine();
					n = scan.nextLine();
					System.out.println("How far is he from Taco Bell?");
					int h;
					h = scan.nextInt();
					driver new_driver = new driver(n,h);
					tblist.insert(new_driver);
					System.out.println("\n1) Add a driver\n"
							+ "2) Remove All drivers\n"
							+ "3) Display All drivers\n"
							+ "4) Go back");
					asktb = scan.nextInt();
				}
				if(asktb == 2){
					tblist.removeAll();
					System.out.println("\n1) Add a driver\n"
							+ "2) Remove All drivers\n"
							+ "3) Display All drivers\n"
							+ "4) Go back");
					asktb = scan.nextInt();
				}
				if(asktb == 3){
					tblist.displayInOrder();
				}
				if(asktb == 4){
					System.out.println("1) Manage Taco Bell drivers\n"
							+ "2) Manage Olive Garden drivers\n"
							+ "3) Manage Red Robin drivers\n"
							+ "4) Manage Panda Express Drivers\n"
							+ "5) Quit");
					ask = scan.nextInt();

				}
			}
			if(ask == 2){
				System.out.println("Olive Garden Drivers:");
				oglist.displayInOrder();
				System.out.println("\n1) Add a driver\n"
						+ "2) Remove All drivers\n"
						+ "3) Display All drivers\n"
						+ "4) Go back");
				int askog;
				askog = scan.nextInt();
				if(askog == 1){
					System.out.println("What is the drivers name?");
					String n;
					scan.nextLine();
					n = scan.nextLine();
					System.out.println("How far is he from Taco Bell?");
					int h;
					h = scan.nextInt();
					driver new_driver = new driver(n,h);
					oglist.insert(new_driver);
					System.out.println("\n1) Add a driver\n"
							+ "2) Remove All drivers\n"
							+ "3) Display All drivers\n"
							+ "4) Go back");
					askog = scan.nextInt();
				}
				if(askog == 2){
					oglist.removeAll();
					System.out.println("\n1) Add a driver\n"
							+ "2) Remove All drivers\n"
							+ "3) Display All drivers\n"
							+ "4) Go back");
					askog = scan.nextInt();
				}
				if(askog == 3){
					oglist.displayInOrder();
				}
				if(askog == 4){
					System.out.println("1) Manage Taco Bell drivers\n"
							+ "2) Manage Olive Gardeb drivers\n"
							+ "3) Manage Red Robin drivers\n"
							+ "4) Manage Panda Express Drivers\n"
							+ "5) Quit");
					ask = scan.nextInt();
				}
			}
			if(ask == 3){
				System.out.println("Red Robin Drivers:");
				rrlist.displayInOrder();
				System.out.println("\n1) Add a driver\n"
						+ "2) Remove All drivers\n"
						+ "3) Display All drivers\n"
						+ "4) Go back");
				int askrr;
				askrr = scan.nextInt();
				if(askrr == 1){
					System.out.println("What is the drivers name?");
					String n;
					scan.nextLine();
					n = scan.nextLine();
					System.out.println("How far is he from Taco Bell?");
					int h;
					h = scan.nextInt();
					driver new_driver = new driver(n,h);
					rrlist.insert(new_driver);
					System.out.println("\n1) Add a driver\n"
							+ "2) Remove All drivers\n"
							+ "3) Display All drivers\n"
							+ "4) Go back");
					askrr = scan.nextInt();
				}
				if(askrr == 2){
					rrlist.removeAll();
					System.out.println("\n1) Add a driver\n"
							+ "2) Remove All drivers\n"
							+ "3) Display All drivers\n"
							+ "4) Go back");
					askrr = scan.nextInt();
				}
				if(askrr == 3){
					rrlist.displayInOrder();
				}
				if(askrr == 4){
					System.out.println("1) Manage Taco Bell drivers\n"
							+ "2) Manage Olive Gardeb drivers\n"
							+ "3) Manage Red Robin drivers\n"
							+ "4) Manage Panda Express Drivers\n"
							+ "5) Quit");
					ask = scan.nextInt();

				}
			}
			if(ask == 4){
				System.out.println("Panda Express Drivers:");
				pelist.displayInOrder();
				System.out.println("\n1) Add a driver\n"
						+ "2) Remove All drivers\n"
						+ "3) Display All drivers\n"
						+ "4) Go back");
				int askpe;
				askpe = scan.nextInt();
				if(askpe == 1){
					System.out.println("What is the drivers name?");
					String n;
					scan.nextLine();
					n = scan.nextLine();
					System.out.println("How far is he from Taco Bell?");
					int h;
					h = scan.nextInt();
					driver new_driver = new driver(n,h);
					pelist.insert(new_driver);
					System.out.println("\n1) Add a driver\n"
							+ "2) Remove All drivers\n"
							+ "3) Display All drivers\n"
							+ "4) Go back");
					askpe = scan.nextInt();
				}
				if(askpe == 2){
					pelist.removeAll();
					System.out.println("\n1) Add a driver\n"
							+ "2) Remove All drivers\n"
							+ "3) Display All drivers\n"
							+ "4) Go back");
					askpe = scan.nextInt();
				}
				if(askpe == 3){
					pelist.displayInOrder();
				}
				if(askpe == 4){
					System.out.println("1) Manage Taco Bell drivers\n"
							+ "2) Manage Olive Gardeb drivers\n"
							+ "3) Manage Red Robin drivers\n"
							+ "4) Manage Panda Express Drivers\n"
							+ "5) Quit");
					ask = scan.nextInt();

				}
			}
		}while(ask != 5);
	}
}
