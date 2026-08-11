import java.util.Scanner;

public class isEven {

    // Is even or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0){
             System.out.println(true);
        } else {
             System.out.println(false);
        }
    }
}
