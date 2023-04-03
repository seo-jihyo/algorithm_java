package jungsuk;

import java.util.Scanner;

public class Ex4_14 {
	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.println("숫자를 입력하세요. 예:12345");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();	//화면을 통해 입력받은 
		num = Integer.parseInt(tmp);		//입력받은 문자열(tmp)을 숫자로 바꿔줌
		
		while(num != 0) {
			//num을 10으로 나눈 나머지를 sum에 더함
			sum += num%10;		//sum = sum + num%10;
			System.out.printf("sum=%3d num=%d%n");
			
			num /= 10;		//num = num / 10; num을 10으로 나눈 값
					
		}
		//	System.out.println("12345%10");
		//  10으로 나머지 연산을 하면 마지막 자리의 값을 얻는다. (10으로 나눠지지 않으므로)
	
		for(num = 12345; num > 0; num = num / 10) {
			//12345 -> 1234 -> 123 -> 12 -> 1
			System.out.println(num);
		}
		
		System.out.println("각 자리수의 합: " + sum);
	}
}
