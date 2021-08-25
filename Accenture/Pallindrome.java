import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();

        StringBuilder StrRev1 = new StringBuilder(str1);
        String str2 = StrRev1.reverse().toString();

        if (str1.equals(str2))
            System.out.println("Given string is pallindrome.");
        else
            System.out.println("Given string is not pallindrome!");

        sc.close();
    }
}
