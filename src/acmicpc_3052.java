import java.util.Scanner;

public class acmicpc_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean arr[] = new boolean[42];
		int count = 0;
		
		for(int i=0; i<10; i++) {
			arr[sc.nextInt()%42] = true;
		}
		for(boolean i : arr) {
			if(i == true) {
				count++;
			}
		}
		System.out.println(count);
	}
}
