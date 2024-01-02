/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo 
{
	public static void main(String[] args) {
		// #feedback: in java we start variable names with a non-capital letters.
		// here, the program gets two given numbers 
		int first_number = Integer.parseInt(args[0]);
		int second_number = Integer.parseInt(args[1]);
		//here, the progran adds the numbers 
		int sum = first_number + second_number;
		//we print the results
		System.out.println(first_number + " + " + second_number + " = " + sum);	
	}

}
