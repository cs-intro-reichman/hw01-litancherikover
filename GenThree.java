/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */

import java.util.Random;

public class GenThree {
	public static void main(String[] args) {
		Random random = new Random();
		//The numbers that are going to create the range
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		//here, the program generates 3 numbers 
        int First_number = a + random.nextInt(b - a);
        int Second_number = a + random.nextInt(b - a);
        int Third_nmber = a + random.nextInt(b - a);

        // those are the numbers we managed to generate 
        System.out.println("The generated numbers: " + First_number + ", " + Second_number + ", " + Third_nmber);

        // we are going to use the min funcion in order to use the minimal number
        int Minimal_number = Math.min(Math.min(First_number, Second_number), Third_nmber);

        // printing the minimal number
        System.out.println("The minimal number: " + Minimal_number);	
	}
}
