// Abstract superclass Person1234 with abstract method greet()
abstract class Person1234 {
    public abstract void greet();
}

// Subclass Student
class Student extends Person1234 {
    @Override
    public void greet() {
        System.out.println("Hello, I'm a student");
    }
}

// Subclass Teacher
class Teacher extends Person1234 {
    @Override
    public void greet() {
        System.out.println("Hello, I'm a teacher");
    }
}

// Main class to demonstrate the usage
public class M {
    public static void main(String[] args) {
        // Create instances of Student and Teacher
        Person1234 student = new Student();
        Person1234 teacher = new Teacher();

        // Call the greet method on each instance
        student.greet();
        teacher.greet();
    }
}
