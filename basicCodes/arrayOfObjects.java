import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    String empProject;
    double empSalary;

    // Contrusctor
    Employee(int num, String name, String pro, double sal){ 
        this.empId = num;
        this.empName = name;
        this.empProject = pro;
        this.empSalary = sal;
    }
}

public class arrayOfObjects {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp[] = new Employee[5];

        emp[0] = new Employee (12401, "Ishan Jawade", "Internal Productivity", 31785);
        emp[1] = new Employee (12402, "Ayushi Mohkar", "Internal Productivity", 31786);
        emp[2] = new Employee (12403, "Pratik Kakade", "Banking", 31787);
        emp[3] = new Employee (12404, "Rushikesh Jadhav", "Banking", 31788);
        emp[4] = new Employee (12405, "Ameya Kale", "Devops", 31789);
        
        System.out.println("Employees currently active: ");

        for ( Employee ele : emp){
            System.out.println("Emp ID:"+ ele.empId + " Name:" + ele.empName + " Project:" + ele.empProject + " Salary:" + ele.empSalary);
        }

        sc.close();
    }
}