import java.util.Scanner;
class Solution {
	static long AnswerN;
	static int N = 10;

	public static void main(String args[]) throws Exception {		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt(); //선수
			int[] A = new int[N]; 
			
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt(); //실력
			}
			
			long[] Best = new long[N]; //최대합
			Best[0] = A[0]; // 첫번째 선수 실력
			
			for (int i = 1; i < N; i++) {
				Best[i] = Math.max(A[i], A[i] + Best[i-1]);
			}
			long maxSum = Long.MIN_VALUE;
			for (int i = 0; i < N; i++) {
				maxSum = Math.max(maxSum, Best[i]);
			}
			maxSum = Math.abs(maxSum);
			
			AnswerN = 0;
			for (int i = 0; i < N; i++) {
				AnswerN += Math.abs(Best[i]);
			}
			System.out.println("#"+test_case+" "+AnswerN);
		}
	}
}
