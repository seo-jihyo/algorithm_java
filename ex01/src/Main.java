import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스의 개수

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = scanner.nextInt(); // 선수의 수
            int[] A = new int[N]; // 선수들의 실력을 저장할 배열

            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt(); // 각 선수의 실력 입력받기
            }

            long[] dp = new long[N]; // 최대 팀 실력 합을 저장할 배열
            dp[0] = A[0]; // 첫 번째 선수의 실력

            // 동적 프로그래밍을 이용하여 최대 팀 실력 합 계산
            for (int i = 1; i < N; i++) {
                dp[i] = Math.max(A[i], A[i] + dp[i - 1]);
            }

            long maxSum = Long.MIN_VALUE; // 최대 팀 실력 합의 초기값은 매우 작은 값으로 설정

            // dp 배열에서 최대값 찾기
            for (int i = 0; i < N; i++) {
                maxSum = Math.max(maxSum, dp[i]);
            }

            // 음수인 경우 절대값 취하기
            maxSum = Math.abs(maxSum);

            // 모든 팀 실력 합을 더한 후 1,000,000,007로 나눈 나머지 출력
            long AnswerN = 0;
            for (int i = 0; i < N; i++) {
                AnswerN += Math.abs(dp[i]);
                AnswerN %= 1000000007;
            }

            System.out.println("#" + test_case + " " + AnswerN);
        }

        scanner.close();
    }
}