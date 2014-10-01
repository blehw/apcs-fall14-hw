public class Codingbat {

    //5 minnutes
    public String frontTimes(String str, int n) {
  int x = str.length();
  String a = "";
  String b = "";
  if (x < 3) {
    a = str;
  } else {
    a = str.substring(0, 3);
  }
  while (n != 0) {
    b = b + a;
    n = n -1;
  }
  return b;
}

    //5 minutes
public String stringBits(String str) {
  int x = str.length() - 1;
  int y = 0 ;
  String a = "";
  while (y <= x) {
    a = a + str.substring(y, y+1);
    y= y + 2;
    }
  return a;
}

    //15 minutes
    public String stringYak(String str) {
	String a = "";
	int x = 0;
	while (x < str.length()) {
	    if ((str.substring(x, x+1)).equals("y") && (str.substring(x+2, x+3)).equals("k")) {
		x = x + 3; 
	    } else {
		a = a + str.substring(x, x+1);
		x = x + 1;
	      
	    }
	    System.out.println(a);
	}
	return a;
    }

    //10 minutes
public int stringMatch(String a, String b) {
  int x = 0;
  int y = 0;
  int z = 0;
  if (a.length() < b.length()) {
    z = a.length();
  } else {
    z = b.length();
  }
  while (x < z - 1) {
    if ((a.substring(x, x+2)).equals(b.substring(x, x+2))) {
      y = y + 1;
      x = x + 1;
    } else {
      x = x + 1;
    }
  } 
  return y;
}
}

