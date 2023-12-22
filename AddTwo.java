/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo 
{
	public static void main(String[] args) {
		// here, the program gets two given numbers 
		int First_number = Integer.parseInt(args[0]);
		int Second_number = Integer.parseInt(args[1]);
		//here, the progran adds the numbers 
		int sum = First_number + Second_number;
		//we print the results
		System.out.println(First_number + " + " + Second_number + " = " + sum);	
	}

}
