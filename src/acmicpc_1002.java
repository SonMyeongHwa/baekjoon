import java.util.Scanner;

public class acmicpc_1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			int distance = (int) (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
			
			if(x1==x2 && y1==y2 && r1==r2) {
				//중점과 반지름이 같은경우
				System.out.println(-1);
			} else if(distance > Math.pow(r1+r2, 2) || distance < Math.pow(r2-r1, 2)) {
				//두 점의 거리가 각 원의 반지름 합보다 클때           한 원안에 다른 원이 있으면서 접점이 없을때
				System.out.println(0);
			} else if(distance == Math.pow(r2-r1, 2) || distance == Math.pow(r1+r2, 2)) {
				//내접할때        외접할때
				System.out.println(1);
			} else {
				System.out.println(2);
			}
		}
	}
}
