public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        int total = sum(numbers); // Calculate the total sum of numbers using the helper method sum()
        return (double) total / numbers.length; // Calculate and return the average by dividing the total sum by the length of the array
    }

    private static int sum(int[] numbers) {
        int total = 0; // Initialize a variable to store the sum of numbers
        for (int number : numbers) {
            total += number; // Accumulate the sum by adding each number in the array
        }
        return total; // Return the calculated sum
    }

    public static void main(String[] args) {
        int[] data = {5, 10, 15, 20, 25}; // Initialize an array of numbers
        double average = calculateAverage(data); // Call the calculateAverage method to obtain the average of the numbers in the array
        System.out.println("The average is: " + average); // Print the calculated average
    }
}
