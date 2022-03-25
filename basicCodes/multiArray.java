import java.util.Scanner;

public class multiArray {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        int arr[][] = new int[num1][num2];
        Scanner sc = new Scanner(System.in);

        //get
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //put
        System.out.println("Elements in the ");
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+ "  ");
                if (j == num1-1 ){
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
