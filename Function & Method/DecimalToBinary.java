import java.util.Scanner;

public class DecimalToBinary {

    // This program converts a decimal number to its binary representation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");                 //  Prompt the user to enter a decimal number
        int decimal = sc.nextInt();                                     // Read the decimal number input from the user
        int num = decimal;                                               // Store the original decimal number for display purposes
        String binary = "";                                             // Initialize an empty string to store the binary representation
        while (decimal > 0) {                                             // Continue the loop until the decimal number becomes 0
            int remainder = decimal % 2;                                // Calculate the remainder when the decimal number is divided by 2
            binary = remainder + binary;                                   // Prepend the remainder to the binary string
            decimal = decimal / 2;                                          // Update the decimal number by dividing it by 2
        }
        System.out.println("Binary representation of " + num + " is: " + binary);
    }
}
