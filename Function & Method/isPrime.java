import java.util.Scanner;

public class isPrime {
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for(int i = 2; i<= Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        // A simple program to check if a number is prime or not using a method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        boolean result = isPrime(num);
        if(result == true){
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
