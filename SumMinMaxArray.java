import java.util.Scanner;

public class SumMinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size >= 2 && size <= 20){
            int arr[] = new int[size];

            for (int i=0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
            // Min element
            int min = arr[0];
            for (int i: arr){
                if (i < min)
                    min = i;
            }
            // Max Element 
            int max = arr[1];
            for (int i: arr){
                if (i > max)
                    max = i;
            }
            // pinting sum 
            System.out.println(min+max);
            
        }
        else{
            System.out.println("Invalid array size");
        }
        
        sc.close();
    }
}
