// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

	    int N = Integer.parseInt(args[0]);
		String mode = args[1];

		for (int i = 1; i <= N; i++) {
			int n = i;
			int steps = 1;
			
			if (mode.equals("v")) {
				System.out.print(n + " ");
			}
			while (true) {
				if (n % 2 == 0) {					
					n = n / 2;
				} else {
					n = (n * 3) + 1;
				}
				if (mode.equals("v")) {
					System.out.print(n + " ");
				}
				steps++;
				if (n == 1) {
					break;
				}
			}

			if (mode.equals("v")) {
				System.out.print("(" + steps + ")");
				System.out.println();
			}			
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
