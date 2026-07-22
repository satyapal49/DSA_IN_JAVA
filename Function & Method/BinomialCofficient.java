// This program calculates the binomial coefficient (n choose r) using a method.

public class BinomialCofficient {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binimialCoffient (int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nmrFact = factorial(n-r);

        int binimialCoffient = nFact / (rFact * nmrFact);
        return binimialCoffient;
    }


    public static void main(String Args[]){
        System.out.println(binimialCoffient(8,4));
    }
}

