import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1475 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();

		int[] count = new int[10];
		
		//개수 세기
		for (int i = 0; i < N.length(); i++) {
			int num = N.charAt(i) - '0'; //6, 9 하나로 취급
			
				count[num]++;
			}
		//
		int temp =  (count[6] + count [9] + 1)/2;
		
		count[6] = temp;
		count[9] = temp;
		
		int max = 0;
		for (int i = 0; i < 10; i++) {
			if (count[i] > max) {
				max = count[i];
			}
		}
	System.out.println(max);
	
	}
}







	
		
	
	
	
	
	
//		int[] arr = new int[10];
//		if (str == 6) {
//			str.replace(6, 9)
//		}
//		int temp = 0;
//		
//			
//		
//		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
	
	
	
	
	

/*import java.io.BufferedReader;
imp
}
*/