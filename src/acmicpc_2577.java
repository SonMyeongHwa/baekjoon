import java.util.Scanner;

public class acmicpc_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int multiply = A*B*C;
		int arr[] = new int[10];
		
		while(multiply != 0) {
			arr[multiply%10]++;
			multiply = multiply/10;
		}
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
