import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2851 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = 0; // 총 합
		int close = 0; // 100에 가까운 점수

		for (int i = 0; i < 10; i++) {
			int score = Integer.parseInt(br.readLine()); // 점수 입력받기
			total += score;
			
			if (total >= 100) { 					// 점수 합이 100보다 클 경우
				if (total - 100 <= 100 - close) { 	// 어떤게 더 100에 가까운지 비교해서
					close = total; // close에 합을 넣어줌
				} else {
					close = total - score; // 이전 점수가 100에 가까우면 close
				} break;
			} // if end
			close = total; // total < 100 인 경우
		}
		System.out.println(close);

	}
}
