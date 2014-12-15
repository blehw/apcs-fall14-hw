import java.io.*;
import java.util.*;

public class Searching {

    private Comparable[] a;
    private Random r = new Random();

    public Searching(int elements){
	a = new Comparable[elements];
    }

    public String toString() {
	String s = "";
	for (int i=0;i<=a.length-1;i++) {
	    s += i+": "+a[i] + "\n";
	}
	return s;
    }

    private void makeArray() {
	Comparable[] newArray = new Comparable[a.length + 1];
	for (int i=0;i<a.length;i++) {
	    newArray[i] = a[i];
	}
	a = newArray;
    }

    public boolean add(Comparable s) {
	makeArray();
	a[a.length-1] = s;
	return true;
    }
 
    public Comparable lsearch(Comparable n) {
	for (int i=0;i<a.length;i++) {
	    if (a[i] == n) {
		return a[i];
	    }
	}
	return null;
    }

    
    public Comparable bsearch(Comparable n) {
	int m = a.length / 2;
	int p = a.length / 4;

	while (true) {
	    if (a[m] == n) {
		return a[m];
	    } else {
		if (m == p) {
		    return null;
		} /* else {
		    if (a[m].compareTo(n) < 0) {
		        p = m;
			m = m + (m/2);
		    } else {
			p = m;
			m = m/2;
		    }  
		}
		  */
	    }
	}
    }
    

    public static void main(String[] args) {
	Searching s = new Searching(0);
	String letters = "abcdefghijklmnopqrstuvwxyz";

	for (int i=0;i<20;i++) {
	    s.add(letters.charAt(i));
	}

	System.out.println(s);
	System.out.println(s.lsearch('a'));
	System.out.println(s.lsearch('u'));
	System.out.println(s.bsearch('t'));
    }
}
