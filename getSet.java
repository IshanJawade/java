class Employe{
    // Attributes
    private int empID;
    private String empName;
    private double empSalary;
    private double bonus = 40000;
    // Methods
    public double calSalary(){
        return empSalary + bonus;
    }

    // Getters
    public int getEmpId(){
        return empID;
    }
    public String getEmpName(){
        return empName;
    }
    public double getEmpSalary(){
        return empSalary;
    }

    // Setters
    public void setEmpName(String name){
        empName = name;
    }
    public void setSalary(double salary){
        empSalary = salary;
    }
    public void setEmpId(int id){
        empID = id;
    }
}

public class getSet{
    public static void main(String args[]){
        Employe empObj = new Employe();
        
        empObj.setEmpId(13199953);
        empObj.setEmpName("Ishan Jawade");
        empObj.setSalary(450000);

        System.out.println("ID: " + empObj.getEmpId());
        System.out.println("Name: " + empObj.getEmpName());
        System.out.println("Salary: " + empObj.getEmpSalary());
    }
}