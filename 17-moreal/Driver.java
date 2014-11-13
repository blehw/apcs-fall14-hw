import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	for (int i=0;i<10;i++) {
	    al.add(i);
	}
	System.out.println(al);

	Random r = new Random();
	ArrayList<Integer> newal = new ArrayList<Integer>();
	
	for (int i=10;i>0;i--) {
	    int q = r.nextInt(i);
	    newal.add(al.get(q));
	    al.remove(q);
	}

	System.out.println(newal);

	int[] a = new int[10];
	for (int i=0;i<10;i++) {
	    a[i] = i;
	}

	String s = "";
	
	for (int i=0;i<10;i++) {
	    s = s + a[i] + ", ";
	}
	

	System.out.println(s);
	
    }
}
