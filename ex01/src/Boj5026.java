import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj5026 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			
			if (str.equals("P=NP")) {
				
				sb.append("skipped"+"\n");
				
			} else {
				StringTokenizer st = new StringTokenizer(str, "+");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				sb.append((x + y) +"\n");
			}
		}//for end
		System.out.println(sb);
	}
}
