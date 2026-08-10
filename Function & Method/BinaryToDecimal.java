import java.util.Scanner;

// This program converts a binary number to its decimal equivalent.
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        int ans = 0;
        int pw = 1;

        while( binary > 0){
            int unit_digit = binary % 10;
            ans += (unit_digit * pw);
            binary  /= 10;
            pw = pw * 2;
        }
        System.out.println(ans);
    }
}
