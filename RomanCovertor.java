import java.util.Scanner;

class RomanConverter {
    
    public static String intToRoman(int num) {
        // Arrays for values and corresponding Roman numerals
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40,  10, 9,   5,  4,  1};
        String[] symbols ={"M","CM", "D", "CD", "C", "XC", "L", "XL", "X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        // Convert the number
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt input
        System.out.print("Enter a number (1 to 1000): ");
        int n = scanner.nextInt();

        // Check constraint
        if (n < 1 || n > 1000) {
            System.out.println("Invalid input. Number must be between 1 and 1000.");
        } else {
            // Output result
            String romanNumeral = intToRoman(n);
            System.out.println(romanNumeral);
 }
 }
}