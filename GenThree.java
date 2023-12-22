/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */


public class GenThree {
	public static void main(String[] args) {
		int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        int first_number =(int) (Math.random()*(second-first))+first;
        int Second_number = (int) (Math.random()*(second-first))+first;
        int third_nunmber = (int) (Math.random()*(second-first))+first;
        int min = Math.min (first_number, (Math.min(Second_number,third_nunmber)));
        System.out.println(first_number);
        System.out.println(Second_number);
        System.out.println(third_nunmber);
        System.out.println("The minimal generated number was " + min);
	}
}
