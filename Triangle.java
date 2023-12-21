/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle 
{
	public static void main(String[] args) 
	{
		/*Here we are getting the given numbers */
		int First_side = Integer.parseInt(args[0]);
		int Second_side = Integer.parseInt(args[1]);
		int Third_side = Integer.parseInt(args[2]);

		/*Here, I am printing the side values */
		System.out.print(First_side + ", " + Second_side + ", " + Third_side + ": ");

		/*Here, I am checking the triangle Inequality Theorem */
		if ((First_side + Second_side > Third_side) && (First_side + Third_side > Second_side) && (Second_side + Third_side > First_side))
		{
			System.out.println("true");
		} 
		else 
		{
			System.out.println("false");
		}
	}
}
