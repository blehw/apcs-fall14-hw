import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	Random r = new Random();
        for (int i = 0; i < 20; i++) {
	    al.add(r.nextInt(5));
	}
	System.out.println(al);
	for (int k = 0; k < al.size()-1; k++) {
	    if (al.get(k) == al.get(k+1)) {
		for (int i = 0; i < al.size()-1; i++) {
		    if (al.get(i) == al.get(i+1)) {
			al.remove(i+1);
		    }
		}
		k = 0;
	    }
	}
	System.out.println(al);
    }
}
