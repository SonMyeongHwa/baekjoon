import java.util.Scanner;
import java.util.StringTokenizer;

public class acmicpc_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		
		StringTokenizer strToken = new StringTokenizer(str, " ");
		System.out.println(strToken.countTokens());
	}
}
