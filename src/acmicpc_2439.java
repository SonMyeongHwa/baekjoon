import java.util.Scanner;

public class acmicpc_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			for(int j=N-i; j>=1; j--) {
				System.out.printf(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
	}
}
