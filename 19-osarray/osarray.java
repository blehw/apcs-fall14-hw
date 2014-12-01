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
		i = i + 1;
	    }
	    if (b) {
		super.add(0,s);
	    }
	}
    }

    public String set(int i, String s) {
	String old = super.get(i);
	super.remove(i);
	this.add(s);
	this.add(old);
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
	s.add("cat");
	System.out.println(s);
	s.set(1,"hello");
	System.out.println(s);
	
    }
}
