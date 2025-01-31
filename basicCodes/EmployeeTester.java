import java.util.ArrayList;

class Employee {
    int EmployeeId;
    String EmployeeName;
    int EmployeeExperience;
    Employee(int id, String name, int year){
        this.EmployeeId = id;
        this.EmployeeName = name;
        this.EmployeeExperience = year;
    }
}

class EmployeeService {
    void EmployeeDetails(){

    }
}

public class EmployeeTester {
    public static void main(String[] args) {

        Employee emp1 = new Employee(
            1000,
            "Ishan Jawade",
            3
        );
        Employee emp2 = new Employee(1001,"Pratik kakade",3);
        Employee emp3 = new Employee(1002,"Rushiekesh Jadhav",3);
        Employee emp4 = new Employee(1003,"Ameya Kale",3);

        ArrayList<Employee> List1 = new ArrayList<Employee>();
        List1.add(emp1);
        List1.add(emp2);
        List1.add(emp3);
        List1.add(emp4);

        System.out.println(List1);

    }
}