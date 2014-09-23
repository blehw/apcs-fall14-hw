public boolean mixStart(String str) {
  if (str.length() < 3) {
    return false;
  } else {
    return (str.substring(1,3)).equals("ix");
  }
}

public String makeOutWord(String out, String word) {
  return out.substring(0, out.length() / 2) + word + out.substring(out.length() / 2, out.length());
}

public String firstHalf(String str) {
  return str.substring(0, str.length() / 2);
}

