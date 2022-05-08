
public class Greeter {
	
	//Private string for security (encapsulation).
	private String greeting;
	
	
	//Set getter and setter for app access.
	public Greeter(String greeting) {
		this.greeting = greeting; 
		
	}
	
	
	public String getGreeting() {
		return greeting;
	}
	
	
	////Sets the greeting property from a parameter.
	public void setGreeter(String greeting) {
		this.greeting = greeting;
		
	}
	
	
	//string parameter called name. It returns the composed greeting based 
	//on the greeting property and name parameter
	public String greet(String name) {
		//return greeting + ", " + name + "!";
		
		return greeting.formatted("%s, %s", greeting, name);
	}
	
	

}
