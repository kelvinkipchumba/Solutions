import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestDifferenceFinder {
    public static long findLargestDifference(List<Long> numbers) {
        if (numbers == null || numbers.size() < 2) {
            return 0; // Return 0 if the list has less than two elements
        }

        long maxDifference = 0;

        // Iterate through each pair of numbers and find the maximum difference
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                // Calculate the absolute difference between two numbers
                long difference = Math.abs(numbers.get(i) - numbers.get(j));
                // Update the maximum difference if a larger difference is found
                maxDifference = Math.max(maxDifference, difference);
            }
        }

        return maxDifference;
    }

    public static List<Long> readInputNumbers() {
        Scanner scanner = new Scanner(System.in);
        List<Long> numbers = new ArrayList<>();

        System.out.println("Enter the integers (enter 'done' to finish): ");

        // Read input until the user enters 'done'
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("done")) {
                break;
            }
            try {
                // Parse the input as a long integer and add it to the list
                long number = Long.parseLong(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
            }
        }

        scanner.close();
        return numbers;
    }

    public static void main(String[] args) {
        // Read the input numbers from the user
        List<Long> numbers = readInputNumbers();
        // Find the largest difference between any two numbers
        long largestDifference = findLargestDifference(numbers);
        // Print the result
        System.out.println("Largest difference between any two numbers is: " + largestDifference);
    }
}
