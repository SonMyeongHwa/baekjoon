import java.util.Scanner;

public class acmicpc_11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int arr[] = new int[T];
		for(int i=0; i<T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			arr[i] = A+B;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Case #"+(i+1)+": "+arr[i]);
		}
	}
}
