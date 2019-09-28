package temperature;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Temperature Problem\n");
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a temperature in Centigrade (<= 100 to exit): ");
        double centigradeTemperature = Double.parseDouble(userInput.nextLine());

        double totalTemperatureCentigrade = 0;
        double totalTemperatureFahrenheit = 0;
        int numInputs = 0;

        while (centigradeTemperature != -100) {
            double fahrenheitTemperature = centigradeTemperature * (9.0 / 5.0) + 32.0;
            System.out.println("Temperature: " + centigradeTemperature + "C | " + fahrenheitTemperature + "F");

            totalTemperatureCentigrade += centigradeTemperature;
            totalTemperatureFahrenheit += fahrenheitTemperature;

            centigradeTemperature = Integer.parseInt(userInput.nextLine());
            numInputs++;
        }

        double averageCentigrade = totalTemperatureCentigrade / numInputs;
        double averageFahrenheit = totalTemperatureFahrenheit / numInputs;

        System.out.println("\nDone\n");
        System.out.println("Average Centigrade Temperature: " + averageCentigrade);
        System.out.println("Average Fahrenheit Temperature: " + averageFahrenheit);
    }
}
