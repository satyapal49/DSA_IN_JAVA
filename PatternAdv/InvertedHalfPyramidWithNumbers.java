package PatternAdv;

public class InvertedHalfPyramidWithNumbers {

    // Inverted Half Pyramid With Numbers Pattern
    public static void HalfPyramidWithNumbers(int cols) {
        // Outer loop
        for (int i = 1; i<= cols; i++) {
            // Inner loop
            for (int j = 1; j <= cols - i + 1; j++){ // LOGIC: cols - i + 1 Will give the number of columns to be printed in each row 
                System.out.print(j);
            }
           System.out.println();
        }
    }

    public static void main(String[] args) {
        HalfPyramidWithNumbers(5);
    }
}
