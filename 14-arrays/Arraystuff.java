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
	    if (a[i]==value) {
		return i;
	    } else {}
	}
	return -1;
    }

    public int maxVal() {
	int max = a[0];
	for (int i=0;i<a.length;i=i+1) {
	    if (a[i]>max) {
		max = a[i];
	    } else {}
	}
	return max;
    }

    public int sum67(int[] nums) {
	int i=0;
	int sum=0;
	int othersum=0;
	while (i<nums.length) {
	    if (nums[i]==6) {
		while (nums[i]!=7) {
		    othersum = othersum + nums[i];
		    i = i + 1;
		}
	    }
	    sum = sum + nums[i];
	    i = i + 1;
	}
	sum = sum - othersum;
	return sum;
}

}
