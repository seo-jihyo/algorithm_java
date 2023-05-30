import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj10773 {
		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			Stack<Integer> stack = new Stack<>();
			
			int K = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < K; i++) {
				int num = Integer.parseInt(br.readLine());
				
				if (num == 0) {
					stack.pop();
				} else {
					stack.push(num);
				}
			}// end for
			
			int sum = 0;
			for (Integer i : stack) {
				sum +=i;
			}// end for
			System.out.println(sum);
			}
}