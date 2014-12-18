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

    public void add(int index, Comparable s) {
	a[index] = s;
    }

    public void sort() {
	Arrays.sort(a);
    }
 
    public Comparable lsearch(Comparable n) {
	for (int i=0;i<a.length;i++) {
	    if (a[i] == n) {
		return a[i];
	    }
	}
	return null;
    }

    public Comparable bsearch(Comparable item){
	sort();
	int high = a.length;
	int low = 0;
	while ((high - low) > 0){
	    int mid = (high +low)/2;
	    int compare = a[mid].compareTo(item);
	    if (compare == 0){
		return a[mid];
	    } else if (compare > 0){
		high = mid -1;
	    } else {
		low = mid + 1;
	    }
	}
	return null;
    }
    /*
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
	    if ((a[count]).compareTo(n) < 0) {
		low = count;
		count = (low + high) / 2;
	    } else {
		high = count;
		count = (low + high) / 2;
	    }
	}
	return null;
	}
    */

    /*
    public Comparable rbsearch(Comparable n, int low, int high) {
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
    */

    public static void main(String[] args) {
	Searching s = new Searching(0);

	for (int i=0;i<20;i++) {
	    s.add(i,i);
	}

	System.out.println(s);
	System.out.println(s.lsearch('a'));
	System.out.println(s.lsearch('u'));
        System.out.println(s.bsearch('a'));
	System.out.println(s.bsearch('u'));
	//System.out.println(s.rbsearch('a'));
	//System.out.println(s.rbsearch('u'));
    }
}
