import java.util.Scanner;

public class UniqueStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();
        
        sc.close();

        if (str1.equals(str2)) // function to check strings are equal
            System.out.println("Strings are not unique");
        else
            System.out.println("Strings are  unique");
    }
}
