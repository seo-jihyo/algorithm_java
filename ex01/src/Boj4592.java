import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj4592 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String num = br.readLine();
			StringBuilder sb = new StringBuilder();
			
			if (num.equals("0")) {
				break;  //입력값이 0이면 종료
			}
			
			else {
				String[] arr = num.split(" ");
				
				int N = Integer.parseInt(arr[0]);
				sb.append(arr[1]).append(" ");
				
				for (int i = 2; i <= N; i++) {

					if (!arr[i-1].equals(arr[i])) {
						sb.append(arr[i]).append(" ");
					} //if end
				} // for end
				System.out.println(sb + "$");
			} //else end
			
		} // while end
	}
}
