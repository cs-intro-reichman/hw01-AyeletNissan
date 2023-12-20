/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int quarter = Integer.parseInt(args[0]) / 25;
        int centleft = Integer.parseInt(args[0]) % 25;
        System.out.println("Use " + quarter + " quarter and " + centleft + " cents");
	}
}