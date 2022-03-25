import java.util.Scanner;

public class array{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[4];
		arr[0] = 12;
		arr[1] = 23;
		arr[2] = 34;
		arr[3] = 56;

		System.out.println("Elements in the Array (Hardcoded): ");
		for(int k=0; k<arr.length; k++){
			System.out.print(arr[k]+", ");
		}
		System.out.println();

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("Elements in the Array (User specific): ");
		for(int k=0; k<arr.length; k++){
			System.out.print(arr[k]+", ");
		}
		System.out.println();

		sc.close();
	}
}