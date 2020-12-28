import java.util.Scanner;

public class acmicpc_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		
		int arr[] = new int[26];
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		for(int i=0; i<S.length(); i++) {
			char c = S.charAt(i);
			
			if(arr[c-'a'] == -1) {
				arr[c-'a'] = i;
			}
		}
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}
