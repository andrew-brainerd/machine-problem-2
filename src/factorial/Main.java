package factorial;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Factorial Problem");
        Scanner userInput = new Scanner(System.in);

        String userContinue = "y";
        while (userContinue.equals("y")) {
            System.out.print("\nEnter a number to compute factorial: ");
            int factorialNumber = Integer.parseInt(userInput.nextLine());

            int currentNumber = 1, factorial = factorialNumber;
            while (currentNumber < factorialNumber) {
                int tempFactorial = factorial;
                factorial = factorial * (factorialNumber - currentNumber);
                System.out.println(tempFactorial + " x " + (factorialNumber - currentNumber) + " = " + factorial);
                currentNumber++;
            }

            System.out.println("\nFactorial for " + factorialNumber + " is " + factorial);

            System.out.print("\nDo another factorial calculation? ");
            userContinue = userInput.nextLine().trim();
        }
    }
}
