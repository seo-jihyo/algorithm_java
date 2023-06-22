import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj28138 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long N = Long.parseLong(st.nextToken());
		long R = Long.parseLong(st.nextToken());

//		long num = N-R;
		long sum = 0;

		for (long m = 1; m < Math.sqrt(num) ; m++) {
			if (num % m == 0) {
				if (m > R) {
					sum += m;
				}
				if (num / m != m && num / m > R) {
					sum += (num / m);
				}
			} }
		System.out.println(sum);
	}
} 








/*
		for (long m = 1; m <= Math.sqrt(num); m++) {
			if (num % m == 0) {
				if (m > R) {
					sum += m;
				}
				if (num / m != m && num / m > R) {
					sum += (num / m);
				}
			} }
		System.out.println(sum);
	}
} 
*/