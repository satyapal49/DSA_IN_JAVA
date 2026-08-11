import java.util.Scanner;


public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int rev = 0;
        int org_num = num;

        while (num > 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }

       if( org_num == rev){
        System.out.println(true);
       } else {
        System.out.println(false);
       }
    }
}
