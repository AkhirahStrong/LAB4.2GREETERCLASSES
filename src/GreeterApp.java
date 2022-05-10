import java.util.Arrays;
import java.util.Scanner;

public class GreeterApp {
	
	 

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 String greeting;
		 String name;
		 int volume;
		 String tag ="";
		
		
		//Prompt user for input.
		System.out.println("Choose a greeting: ");
         greeting = scan.nextLine();
        System.out.println("Enter your name: ");
         name = scan.nextLine();
        System.out.println("How much volume to add? (0 to 10):");
         volume = scan.nextInt();
        volume = volume > 10 ? 10 : Math.max(volume, 0);
        scan.nextLine();
        System.out.println("Enter an HTML tag (no brackets):");
         tag = scan.nextLine();
        
        //Create Class objects
        Greeter greeter = new Greeter(greeting);
        SimonGreeter simonGreeter = new SimonGreeter(greeting);
        LoudGreeter loudGreeter = new LoudGreeter(greeting);
        HtmlGreeter htmlGreeter = new HtmlGreeter(greeting, tag);
        
        
        //For loop for adding exclamation marks(loud greeting).
        for (int i = 0; i < volume; i++) {
            loudGreeter.addVolume();
        }
        
        Greeter[] greeters = { greeter, simonGreeter, loudGreeter, htmlGreeter };
        
        
   
        //HtmlGreeter htmlGreeter = new HtmlGreeter(greeting, tag);
        
        //Create an array of classes. 
        
        //Arrays.stream(greeters).forEach(g -> System.out.println(g.greet(name)));
	}

}
