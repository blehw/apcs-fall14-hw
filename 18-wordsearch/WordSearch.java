/**
 * Creates a word search puzzle
 *
 */
public class WordSearch{

    private char[][] board;
    
    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
	
    }
    public WordSearch(){
	this(20,30);
    }
    
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
    
    public void addWordH(String w,int row, int col){
	int r = row, c = col;

	if (r>=20) {
	    r = 19;
	}

	if (c>=30-w.length()) {
	    c = 30-w.length();
	}

	int d= c;
	
	for (int i=0;i<w.length();i++) {
	    if (board[r][d] != w.charAt(i) && board[r][d] != '.') {
		throw new ArrayIndexOutOfBoundsException();
	    }
	    d++;
	}

	for (int i=0;i<w.length();i++) {
	    board[r][c] = w.charAt(i);
	    c++;
	}
    }	   

    public void addWordHbw(String w,int row, int col){
	int r = row, c = col;

	if (r>=20) {
	    r = 19;
	}

	if (c>=30-w.length()) {
	    c = 30-w.length();
	}

	int d= c;
	
	for (int i=w.length()-1;i>=0;i--) {
	    if (board[r][d] != w.charAt(i) && board[r][d] != '.') {
		throw new ArrayIndexOutOfBoundsException();
	    }
	    d++;
	}

	for (int i=w.length()-1;i>=0;i--) {
	    board[r][c] = w.charAt(i);
	    c++;
	}
    }

    public void addWordV(String w,int row, int col){
	int r = row, c = col;
	
	if (r>=20) {
	    r = 20-w.length();
	}

	if (c>=30-w.length()) {
	    c = 29;
	}

	int d= r;
	
	for (int i=0;i<w.length();i++) {
	    if (board[d][c] != w.charAt(i) && board[d][c] != '.') {
		throw new ArrayIndexOutOfBoundsException();
	    }
	    d++;
	}

	for (int i=0;i<w.length();i++) {
	    board[r][c] = w.charAt(i);
	    r++;
	}
    }	   

    public void addWordVbw(String w,int row, int col){
	int r = row, c = col;

	if (r>=20) {
	    r = 20-w.length();
	}

	if (c>=30-w.length()) {
	    c = 29;
	}

	int d= r;
	
	for (int i=w.length()-1;i>=0;i--) {
	    if (board[d][c] != w.charAt(i) && board[d][c] != '.') {
		throw new ArrayIndexOutOfBoundsException();
	    }
	    d++;
	}

	for (int i=w.length()-1;i>=0;i--) {
	    board[r][c] = w.charAt(i);
	    r++;
	}
    }
    
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordH("hello",3,0);
	System.out.println(w);
	w.addWordH("look",3,3);
	System.out.println(w);
	w.addWordH("hello",100,500);
	w.addWordH("hello",5,555);
	System.out.println(w);
	w.addWordHbw("boop",5,5);
	System.out.println(w);
	w.addWordV("trello",10,15);
	System.out.println(w);
	w.addWordVbw("foo",10,5);
	System.out.println(w);
	w.addWordV("trello",155,155);
	System.out.println(w);
    }
}
