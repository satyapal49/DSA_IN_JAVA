package PatternAdv;

public class InvertedRoatatedHalfPyramid {
    // Inverted Rotated Half Pyramid Pattern
    public static void InterverHalfPyramid(int cols) {
        // Outer loop
        for (int i = 1; i <= cols; i++) {

            // Space Inner loop
            for (int j = 1; j <= cols - i; j++) {
                System.out.print(" ");
            }

            // Stars Inner loop
            for (int j = 1; j <= i; j++) {  
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        InterverHalfPyramid(10);
    }

}
