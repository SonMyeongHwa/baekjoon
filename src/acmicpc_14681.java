


import java.util.Scanner;

public class acmicpc_14681 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int num = 0;

		if(x>0 && y>0) {
			num = 1;
		} else if(x<0 && y>0) {
			num = 2;
		} else if(x<0 && y<0) {
			num = 3;
		} else {
			num = 4;
		}
		System.out.println(num);
	}
}
