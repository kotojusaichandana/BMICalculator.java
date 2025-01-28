 import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (in kilograms): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Determine and display BMI category
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Category: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obesity");
        }

        scanner.close();
    }
}


