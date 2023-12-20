/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) 
	{
		int Total_cents=56;
		int quarters = Total_cents / 25;
        int remainingCents = Total_cents % 25;

        // Print the result
        System.out.println("Quarters: " + quarters);
        System.out.println("Remaining cents: " + remainingCents);

	}
}