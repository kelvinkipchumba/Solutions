import java.util.Scanner;

class FibonacciGenerator {
    // Array to store previously computed Fibonacci numbers
    private static long[] fibCache;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTerms;
        int firstTerm;

        // Prompt the user to enter the number of terms in the Fibonacci sequence
        do {
            System.out.print("Enter the number of terms in the Fibonacci sequence (first term must be 0 or 1): ");

            String input = scanner.nextLine();
            numTerms = Integer.parseInt(input);
            firstTerm = numTerms / (int) Math.pow(10, input.length() - 1);

            // Validate the first term
            if (firstTerm != 0 && firstTerm != 1) {
                System.out.println("Invalid input. The first term must be either 0 or 1.");
                continue;
            }

            // Validate the number of terms
            if (numTerms <= 0) {
                System.out.println("Invalid input. Please enter a positive integer for the number of terms.");
                continue;
            }

            break;

        } while (true);

        System.out.println("Fibonacci sequence up to " + numTerms + " terms:");

        // Initialize the fibCache with -1 values
        fibCache = new long[numTerms + 1];
        for (int i = 0; i <= numTerms; i++) {
            fibCache[i] = -1;
        }

        // Generate and print the Fibonacci sequence
        generateFibonacciSequence(numTerms, firstTerm);

        scanner.close(); // Close the Scanner object
    }

    // Generate and print the Fibonacci sequence
    public static void generateFibonacciSequence(int numTerms, int firstTerm) {
        for (int i = 0; i < numTerms; i++) {
            System.out.print(fibonacci(i, firstTerm) + ", ");
        }
    }

    // Recursive method to compute the Fibonacci number at index 'n'
    public static long fibonacci(int n, int firstTerm) {
        // Check if the Fibonacci number is already computed and cached
        if (fibCache[n] != -1) {
            return fibCache[n];
        }

        // Base cases
        if (n == 0) {
            return firstTerm;
        }
        if (n == 1) {
            return 1;
        }

        // Compute the Fibonacci number recursively
        long fibNumber = fibonacci(n - 1, firstTerm) + fibonacci(n - 2, firstTerm);

        // Cache the computed Fibonacci number
        fibCache[n] = fibNumber;

        return fibNumber;
    }
}
