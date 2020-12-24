import java.util.Scanner;

public class acmicpc_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt(); //수열
		int X = sc.nextInt(); //정수
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<A; i++) {
			int input = sc.nextInt();
			if(input < X) {
				sb.append(input+" ");
			}
		}
		System.out.println(sb);
	}
}
