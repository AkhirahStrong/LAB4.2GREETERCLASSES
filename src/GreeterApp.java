import java.util.Scanner;

public class GreeterApp {
	
	 

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		//Prompt user for input.
		System.out.println("Choose a greeting: ");
        String greeting = scan.nextLine();
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("How much volume to add? (0 to 10):");
        int volume = scan.nextInt();
        volume = volume > 10 ? 10 : Math.max(volume, 0);
        scan.nextLine();
        System.out.println("Enter an HTML tag (no brackets):");
        String tag = scan.nextLine();
        
        //Create Class objects
        Greeter greeter = new Greeter(greeting);
        SimonGreeter simonGreeter = new SimonGreeter(greeting);
        LoudGreeter loudGreeter = new LoudGreeter(greeting);
        HtmlGreeter htmlGreeter = new HtmlGreeter(greeting, tag);
        
        
        //For loop for adding exclamation marks(loud greeting).
        for (int i = 0; i < volume; i++) {
            loudGreeter.addVolume();
        }
        
        //Create an array of classes. 

	}

}
