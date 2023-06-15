import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();


		String S = br.readLine();

		for (char c = 'a'; c <= 'z'; ++c) {
			sb.append(S.indexOf(c)).append(" ");
		}
		bw.write(sb.append("\n").toString());
		bw.flush();
		bw.close();


	}
}

/*
 * int[] arr = new int[26];
 * 
 * for (int i = 0; i < arr.length; i++) { arr[i] = -1; }
 * 
 * String S = br.readLine();
 * 
 * for (int i = 0; i < S.length(); i++) {
 * 
 * char ch = S.charAt(i); if(arr[ch - 'a'] == -1) {
 * 
 * arr[ch - 'a'] = i; }
 * 
 * System.out.println(Integer.parseInt(S)); }
 * 
 * for (int j : arr) { System.out.println(j + " "); }
 * 
 */