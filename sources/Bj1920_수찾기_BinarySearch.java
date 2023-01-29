package sources;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 1920 수 찾기: binarysearch
class Bj1920_수찾기_BinarySearch {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < M; i++) {
			int x = Integer.parseInt(st.nextToken());
			if(Arrays.binarySearch(arr, x) >= 0) sb.append(1).append("\n");
			else sb.append(0).append("\n");
				
		}
		System.out.println(sb);
		
		
	}
}