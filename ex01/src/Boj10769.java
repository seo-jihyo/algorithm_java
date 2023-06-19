import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10769 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		
		int happy = str.length() - str.replace(":-)","").length();
		int sad = str.length() - str.replace(":-(", "").length();
		
		String emo = "";
		if (happy == 0 & sad == 0) {
			System.out.println("none");
		} else if (happy == sad) {
			System.out.println("unsure");
		} else if (happy < sad) {
			System.out.println("sad");
		} else if (happy > sad) {
			System.out.println("happy");
		}
	}
}
