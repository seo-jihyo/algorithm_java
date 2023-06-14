import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static int[] arr = new int[9];
	static int sum = 0;
	static int x = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i]; 
		}
		x = sum - 100; 	// 가짜 난쟁이 2명 합 
		

		for (int i = 0; i < arr.length; i++) { // 1 
			for (int j = i+1; j < arr.length; j++) { // 2
				if (x == arr[i] + arr[j]) { 
					arr[i] = arr[j] = 0; 	//가짜 난쟁이 0으로 
					Arrays.sort(arr); 
					for (int k = 2; k < 9; k++) {
						System.out.println(arr[k]);
					} //for end
					return;
				}// if end
			}
		}
	}//main end
}