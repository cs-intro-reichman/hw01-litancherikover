/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo 
{
	public static void main(String[] args) {
		int First_number = Integer.parseInt(args[0]);
		int Second_number = Integer.parseInt(args[1]);

		int sum = First_number + Second_number;

		System.out.println(First_number + " + " + Second_number + " = " + sum);	
	}

}
