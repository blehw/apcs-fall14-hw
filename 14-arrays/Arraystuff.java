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
	    a[i] = 75 + rnd.nextInt(5);
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

    public int freq(int i){
	int count=0;
	for (int k=0;k<a.length;k=k+1) {
	    if (a[k]==i){
		count=count+1;
	    }
	}
	return count;
    }

    public int sum67(int[] nums) {
	int i=0;
	int sum=0;
	int othersum=0;
	while (i<nums.length) {
	    if (nums[i]==6) {
		while (nums[i]!=7) {
		    i = i + 1;
		} 
		i = i + 1;
	    } else {
		sum = sum + nums[i];
		i = i + 1;
	    } 
	}
	return sum;
    }

    public boolean more14(int[] nums) {
	int ones = 0;
	int fours = 0;
	for (int i=0;i<nums.length;i=i+1) {
	    if (nums[i]==1) {
		ones = ones + 1;
	    }
	    if (nums[i]==4) {
		fours = fours + 1;
	    }
	}
	if (ones > fours) {
	    return true;
	} else {
	    return false;
	}
    }

    public int[] tenRun(int[] nums) {
	for(int i = 0; i <nums.length; i ++){
	    if (nums[i]%10==0){
		if (i+1<nums.length){
		    if (nums[i+1]%10!=0){
			nums[i+1]=nums[i];
		    }
		}
	    }
	}
	return nums;
    }

    public boolean tripleUp(int[] nums) {
	for (int i=0;i<nums.length-2;i=i+1) {
	    if (nums[i+1] - nums[i] == 1) {
      if (nums[i+2] - nums[i+1] == 1) {
	  return true;
      }
	    }
	}
	return false;
    }

    public boolean canBalance(int[] nums) {
	int sum = 0;
	for (int i=0;i<nums.length;i=i+1) {
	    sum = sum + nums[i];
	}
	double half = sum/2.0;
	for (int i=0;i<nums.length;i=i+1) {
	    half = half - nums[i];
	    if (half == 0) {
		return true;
	    }
	}
	return false;
    }

    public int[] seriesUp(int n) {
	int[] nums = new int[(n*(n+1))/2];
	int a=0;
	for (int i=0;i<n;i=i+1){
	    for (int k=0;k<i+1;k=k+1){
		nums[a]=k+1;
		a+=1;
	    }
	}
	return nums;
    }

    /* does not work yet
    public int maxMirror(int[] nums) {
	int counter = 0;
	int increment = 1;
	int[] current;
	for (int i=0;i<nums.length;i=i+1) {
	    for (int k=i;k<nums.length;k=k+1) {
		if (nums[i] == nums[k]) {
		    counter = counter + 1;
		    while (nums[i+increment] == nums[k-increment]) {
			counter = counter + 1;
			increment = increment + 1;
		    }
		}
	    }
	}
	return counter;
    }
    */

    /*array with buckets*/
  
    public int mode() {
	int i = 0;
	int count = 1;
	int mode = a[i];
	for (i=0;i<a.length;i=i+1) {
	    if (freq(a[i]) > count) {
		mode = a[i];
		count = freq(a[i]);
	    }
	}
	return mode;
    }

}
