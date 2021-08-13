import java.util.Scanner;

public class array{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int arr[] = {12,34,56,98,63,19};
		
		for(int k=0; k<arr.length; k++){
			System.out.println(arr[k]);
		}
		System.out.println(".");

		sc.close();
	}
}
