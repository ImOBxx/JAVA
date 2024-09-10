
class Employee
{
    private int salary;
    
    public Employee (int salary) {
    this.salary = salary;
    }
    void work()
    {
        System.out.println("Working As An Employee.");
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class HRManager extends Employee 
{
    public HRManager (int salary)
    {
        super(salary);
        
    }

    void work()
    {
         System.out.println("Wokring As An HRManager.");
    }

    public void addEmployee()
    {
        System.out.println("\nAdding new Employee!");
    }
}

public class Employer {
    public static void main(String[] args) {
        Employee e = new Employee(40000);
        HRManager h = new HRManager(30000);

        e.work();


        h.work();

        

        
    }
    
}
