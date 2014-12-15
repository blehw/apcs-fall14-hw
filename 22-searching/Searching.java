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
	int low = 0;
	int high = a.length - 1;
	int count = a.length / 2;

	while (count != low && count != high) {
	    if (a[count] == n) {
		return n;
	    } 
	    if (count == low || count == high) {
		return null;
	    }
	    if ((a[count]).compareTo((char)n) < 0) {
		low = count;
		count = (low + high) / 2;
	    } else {
		high = count;
		count = (low + high) / 2;
	    }
	}
	return null;
    }

    public Comparable bsearch(Comparable n, int low, int high) {
	int count = (low + high) / 2;

	while (count != low && count != high) {
	    if (a[count] == n) {
		return n;
	    } 
	    if (count == low || count == high) {
		return null;
	    }
	    if ((a[count]).compareTo((char)n) < 0) {
		rbsearch(n,count,high);
	    } else {
		rbsearch(n,low,count);
	    }
	}
	return null;
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
        System.out.println(s.bsearch('a'));
	System.out.println(s.bsearch('u'));
	System.out.println(s.rbsearch('a'));
	System.out.println(s.rbsearch('u'));
    }
}
