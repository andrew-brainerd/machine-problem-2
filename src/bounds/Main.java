package bounds;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bounds Problem\n");
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int startingNumber = Integer.parseInt(userInput.nextLine());

        System.out.print("Enter the upper bound: ");
        int upperBound = Integer.parseInt(userInput.nextLine());

        System.out.print("Enter the step size: ");
        int step = Integer.parseInt(userInput.nextLine());

        System.out.println();
        System.out.println("Counting from " + startingNumber + " to " + upperBound + " by " + step);
        System.out.println();

        int currentNumber = startingNumber;
        int lineCount = 0;
        while (currentNumber < upperBound) {
            if (lineCount == 10) {
                System.out.println();
                lineCount = 0;
            }
            System.out.print(currentNumber + " ");
            currentNumber = currentNumber + step;
            lineCount++;
        }
    }
}
