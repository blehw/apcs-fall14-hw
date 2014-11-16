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

	int[]b = new int[10];
	int x = 10;
	int k = 0;

	while (x>0) {
	    int q = r.nextInt(x);
	    b[q] = a[k];
	    k = k + 1;
	    x = x - 1;
	    
	}
	    

	String z = "";
	
	for (int i=0;i<10;i++) {
	    z = z + b[i] + ", ";
	}
	
	System.out.println(s);
	System.out.println(z);
	
    }
}
