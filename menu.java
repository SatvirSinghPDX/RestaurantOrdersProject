/*
 * Name: Satvir Singh
 * PSU ID: 911285383
 * Class: CS202
 * Date: 11/29/2017
 * Assignment: 4
 * This is the class that sets up the files and is responsible for opening the correct menu file.
 */
import java.io.*;
import java.util.*;
public class menu {
	private Scanner x;
	// method that opens the file specified
	public void openFile(String restaurant){
		try{
			x = new Scanner(new File(restaurant));
		}
		catch(Exception e){
			System.out.println("Could not find file!");
		}
	}
	// method that displays the contents of any given file
	public void displayMenu(){
		while(x.hasNextLine()){
			String a = x.nextLine();
			System.out.println(a);

		}

	}
}

