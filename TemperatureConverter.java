import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fixed conversion
        double fixedFahrenheit = 98.6;
        double fixedCelsius = (fixedFahrenheit - 32) * 5 / 9;
        System.out.printf("[Fixed Value] %.2f°F = %.2f°C\n", fixedFahrenheit, fixedCelsius);

        while (true) {
            System.out.print("\nEnter temperature in Fahrenheit: ");
            double userFahrenheit = scanner.nextDouble();

            if (userFahrenheit < -459.67) {
                System.out.println("Invalid input: Temperature below absolute zero!");
                continue;
            }

            double userCelsius = (userFahrenheit - 32) * 5 / 9;
            double reverseFahrenheit = (userCelsius * 9 / 5) + 32;
            double kelvin = (userFahrenheit - 32) * 5 / 9 + 273.15;

            System.out.printf("[User Input] %.2f°F = %.2f°C\n", userFahrenheit, userCelsius);
            System.out.printf("[Reverse] %.2f°C = %.2f°F\n", userCelsius, reverseFahrenheit);
            System.out.printf("[Kelvin] %.2f°F = %.2fK\n", userFahrenheit, kelvin);

            System.out.print("Do you want to convert another? (y/n): ");
            scanner.nextLine(); // clear leftover newline
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                System.out.println("Thank you for using the converter. Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}
