import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Boj15651 {

	public static int[] arr;
	public static int a, b;
	// 접근제어자 public으로 메모리에 상주하게 int형 배열과 변수 a, b를 선언한다.
	public static StringBuilder sb = new StringBuilder();
	// 접근제어자 public으로 메모리에 상주하게 StringBuilder 객체 sb를 선언한다.

	public static void main(String[] args) throws IOException {
		// 접근제어자 public으로 메모리에 상주하게 리턴값이 없이 main 함수를 선언한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		StringTokenizer st = new StringTokenizer(br.readLine());

		a = Integer.parseInt(st.nextToken());
		// 개행으로 값을 입력받아 변수 a에 저장한다.
		b = Integer.parseInt(st.nextToken());
		// 개행으로 값을 입력받아 변수 b에 저장한다.

		arr = new int[b];
		// 배열 arr의 길이를 b로 한다.
		dfs(0);
		// 메소드 bta를 매개변수 0으로 호출한다.
		System.out.println(sb);
		// sb를 출력한다.
	}

	public static void dfs(int depth) {
		/*
		 * 접근제어자 public으로 메모리에 상주하게 메소드 dfs를 선언한다. 매개변수는 int depth로 한다.
		 */

		if (depth == b) {
			// if문을 선언한다. depth == b 일때 괄호안의 문장이 실행된다.
			for (int i = 0; i < b; i++) {
				// for문을 선언한다. i가 0~<b까지 괄호안의 문장이 반복된다.
				sb.append(arr[i]).append(' ');
				// 객체 sb에 arr[i]값과 공백 데이터를 추가한다.
			}

			sb.append('\n');
			// 객체 sb에 개행 데이터를 추가한다.
			return;
			// 메소드를 종료한다.
		}

		for (int i = 1; i <= a; i++) {
			// for문을 선언한다. i가 1~a까지 반복된다.
			arr[depth] = i;
			// arr[depth]에 i값을 저장한다.
			dfs(depth + 1);
			// 메소드 bta(depth+1)를 호출한다.
		}

	}
}