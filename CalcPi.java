// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int termsAmount = Integer.parseInt(args[0]);
		double denominator = 1;
		double sum = 0.0;
		int sign = 1;

		for (int i = 0; i < termsAmount; i++) {
			denominator = (2 * i) + 1; 
			sum = sum + sign * 1.0 /denominator;
			sign = sign * -1;
		}

		double piApproximated = sum * 4;

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + piApproximated);
	}
}
