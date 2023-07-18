class Employee{
    // Attributes
    int empID;
    String empName;
    double empSalary;
    double bonus = 40000;
    // Methods = fucntions
    public double calSalary(){
        return empSalary + bonus;
    }
}

public class classObject{
    public static void main(String args[]){
        Employee Emp = new Employee();
        Emp.empID = 2173093;
        Emp.empName = "Ishan Jawade";
        Emp.empSalary = 50000;

        System.out.println("ID: " + Emp.empID);
        System.out.println("Name: " + Emp.empName);
        System.out.println("Salary: " + Emp.calSalary());
    }
}