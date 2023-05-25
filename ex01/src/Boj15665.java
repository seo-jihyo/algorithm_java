import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Boj15665 {
	public static int N, M;
	public static int arr[], result[];
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[M];
		result = new int[N +1];
		
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i++) {
			result[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(result);
		
//			
//		arr[i] = Integer.parseInt(st.nextToken());
//
//		Arrays.sort(arr);
//
//		result = new int[M];
		
		DFS(0);

		System.out.println(sb);
	}

	public static void DFS(int depth) {
		// TODO Auto-generated method stub
		if (depth == M) {
			for(int val : result)
				sb.append(val).append(" ");
			
			sb.append('\n');
			return;
		}
		for (int i = 0; i <= N; i++) {
			
			result[depth] = arr[i];
			DFS(depth + 1);
		}
	}
}
/*
 *arr = new int[m];
        //visit = new boolean[n + 1];

        nums = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);

        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int cnt) {

        if (cnt == m) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        int before = 0;
        for (int i = 0; i <= n; i++) {
            if (before != nums[i]) {
                arr[cnt] = nums[i];
                before = nums[i];
                dfs(cnt + 1);
            }
 
 *
 * 
 */
