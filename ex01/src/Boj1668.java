import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Boj1668 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		} // for end

		int countL = 0;
		int maxL = Integer.MAX_VALUE;
		int countR = 0;
		int maxR = Integer.MAX_VALUE;

		for (int i = 0; i < N - 1; i++) {

			if (maxL < arr.get(i)) {
				maxL = arr.get(i);
			}

			if (maxL >= arr.get(i + 1)) {
				continue;
			}
			countL++;
		}

		for (int i = N - 1; i > 0; i--) {
			if (maxR < arr.get(i)) {
				maxR = arr.get(i);
			}

			if (maxR >= arr.get(i - 1)) {
				continue;
			}
			countR++;
		}
		System.out.println(countL + " " + countR);
	}// main end
}