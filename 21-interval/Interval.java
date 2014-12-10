import java.io.*;
import java.util.*;

class Interval implements Comparable {

    private int low,high;
    private static Random r = new Random();				
    private static int numIntervals = 0;
    
    public Interval(int l, int h){
	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }
    
    public Interval() {
	int l = r.nextInt(100);
	int h = l + 1 + r.nextInt(100);
	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }
    
    public int getLow() {
	return low;
    }

    public int getHigh() {
	return high;
    }
    
    public String toString() {
	//String s = "Inteval: "+numIntervals+": "+ "["+low+","+high+"]";
	String s = "["+low+","+high+"]";
	
	return s;
    }

    /*
    Interface: a specification that lists methods
    method signature;
    signature is pub/priv return type name(params);

    Interface Comprable {
	public int compareTo(object other);
    }

    a class that implements an interface must define  
    all the methods in the interface

    you can only extend one class but you can
    implement multiple interfaces
    */

    public int compareTo(Object other) {
	//cast other to the appropriate type and store
	//to a local variable for convenience
    
	Interval o = (Interval)other;
	
	if (o.getLow() == this.low) {
	    return this.high - o.high;
	} else {
	    return this.low-o.low;
	}
    }
    
    public static void printstuff() {
	System.out.println("Stuff");
    }
    
    public static void main(String[] args) {
	/*
	Interval ival = new Interval();
	ival.printstuff(); // normal calling off of an instance
	printstuff(); // since printStuff is static we can call it without an instance
	Interval.printstuff(); // we can also call it right off a class
	Collections.sort(n);
	*/

	
	Interval[] a = new Interval[10];
	for (int i = 0; i < a.length; i++) {
	    a[i] = new Interval();
	}
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));

	/*
	Interval a = new Interval(6,8);
	Interval b = new Interval(2,6);
	System.out.println(a.compareTo(b));
	*/

	String[] sa = {"blah", "gracie", "gold", "swift", "nineteen"};
	System.out.println(Arrays.toString(sa));
	Arrays.sort(sa);
	System.out.println(Arrays.toString(sa));
    }
}
