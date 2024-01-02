/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle 
{
	public static void main(String[] args) 
	{
		/*Here we are getting the values of each of the sides */
		// #feedback: in java we start variable names with a non-capital letters.
		int first_side = Integer.parseInt(args[0]);
		int second_side = Integer.parseInt(args[1]);
		int third_side = Integer.parseInt(args[2]);

		/*Here, the program checks the triangle Inequality Theorem */
		/* #fedback:
  		   since the only difference between the scopes of if\else is that resulted condition inside the if,
       		   it might be better to store the result of this condition in a boolean variable than use it to print the value.
	           In that way you avoid multiply your code.
		*/
		boolean isTriangle = (first_side + second_side > third_side) && (first_side + third_side > second_side) && (second_side + third_side > first_side);
		System.out.println(first_side+", "+second_side+", "+third_side+": "+ isTriangle);
	}
}
