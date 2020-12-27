import java.util.Arrays;
import java.util.Scanner;

public class acmicpc_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); //°ú¸ñ ¼ö
		double arr[] = new double[N];
		double temp = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			temp += arr[i]/arr[N-1]*100;
		}
		System.out.println(temp/N);
	}
}
