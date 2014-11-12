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
         if (last<index) {
	     if (index<data.length) {
		 data[index] = i;
		 last = index;
	     } else {
		 while (data.length<index+1) {
		     makeArray();
		 }
		 data[index] = i;
		 last = index;
	     }
	 } else {
	     makeArray();
	     for (int k=last;k>=index;k=k-1) {
		 data[k +1] = data[k];
	     }
	     data[index] = i; 
	     last +=1;
	 }
    }

    public int size() {
	int counter = 0;			
	for (int i=0;i<data.length;i++) {
	    if (data[i]!=0) {
		counter++;
	    }
	}
	return counter;
    }
    
    public int get(int index) {
	try {
	    return data[index];
	} catch (Exception e) {
	    System.out.println("Index out of bounds");
	}
    }

    public int set(int index, int i) {
        int oldval = data[index];
	data[index] = i;
	return oldval;
    }    

    public int remove(int index) {
	try {
	    int oldval = data[index];
	    data[index] = 0;
	    return oldval;
	} catch (Exception e) {
	    System.out.println("Index out of bounds");
	}
    }

    public static void main(String[] args) {
	sarray s = new sarray();
        s.add(1);
	s.add(4);
	System.out.println(s);
	s.add(5);	
        System.out.println(s);
	System.out.println("size: " + s.size());
	s.add(2,3);
	System.out.println(s);
	s.add(11,5);
	System.out.println(s);
	System.out.println("index at 3: " + s.get(3));
	System.out.println("size: " + s.size());
	System.out.println(s.set(1,10));
	System.out.println(s);
	System.out.println(s.remove(0));
	System.out.println(s);
    }
}
