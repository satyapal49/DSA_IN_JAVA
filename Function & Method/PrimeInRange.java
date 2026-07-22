import java.util.Scanner;

// This program prints all prime numbers in a given range using a method.
public class PrimeInRange {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void isPrimeinRange(int num){
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // A simple program to print all prime numbers in a given range using a method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Prime numbers in the range 1 to " + num + " are: ");
        isPrimeinRange(num);
    }
}
