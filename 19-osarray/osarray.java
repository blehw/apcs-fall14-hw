public class osarray extends sarraystr {

    public void add(String s) {
	if (super.size() == 0) {		
	    super.add(s);
	} else {
	    int i = 0;
	    boolean b = true;
	    while (i<super.size() && b) {
		if ((s.substring(0,1)).compareTo((super.get(i)).substring(0,1)) <= 0) {
		    super.add(i,s);
		    b = false;
		}
		/*
		if ((s.substring(0,1)).compareTo((super.get(i)).substring(0,1)) == 0) {
		    int j = 1;
		    while ((s.substring(j,j+1)).compareTo((super.get(i)).substring(j,j+1)) == 0) {
			if (j > s.length()) {
			    super.add(j,s);
			} else if (j < super.get(i).length()) {
			    super.add(j+1,s);
			} else if ((s.substring(j,j+1)).compareTo((super.get(i)).substring(j,j+1)) < 0) {
			    super.add(j,s);
			    b = false;
			}
			j = j + 1;
		    }
		}
		*/	    
		i = i + 1;
	    }
	    if (b) {
		super.add(s);
	    }
	}
    }

    public void add(int index, String s) {
	this.add(s);
    }

    public String set(int i, String s) {
	String old = super.get(i);
	super.remove(i);
	this.add(s);
	return old;
    }
 
    public static void main(String[] args) {
	osarray s = new osarray();
	s.add("hello");
	System.out.println(s);
	s.add("b");
	System.out.println(s);
	s.add("a");
	System.out.println(s);
	s.add("demo");
	System.out.println(s);
	s.add("cat");
	System.out.println(s);
	s.add(0,"y");
	System.out.println(s);
	s.add("add");
	System.out.println(s);	
	s.set(1,"hello");
	System.out.println(s);
	
    }
}
