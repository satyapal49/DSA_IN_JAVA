package Static;

class Test {
    static int count = 10;
}

public class Main2 {
    public static void main(String[] args) {

        Test t1 = new Test();  // count is 10 for all instances of Test
        Test t2 = new Test();  // count is still 10 for all instances of Test

        t1.count = 50; // count is now 50 for all instances of Test

        System.out.println(t2.count); 
    }
}