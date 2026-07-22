import java.util.Scanner;

// This program calculates the factorial of a given number using a method.
public class FindFactorial {
    public static int factorial(int n){
        int fact = 1;
        
        for(int i = 1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.println("The factorial is: " + result);
    }
}
