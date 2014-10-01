public class Codingbat {
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
  }
  return a;
}
