// Using Scanner
import java.util.Scanner;

public class ArrayOps{
    public static void main(String[] args) {

        Scanner input = null;
        try {

            System.out.println("Please Enter 5 numbers");

            input = new Scanner(System.in);

            int sum = 0;

            for (int i = 0; i < 5; i += 1){

                sum += input.nextInt();

            }

            System.out.println("The total sum is: " + sum );

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            input.close();

        }
    }
}