import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LinkedListProgram {
	interface IOperate {
		int operate(int num1, int num2);
	}
	public static void main(String[] args) {
		IOperate add = (v1,v2) -> {
			return v1+v2;
		};
		IOperate multiply = (v1,v2) -> {
			return v1*v2;
		};
	
		int res1 = add.operate(2, 3);
		int res2 = multiply.operate(2, 3);
		System.out.println(res1);
		System.out.println(res2);

		int[] arr1 = new int[]{1,2,3,4,5,6,7,8};
		Arrays.stream(arr1).filter(v1 -> v1%2==0);

		

	}
}