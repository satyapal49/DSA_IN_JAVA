package Static;

class Student {

    String name;
    int age;

    Student() {
        name = "John";
        age = 0;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    Student(String n){
        name = n;
        age = 18;
    }

     void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("Alice", 20);
        Student s3 = new Student("Bob");

        s1.display();
        s2.display();
        s3.display();
    }
}