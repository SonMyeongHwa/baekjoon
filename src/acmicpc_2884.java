


import java.util.Scanner;

public class acmicpc_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt(); //?ï¿½ï¿½
		int M = sc.nextInt(); //ï¿??
		
		if(M<45) {
			H--;
			M = 60-(45-M);
			if(H<0) {
				H = 23;
			}
		} else {
			M -= 45;
		}
		System.out.println(H+" "+M);
	}
}