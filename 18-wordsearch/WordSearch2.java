/**
 * Creates a word search puzzle
 *
 */

import java.io.*;
import java.util.*;

public class WordSearch2{

    private char[][] board;
    Random rand = new Random();
    
    public WordSearch2(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}	
    }

    public WordSearch2(){
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
    
    public int checkrow(int row) {
	if (row>=20) {
	    row = 19;
	}
	return row;
    }

    public int checkcol(String w, int col) {
	if (col>=30-w.length()) {
	    col = 30-w.length();
	}
	return col;
    }

    public void checkbounds(String w, int r, int c, int o) {
	if (r==o) {
	    for (int i=0;i<w.length();i++) {
		if (board[r][c] != w.charAt(i) && board[r][c] != '.') {
		    throw new ArrayIndexOutOfBoundsException();
		}
		r++;
	    }
	} else {
	    for (int i=0;i<w.length();i++) {
		if (board[r][c] != w.charAt(i) && board[r][c] != '.') {
		    throw new ArrayIndexOutOfBoundsException();
		}
		c++;
	    }
	}
    }
	

    public void addWordH(String w,int row, int col){
	int r = checkrow(row);
	int c = checkcol(w,col);

	checkbounds(w,r,c,c);

	for (int i=0;i<w.length();i++) {
	    board[r][c] = w.charAt(i);
	    c++;
	}
    }	   

    public void addWordHbw(String w,int row, int col){
	int r = checkrow(row);
	int c = checkcol(w,col);
	
	checkbounds(w,r,c,c);

	for (int i=0;i<w.length();i++) {
	    board[r][c] = w.charAt(i);
	    c--;
	}
    }

    public void addWordV(String w, int row, int col) {
	int r = checkrow(row);
	int c = checkcol(w,col);
	
	checkbounds(w,r,c,r);

	for (int i=0;i<w.length();i++) {
	    board[r][c] = w.charAt(i);
	    r++;
	}
    }

    public void addWordVbw(String w, int row, int col) {
	int r = checkrow(row);
	int c = checkcol(w,col);

	checkbounds(w,r,c,r);

	for (int i=0;i<w.length();i++) {
	    board[r][c] = w.charAt(i);
	    r--;
	}
    }

    public void addWordD(String w, int row, int col, boolean left) {
	int r = checkrow(row);
	int c = checkcol(w,col);

	checkbounds(w,r,c,r);
	checkbounds(w,r,c,c);

	for (int i=0;i<w.length();i++) {
	    board[r][c]=w.charAt(i);
	    if (left) {
		r--;
		c--;
	    } else {
		r--;
		c++;
	    }
	}
    }

    public void addWordDbw(String w, int row, int col, boolean left) {
	int r = checkrow(row);
	int c = checkcol(w,col);

	checkbounds(w,r,c,r);
	checkbounds(w,r,c,c);

	for (int i=w.length()-1;i>=0;i--) {
	    board[r][c]=w.charAt(i);
	    if (left) {
		r--;
		c--;
	    } else {
		r--;
		c++;
	    }
	}
    }

    

    public boolean addWord(String w) {
	int r = rand.nextInt(20);
	int c = rand.nextInt(30);
	int method = rand.nextInt(6);
	int way = rand.nextInt(2);
	if (method == 0) {
	    addWordH(w,r,c);
	    return true;
	}
	if (method == 1) {
	    addWordHbw(w,r,c);
	    return true;
	}
	if (method == 2) {
	    addWordV(w,r,c);
	    return true;
	}
	if (method == 3) {
	    addWordVbw(w,r,c);
	    return true;
	}
	if (method == 4) {
	    if (way == 0) {
		addWordD(w,r,c,true);
		return true;
	    } else {
		addWordD(w,r,c,false);
		return true;
	    }
	}
	if (method == 5) {
	    if (way == 0) {
		addWordDbw(w,r,c,true);
		return true;
	    } else {
		addWordDbw(w,r,c,false);
		return true;
	    }
	} else {
	    return false;
	}
    }
    
    public static void main(String[] args) {
	WordSearch2 w = new WordSearch2();
	/*
	w.addWordH("hello",3,0);
	w.addWordH("look",3,7);
	w.addWordH("hello",100,500);
	w.addWordH("hello",5,555);
	w.addWordHbw("hello",7,555);
	w.addWordHbw("backwards",17,15);
	w.addWordV("hello",7,14);
	w.addWordVbw("hello",7,14);
	w.addWordD("hello",6,8,true);
	w.addWordDbw("hello",15,16,true);
	w.addWordD("hello",15,2,false);
	*/
	System.out.println(w.addWord("hello"));
	System.out.println(w);
	}
}
