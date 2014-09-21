public class Driver {
    public static void main(String[] args){
	String name = "winton yee";
	System.out.println("Index of ' ' is " + name.indexOf(" "));
	System.out.println("The first name is " +  name.substring(0, name.indexOf(" ")));
	System.out.println("The last name is" +  name.substring(name.indexOf(" ")));
    }
}
