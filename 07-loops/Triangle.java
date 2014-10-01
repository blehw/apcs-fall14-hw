public class Triangle {
    public String triangle1(int h) {
	String t = "";
	int counter = 0;
	int row = 1;
	while (row <= h) {
	    while (counter < row) {
		t = t + "*";
		counter = counter + 1;
	    }
	    t = t + "\n";
	    row = row + 1;
	    counter = 0;
	}
	return t;
    }
}
