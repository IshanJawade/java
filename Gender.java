import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maleCnt = 0;
        int femaleCnt = 0;
        
        String str = sc.nextLine();
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == 'M' || str.charAt(i) == 'm')
                maleCnt++;
            else
                femaleCnt++;
        }
        System.out.println(maleCnt+" Male");
        System.out.println(femaleCnt+" Female");
        sc.close();
    }
}
