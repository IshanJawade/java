import java.util.Scanner;

public class arrayOfObjects {

    class Employee {
        int empId;
        String empName;
        String empProject;
        double empSalary;

        // getter 
        int getEmpId() {
            return empId;
        }
        String getEmpName() {
            return empName;
        }
        String getEmpProject() {
            return empProject;
        }
        double getEmpSalary() {
            return empSalary;
        }

        // setters
        void setEmpId (int id) {
            empId = id;
        }
        void setEmpName (String name) {
            empName = name;
        }   
        void setEmpProject (String project) {
            empProject = project;
        }
        void setEmpSalary (double salary) {
            empSalary = salary;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp[] = new Employee[5];

        emp[0].setEmpId (12401);
        emp[0].setEmpName ("Ishan Jawade");
        emp[0].setEmpProject ("Internal Productivity");
        emp[0].setEmpSalary (31785);

        emp[1].setEmpId (12402);
        emp[1].setEmpName ("Ayushi Mohkar");
        emp[1].setEmpProject ("Internal Productivity");
        emp[1].setEmpSalary (31785);

        emp[2].setEmpId (12403);
        emp[2].setEmpName ("Pratik Kakade");
        emp[2].setEmpProject ("Banking");
        emp[2].setEmpSalary (31785);
        
        emp[3].setEmpId (12404);
        emp[3].setEmpName ("Rushikesh Jadhva");
        emp[3].setEmpProject ("Banking");
        emp[3].setEmpSalary (31785);

        emp[4].setEmpId (12405);
        emp[4].setEmpName ("Ameya Kale");
        emp[4].setEmpProject ("DevOps");
        emp[4].setEmpSalary (31785);

        System.out.println("Employees");

        for (int i=0; i<5; i++) {
            System.out.println(i+1);
            System.out.println(emp[i].getEmpId());
            System.out.println(emp[i].getEmpName());
            System.out.println(emp[i].getEmpProject());
            System.out.println(emp[i].getEmpSalary());
            System.out.println("*****************************************");
        }

        sc.close();
    }
}