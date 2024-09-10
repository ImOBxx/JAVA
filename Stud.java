class Student
{
    String name;
    int roll_no;

    public Student (String name, int roll_no)
    {
        this.name = name;
        this.roll_no = roll_no;
    }

    void assign()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.roll_no);
    }


}



public class Stud {
    public static void main(String[] args) {
        Student stu = new Student("OB", 23);
        
        stu.assign();
    }
}
