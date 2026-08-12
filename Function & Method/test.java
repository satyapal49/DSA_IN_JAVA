public class test {
    public static void main(String[] args) {

        int decimal = 9; //
        String binary = "";
        int remainder = decimal % 2;
        binary = remainder + binary;
        decimal /= 2;

        System.out.println(remainder);
        System.out.println(decimal);

    }
}
