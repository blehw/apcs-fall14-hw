public class Greeter {
    private String greeting = new String("Hello");
    public String greetPerson(String name){
	return greeting + " " +  name;
    }
    public String loudGreet(String name){
	name = name.toUpperCase();
	greeting = greeting.toUpperCase();
	return greeting + " " + name;
    }
}
