public class Lab {
    public String box(int r, int c) {
	String returner = "";
	String line = "";
	while (c > 0) {
	    line = line + "*";
	    c = c -1;
	}
	while (r > 1) {
	    returner = returner + line + "\n";
	    r = r - 1;
	}
	returner = returner + line;
	return returner;
    }
}
