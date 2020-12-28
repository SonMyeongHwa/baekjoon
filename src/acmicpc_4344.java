import java.util.Scanner;

public class acmicpc_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int C = sc.nextInt();
		for(int i=0; i<C; i++) {
			int N = sc.nextInt();
			int arr[] = new int[N];
			double temp = 0;
			for(int j=0; j<N; j++) {
				arr[j] = sc.nextInt();
				temp += arr[j]; 
			}
			double count = 0;
			for(int j=0; j<N; j++) {
				if(arr[j] > (temp/N)) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
	}
}
