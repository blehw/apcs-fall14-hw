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
    public String tri1(int h) {
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
    public String tri2(int h) {
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
    public String tri3(int h) {
	int row;
	int stop = ((h * 2)-1)/ 2;;
	int start = stop + 1;
	int counter;
	int lastline;
	String s = "";
	for (row = 0; row < h-1; row = row + 1) {
	    for (counter=1;counter<=stop;counter=counter+1) {
		s = s + " ";
	    }
	    for (counter=counter;counter<=start;counter=counter+1) {
		s = s + "*";
	    }
	    for (counter=counter;counter<=h*2-1;counter=counter+1) {
		s = s + " ";
	    }
	    stop = stop -1;
	    start = start + 1;
	    s = s + "\n" ;
	}	    
	for (lastline=1;lastline<=h*2-1;lastline=lastline+1) {
	    s = s + "*";
	}
	s = s + "\n";
	return s;
    }
    //not working
    public String diamond(int h) {
	int top = (h-1)/2;
        int row;
	int stop = ((top * 2)-1)/ 2;;
	int start = stop + 1;
	int counter;
	int lastline;
	int middle;
	String s = "";
	for (row = 0; row < top-1; row = row + 1) {
	    s = s + " ";
	    for (counter=1;counter<=stop;counter=counter+1) {
		s = s + " ";
	    }
	    for (counter=counter;counter<=start;counter=counter+1) {
		s = s + "*";
	    }
	    for (counter=counter;counter<=top*2-1;counter=counter+1) {
		s = s + " ";
	    }
	    stop = stop -1;
	    start = start + 1;
	    s = s + "\n" ;
	}	    
	for (lastline=1;lastline<=top*2-1;lastline=lastline+1) {
	    s = s + "*";
	}
	s = s + "\n";
	for (middle=1;middle<=h;middle=middle+1) {
	    s = s + "*";
	}
	s = s + "\n";
	return s;
    }
    public String tri4(int h) {
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

