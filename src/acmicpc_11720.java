import java.util.Scanner;

public class acmicpc_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); //������ ����
		String num = sc.next();
		
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			sum += num.charAt(i)-48; //-48 �Ǵ� -'0'�� ����� �Է°��� �״�� ����
		}
		System.out.println(sum);
	}
}
