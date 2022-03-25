import java.util.Scanner;

public class userMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Menu in Java");
        int ch=1;

        while(ch != 0){
            System.out.println("1.Option\n2.Option\n3.Option\n4.Option\n5.Option");
            ch = sc.nextInt();
        }

        sc.close();
    }
}