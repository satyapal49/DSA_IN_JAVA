package Static;

class Test {
    static int count = 5;

    Test() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) {

        Test t1 = new Test(); // count is incremented to 6
        Test t2 = new Test(); // count is incremented to 7

        t1.count = 100;  // count is now 100 for all instances of Test

        Test t3 = new Test();  // count is incremented to 101

        System.out.println(Test.count);  // Output will be 101, as count is a static variable shared among all instances of Test
    }
}