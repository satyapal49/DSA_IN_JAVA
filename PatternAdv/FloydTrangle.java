package PatternAdv;

public class FloydTrangle {
    // Floyd Triangle Pattern
    public static void FloydTriangle(int rows) {
    int counter = 1;

        for (int i = 1; i<=rows; i++ ) {
            for (int j = 1; j<= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        } 
        
    }

    public static void main(String[] args) {
        FloydTriangle(12);
    }
}
