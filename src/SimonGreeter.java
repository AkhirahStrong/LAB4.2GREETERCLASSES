
public class SimonGreeter extends Greeter{

	public SimonGreeter(String greeting) {
		super(greeting);
	}
	
	//Override the greet method to wrap the greeting with 
	//"Simon says". Include quotes around the greeting
	@Override
	public String greet(String name) {
		return String.format("Simon says ", "%s", "\"", super.greet(name), "\"");
		
	}

}
