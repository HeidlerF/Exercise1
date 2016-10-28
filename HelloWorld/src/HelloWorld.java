/**
 * 
 */

/**
 * @author Mohsen
 *
 */
import java.util.Scanner;


public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.println("Please enter your name: ");
		
		Scanner userInput = new Scanner(System.in);
		String userName = userInput.next();
		HelloUser user = new HelloUser(userName);		
		user.greetUser();
		
		userInput.close();		
	}
}
