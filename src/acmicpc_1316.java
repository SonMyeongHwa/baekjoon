import java.util.Scanner;

public class acmicpc_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int count = N;
		for(int i=0; i<N; i++) {
			String str = sc.next();
			boolean[] check = new boolean[26];
			
			for(int j=1; j<str.length(); j++) {
				if(str.charAt(j-1) != str.charAt(j)) {
					if(check[str.charAt(j)-97] == true) {
						count--;
						break;
					}
					check[str.charAt(j-1)-97] = true;
				}
			}
		}
		System.out.println(count);
	}

}
