public class Shapes {
    public String box(int r, int c){
	String s= "";
	int row = 0;
	int col;
	while (row<r){
	    col = c;
	    while (col>0){
		s = s + "*";
		col=col-1;
	    }
	    s=s+"\n";
	    row=row+1;
	}
	return s;
    }
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
    public String triangle2(int h) {
	String t = "";
	int counter = h;
	int row = h;
	while (row > 0) {
	    while (counter > row) {
		t = t + " ";
		counter = counter - 1;
	    }
	    while (counter > 0) {
		t = t + "*";
		counter = counter - 1;
	    }
	    t = t + "\n";
	    row = row - 1;
	    counter = h;
	}
	return t;
    }	
}

