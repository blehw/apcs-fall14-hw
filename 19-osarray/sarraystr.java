public class sarraystr {
    private String[] data;
    private int last;

    public sarraystr() {
	data = new String[10];
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
	String[] newArray = new String[data.length + 1];
	for (int i=0;i<data.length;i++) {
	    newArray[i] = data[i];
	}
	data = newArray;
    }

    public boolean add(String s) {
        if (last<data.length) {
	    data[last +1] = s;
	    last +=1;
	}
	if (last==data.length) {
	    makeArray();
	    data[last +1] = s;
	    last +=1;
	}
	return true;
    }
    
    public void add(int index, String s) {
         if (last<index) {
	     if (index<data.length) {
		 data[index] = s;
		 last = index;
	     } else {
		 while (data.length<index+1) {
		     makeArray();
		 }
		 data[index] = s;
		 last = index;
	     }
	 } else {
	     makeArray();
	     for (int k=last;k>=index;k=k-1) {
		 data[k +1] = data[k];
	     }
	     data[index] = s; 
	     last +=1;
	 }
    }

    public int size() {
	int counter = 0;			
	for (int i=0;i<data.length;i++) {
	    if (data[i]!=null) {
		counter++;
	    }
	}
	return counter;
    }
    
    public String get(int index) {
	return data[index];
    }
   
    public void set(int index, String s) {
        String oldstr = data[index];
	data[index] = s;
    }    

    public void remove(int index) {
	try {
	    for (int i=index;i<last;i++) {
		data[i] = data[i+1];
	    }
	    data[last] = null;
	    last = last - 1;
	} catch (Exception e) {
	    System.out.println("Index out of bounds");
	}
    }

    public void isort() {
	int k;
	for (int i=last;i>0;i--) {
	    String val = data[i];
	    for (k=last;k>i;k--) {
		if (data[i].compareTo(data[k])>0) {
		    data[k] = data[k+1];
		} else {
		    set(0,val);
		}
	    }
	}
    }

    
    public static void main(String[] args) {
	sarraystr s = new sarraystr();
	System.out.println("size: " + s.size());
        s.add("hello");
	s.add("friend");
	System.out.println(s);
	s.add("boop");	
        System.out.println(s);
	System.out.println("size: " + s.size());
	s.add(2,"shmoop");
	System.out.println(s);
	System.out.println("size: " + s.size());
	System.out.println(s);
	System.out.println("index at 3: " + s.get(3));
	System.out.println("size: " + s.size());
	s.set(1,"put");
	System.out.println(s);
	s.remove(0);
	System.out.println(s);
	s.isort();
	System.out.println(s);
    }

}
