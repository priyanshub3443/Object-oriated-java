class Employee{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
    public int getsalary(){
        return salary;
    }
}

public class oops {
    public static void main(String[] args) {
    System.out.println("this is our custom class0");
    Employee priyanshu = new Employee();    
    Employee harry = new Employee();    
    
        // Setting Attributes for Harry
        harry.id = 12;
        harry.salary = 34;
        harry.name = "CodeWithHarry";

        // Setting Attributes for John
        priyanshu.id = 17;
        priyanshu.salary = 12;
        priyanshu.name = "John Khandelwal";

        // Printing the Attributes
        harry.printdetails();
        priyanshu.printdetails();
        int salary = priyanshu.getsalary();
        System.out.println(salary);
        // System.out.println(harry.id);
        // System.out.println(harry.name);
    }
}
