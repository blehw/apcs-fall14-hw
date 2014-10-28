import java.util.*;

public class Arraystuff {
    private int[] a;
    private Random rnd; 

    /* by making it final we can't change it after
       the initial assignment
    */
    
    public final int final_example = 123;

    public Arraystuff(int n) {
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i=i+1) {
	    a[i] = 75 + rnd.nextInt(76);
	}
    }
    
    public Arraystuff() {
	this(100);
    }

    public String toString() {
	String s = "";
	for (int i=0;i<a.length;i=i+1) {
	    s = s + a[i]  + ", ";
	}
	return s;
    }

    /*
    public String toString() {
	String s = "" + a.length;
	s = s + final_example;
	//final_example = 321;
	return s;
    }
    */

    public int find(int value) {
	for (int i=0;i<a.length;i=i+1) {
	    if (a[i].equals(value)) {
		return i;
	    } else {}
	}
	return -1;
    }

    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	System.out.println(as);
    }
}
