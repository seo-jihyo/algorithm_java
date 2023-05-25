import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name = br.readLine();
		int nameLength = name.length();
        // L, O, V, E 개수 이름 길이 - 이름의 L을 공백으로 치환한것
		int L = nameLength - name.replaceAll("L", "").length();
		int O = nameLength - name.replaceAll("O", "").length();
		int V = nameLength - name.replaceAll("V", "").length();
		int E = nameLength - name.replaceAll("E", "").length();

		
        //팀 수
		int t = Integer.parseInt(br.readLine());
		
		int max = 0;
		String result = "";
		
        //팀 이름을 하나씩 꺼내면서 확률 측정하기
		for (int i = 0; i < t; i++) {
			String team = br.readLine();
			int teamLength = team.length();
			int tL = teamLength - team.replaceAll("L", "").length();
			int tO = teamLength - team.replaceAll("O", "").length();
			int tV = teamLength - team.replaceAll("V", "").length();
			int tE = teamLength - team.replaceAll("E", "").length();
			
			int total = sum(L+tL, O+tO, V+tV, E+tE);
			
			if (max < total) {
				max = total;
				result = team;
			} else if (max == total) {
				if (result.compareTo(team) > 0) {
					result = team;
				}
			}
		}
		
		System.out.println(result);
	}
	
	public static int sum(int l, int o, int v, int e) {
		return ((l+o) * (l+v) * (l+e) * (o+v) * (o+e) * (v+e)) % 100;
	}
}

