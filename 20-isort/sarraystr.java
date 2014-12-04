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
   
    public String set(int index, String s) {
        String oldstr = data[index];
	data[index] = s;
	return oldstr;
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
	String val;
	for (int i=0;i<=last;i++) {
	    val = data[i];
	    for (k=i;k>0&&val.compareTo(data[i-1])<=0;k--) {
		data[k] = data[k-1];
	    }
	    data[k] = val;
	}
    }

    public void ssort() {
	String min = "";
	String oldstr="";
	int index=0;
	for (int i=0;i<=last;i++) {
	    int k=i;
	    min=data[k];
	    for (k=i;k<=last;k++) {
		if (data[k].compareTo(min)<0) {
		    min = data[k];
		    index=k;
		}
	    }
	    oldstr = data[i];
	    data[i] = min;
	    data[index] = oldstr;
	}

    }

    
    public static void main(String[] args) {
	sarraystr s1 = new sarraystr();
        s1.add("c");
	s1.add("z");
	s1.add("b");	
	s1.add("a");
	s1.add("q");
	System.out.println("before isort:\n"+ s1);
	s1.isort();
	System.out.println("after isort:\n"+s1);
	sarraystr s2 = new sarraystr();
	s2.add("c");
	s2.add("z");
	s2.add("b");	
	s2.add("a");
	s2.add("q");
	System.out.println("before ssort:\n"+ s2);
	s2.ssort();
	System.out.println("after ssort:\n"+s2);
    }

}
