import java.util.Arrays;
import java.util.Scanner;

public class GreeterApp {
	
	 

	//@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 String greeting;
		 String name;
		 int volume = 0;
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
        
        //Greeting Class
        Greeter greeter = new Greeter(greeting);
        Greeter greet = new Greeter(name);
        System.out.println(greeter.greet(name) + " " + greet.greet(greeting) + "!");
        
        //Simon's greeting class
        SimonGreeter simonGreeter = new SimonGreeter(greeting);
        System.out.println(simonGreeter.greet(name) + greeter.greet(name) 
          +" " +greet.greet(greeting) + "!");
        

        //For loop for adding exclamation marks(loud greeting).
        LoudGreeter loudGreeter = new LoudGreeter(greeting);
        for (int i = 0; i < volume; i++) {
            loudGreeter.addVolume();
        }
		System.out.println(loudGreeter.greet(name));
        
        //HTML greeter class
        HtmlGreeter htmlGreeter = new HtmlGreeter(greeting, tag);
        System.out.println(htmlGreeter.setTagName(tag));
	}

}
