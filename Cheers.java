//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String input = args[0];
            String upperCaseInput = input.toUpperCase();
            int cheerTimes = Integer.parseInt(args[1]);
            int length = input.length();
            String a_an = "";
            String anLetters = "AEFHILMNORSX";

            for (int i = 0; i < length; i++) {
                char c = upperCaseInput.charAt(i);
                if (anLetters.indexOf(c) == -1) {
                        a_an = "a ";
                } else {
                        a_an = "an ";
                }
                System.out.println("Give me " + a_an + upperCaseInput.charAt(i) + 
                ": " + upperCaseInput.charAt(i) + "!");
            }

            System.out.println("What does that spell?");

            for (int i = 0; i < cheerTimes; i++) {
                System.out.println(upperCaseInput + "!!!");
            }

        }
}