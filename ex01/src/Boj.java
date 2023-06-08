import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalScore = 0; // 총합 점수
        int closestScore = 0; // 100에 가장 가까운 점수

        for (int i = 0; i < 10; i++) {
            int score = Integer.parseInt(br.readLine()); // 버섯의 점수를 입력받기

            totalScore += score; // 총합 점수에 현재 버섯의 점수를 더함

            if (totalScore >= 100) {
                if (totalScore - 100 <= 100 - closestScore) {
                    closestScore = totalScore; // 총합 점수가 100에 가까운 경우, closestScore 업데이트
                } else {
                    closestScore = totalScore - score; // 이전 점수가 100에 가까운 경우, closestScore 업데이트
                }
                break; // 결과를 찾았으므로 반복문 종료
            }
            closestScore = totalScore; // 총합 점수가 100 미만인 경우, closestScore 업데이트
        }

        System.out.println(closestScore); // 가장 가까운 점수 출력

        br.close(); // BufferedReader 닫기
    }
}