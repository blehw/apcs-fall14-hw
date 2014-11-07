public class sarray {
    private int[] data;
    private int last;

    public sarray() {
	data = new int[10];
	last = -1;
    }

    public String toString() {
	String s = "";
	for (int i=0;i<=last;i++) {
	    s += i+": "+data[i] + "\n";
	}
	return s;
    }

    private void makeArray() {
	int[] newArray = new int[data.length + 1];
	for (int i=0;i<data.length;i++) {
	    newArray[i] = data[i];
	}
	data = newArray;
    }

    public void add(int i) {
        if (last<data.length) {
	    data[last +1] = i;
	    last +=1;
	}
	if (last==data.length) {
	    makeArray();
	    data[last +1] = i;
	    last +=1;
	}
    }

    
    public void add(int index, int i) {
        
    }
    /*
    public void get(int index) {
	//get item at index
    }

    public void set(int index, int i) {
	//set item at index to int i
    }

    public int size() {
	//return number of items in set
    }

    public void remove(int index) {
	//removes item from set
    }
    */

    public static void main(String[] args) {
	sarray s = new sarray();
	s.add(1);
	s.add(4);
	System.out.println(s);
	s.add(5);	
        System.out.println(s);
    }
}
