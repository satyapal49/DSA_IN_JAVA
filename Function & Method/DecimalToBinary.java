import java.util.Scanner;

public class DecimalToBinary {

    // This program converts a decimal number to its binary representation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();
        int num = decimal;
        String binary = "";
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2;
        }
        System.out.println("Binary representation of " + num + " is: " + binary);
    }
}
