
public class LoudGreeter extends Greeter{
	
	//This field keeps track of the extra exclamation points.
	private String extra = "!";

	public LoudGreeter(String greeting) {
		super(greeting);
	}
	
	// Every time this is called, it adds an 
	//additional exclamation point to extra.
	public void addVolume() {
		extra += "!";
	}
	
	//Override the greet method to add the 
	//extra exclamation points to the end.
	@Override
	public String greet(String name) {
		return super.greet(name).toUpperCase() + extra;
		
	}

}
