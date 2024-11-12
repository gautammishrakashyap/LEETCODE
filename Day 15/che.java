import java.util.Scanner;

public class che {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);  // Read a single character input

        // Convert the character to lowercase for easier comparison
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if (ch >= 'a' && ch <= 'z') {
            // If it's an alphabet but not a vowel, it's a consonant
            System.out.println(ch + " is a consonant.");
        } else {
            // If it's not an alphabet, print an error message
            System.out.println(ch + " is not a valid alphabet character.");
        }

        // Close the scanner object
        scanner.close();
    }
}
