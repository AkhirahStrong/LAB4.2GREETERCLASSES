
public class HtmlGreeter extends Greeter{
	
	//String to add a tag name for HTML format.
	private String tagName;
	
	//Always sets tagName to "h1".
	public HtmlGreeter(String greeting) {
		super(greeting);
		tagName = "h1";
	}
	
	
	//Sets greeting on the superclass.
	//Sets the tagName property.
	public HtmlGreeter(String greeting, String tagName) {
		super(greeting);
		setTagName(tagName);
	}

	/*Override the greet method to wrap the result in the specified HTML tag. For example, 
	 * greet might return "<h1>Hello, Grant!</h1>".*/
	public String setTagName(String name) {
		return ( "<" + tagName + ">" + super.greet(name) + "<" + tagName + ">" );
		
	} 
	
	//Return tagName to extract in main method.
	public String getTagName() {
		return tagName;
	}

}
