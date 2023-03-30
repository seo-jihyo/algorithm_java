import java.util.Scanner;

public class Bj2441 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();

//		for (int i = 1; i <= num; i++) {
//
//			for (int j = 1; j < num-1; j++) {
//				System.out.print(" ");
//				
//			}
//			for (int k = num; k >= 1; k--) {
//				System.out.println("*");
//				
//			}

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");

			}
			for (int k = num; k >= 1; k--) {
				System.out.println("*");
			}

		}
	}
}
