public class Stringy {
    public String frame(int r, int c) {
	int rowcount;
	int colcount;
	String s = "";
	for (rowcount=1;rowcount<=r;rowcount=rowcount+1) {
	    s = s + "*";
	}
	s = s + "\n";
	for (colcount=1;colcount<c;colcount=colcount+1) {
	    s = s + "*";
	    for (rowcount=1;rowcount<r-1;rowcount=rowcount+1) {
		s = s + " ";
	    }
	    s = s + "*";
	    s = s + "\n";
	}
	for (rowcount=1;rowcount<=r;rowcount=rowcount+1) {
	    s = s + "*";
	}
	s = s + "\n";
	return s;
    }
    public String stringSplosion(String str) {
	int a;
	String s = "";
	for (a=1;a<str.length()+1;a=a+1) {
	    s = s + str.substring(0,a);
	}
	return s;
    }
    public String stringX(String str) {
	int a;
	String s = "";
	if (str.length()>0) {
	    s = str.substring(0,1);
	    for (a=1;a<str.length();a=a+1) {
		if ((str.substring(a,a+1)).equals("x")) {
		} else {
		    s = s + str.substring(a,a+1);
		}
	    }
	    if (str.length()>1 && (str.substring(str.length()-1)).equals("x")) {
		s= s + "x";
	    }
	}
	return s;
    }
}
