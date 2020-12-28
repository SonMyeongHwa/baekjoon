import java.util.Scanner;

public class acmicpc_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); //숫자의 개수
		String num = sc.next();
		
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			sum += num.charAt(i)-48; //-48 또는 -'0'을 해줘야 입력값이 그대로 나옴
		}
		System.out.println(sum);
	}
}
