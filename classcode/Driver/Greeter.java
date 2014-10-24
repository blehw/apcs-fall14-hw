public class Greeter {
    // instance variables are almost always private. 
    // We access them with "accessor methods" get and set.
    private String greeting = new String("Hello world");

    // constructors

    /* Notes - the name is the same as the class name
             - there is no return type(nothing between public and the name)
	     - it's ALWAYS public
	     
	     a constructor is run automatically when you initiate the class.
	     that is, if you have "Greeter g = new Greeter("Hello")
	     then Java will automatically call this constructor sending Hello
	     in as parameter g. It will then set the instance variable 
	     greeting to what g refers to, which is hello
    */

    public Greeter(String g) {
	System.out.println("In the constructor");
	greeting = g;
    }

    /* We can overload methods (including constructors) which means we 
       have more than one method with the same name. They just 
    */

    public Greeter() {
	greeting = "Hello world!"
	    }

    //regular methods

    public void setGreeting(String s){
	greeting = s;
    }

    // String is the "return type" that is, the type of the data that we
    // will send back using the return statement.
    // void is a special "return type" which means we won't be returning any
    // value.
    public String getGreeting() {
	return greeting;
    }

    public String greet() {
	//String greeting = new String("Sup!");
	return greeting;
    }

    public void ungreet() {
	System.out.println(greeting);
    }
}
