import java.util.*;

 class Main {

    // Check if a number is prime
    public static boolean isPrime(int num) {
        
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of elements
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array and calculate total sum
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        // Try removing each element and check if the remaining sum is prime
        for (int i = 0; i < n; i++) {
            int newSum = totalSum - arr[i];
            if (isPrime(newSum)) {
                System.out.println(newSum);
                return; // Stop after first valid prime sum
            }
        }

        // If no prime sum is found
        System.out.println("No valid prime sum found");
    }
}
