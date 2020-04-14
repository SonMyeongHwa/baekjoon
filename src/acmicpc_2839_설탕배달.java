import java.util.Scanner;

public class acmicpc_2839_설탕배달 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sugar = sc.nextInt();
        int result = 0;

        if(sugar >= 5) { //5kg이상
            if(sugar % 5 == 0) {
                result = sugar / 5;
            }
            else if(sugar - 3 >= 5) {
                sugar -= 3;
                result++;
                while(sugar%5!=0) {
                    sugar -= 3;
                    result++;
                    if(sugar < 0) {
                        result = -1;
                        break;
                    }
                }
                result += sugar / 5;
            }
            else if(sugar % 3 == 0) {
                result = sugar / 3;
            }
            else {
                result = -1;
            }
        }
        else { //4kg이하
            if(sugar % 3 == 0) {
                result = sugar / 3;
            }
            else {
                result = -1;
            }
        }

        System.out.println(result);
    }

}