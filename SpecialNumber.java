import java.util.ArrayList;
import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> SPNumList = new ArrayList<Integer>();
        ArrayList<Integer> NSPnumList = new ArrayList<Integer>();
        int num[] = new int[5];
        System.out.println("Enter five 3 digit number: ");
        for (int i : num){
            num[i] = sc.nextInt();
        }

        for (int i=0; i<num.length; i++){
            if (num[i] <= 99 || num[i] >= 1000){
                int tDigit = num[i] % 100;
                int lDigit = tDigit % 10;
                int mDigit = tDigit - lDigit;
                if ( mDigit%7 == 0){
                    SPNumList.add(num[i]);
                }
                else{
                    NSPnumList.add(num[i]);
                }
            }
            else{
                System.out.println("Invalid input");
            }
        }
        
        sc.close();
    }
}
