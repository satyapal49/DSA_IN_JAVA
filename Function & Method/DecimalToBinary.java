public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 9;
        String binary = "";

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal /= 2;
        }

        System.out.println("Binary equivalent: " + binary);
    }
}
