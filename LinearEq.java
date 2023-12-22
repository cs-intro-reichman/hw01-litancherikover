/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq 
{
	public static void main(String[] args)
	{
		/*Here, i am getting the arguments according to the description above*/
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);	
		/*Here, I am calculating the value of x */
		double x = (c - b) / a;
		//here, the program prints the given form and the value of x
		System.out.println(a + " * x + " + b + " = " + c);
		System.out.println("x = " + x);
	}
}