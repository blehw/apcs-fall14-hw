import java.util.Scanner;
import java.io.*;  

public class Driver {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String name;
	String enter; 

	

	System.out.println("Welcome, young traveler! What is your name?");
	name = in.nextLine();
	System.out.println("Hello " + name + "! Enter the world of GENERIC RPG FANTASY LAND...");
	try{
	    Thread.sleep(2000);
	} catch(Exception e){}
	System.out.println("You wake up in a forest. Press enter to look around.");
	enter = in.nextLine();
        try{
	    Thread.sleep(1000);
	} catch(Exception e){}
	System.out.print(".");
	try{
	    Thread.sleep(1000);
	} catch(Exception e){}
	System.out.print(".");
	try{
	    Thread.sleep(1000);
	} catch(Exception e){}
	System.out.print(".");
	System.out.println("Well, there are a lot of trees. I mean, it's a forest.");
    }
}

