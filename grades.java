import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = input.nextInt();
        String grade;
        if(marks >= 80)
            grade = "Distiction";
        else if (marks < 80 && marks >= 65)
            grade = "First Class";
        else if (marks < 65 && marks >= 50)
            grade = "Second Class";
        else if (marks < 50 && marks >= 35)
            grade = "Third Class";
        else
            grade = "Fail";
        System.out.println("Your grade is: "+grade+".");
        input.close();
    }
}
