import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Boj7785 {
	public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashSet<String> set = new HashSet<>();
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s1 = st.nextToken();
			String s2 = st.nextToken();
			
			if(s2.equals("enter")) set.add(s1);
			else set.remove(s1);
		}
		ArrayList<String> arr = new ArrayList<>(set);
		
		Collections.sort(arr, Collections.reverseOrder());
		
		for (int i = 0; i < arr.size(); i++) {
			String s = arr.get(i);
			sb.append(s).append("\n");
		}
		System.out.println(sb);
	}
	
}

//, Collections.reverseOrder()