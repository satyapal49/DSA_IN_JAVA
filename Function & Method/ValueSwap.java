public class ValueSwap {
    public static void main(String[] args) {
        // A simple program to swap two values using a temporary variable
        int a = 5;
        int b = 10;

        // Swap values using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}