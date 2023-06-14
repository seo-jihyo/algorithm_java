import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj2309 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] N = new int[9];
		int sum = 0;
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < N.length; i++) {
			N[i] = Integer.parseInt(br.readLine());
			sum += N[i];
		}
		Arrays.sort(N);
			for (int i = 0; i < N.length; i++) {
				for (int j = i + 1; j < N.length; j++) {
					if(sum -N[i] - N[j] == 100) {
						a = N[i];
						b = N[j];
					}//if end
				}//for end
			}//for end
			for (int i = 0; i < N.length; i++) {
				if (a == N[i] || b == N[i]) continue;
					System.out.println(N[i]);
			}//for end
	}//main end
}
