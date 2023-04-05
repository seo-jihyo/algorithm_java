import java.util.Scanner;

public class Bj10798 {
    
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
		//[5][15] 배열 선언
		char[][] ch = new char[5][15];
        
		String input = "";
		for (int i = 0; i < ch.length; i++) {
			input = sc.next();
			
			for (int j = 0; j < input.length(); j++) {
				ch[i][j] = input.charAt(j);
			} //그대로 출력
            System.out.println();
		}
		//세로로 출력
		
		for (int i = 0; i < 15; i++) { //최대 15개
			for (int j = 0; j < 5; j++) { //5줄
				if (ch[j][i] == '\0' ) 
					System.out.print(ch[j][i]);
				
			}
		}
	}
}