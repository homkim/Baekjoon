package sources;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2805 나무자르기
class Bj2805_나무자르기_이분법 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //나무수 100만 이하
		int M = Integer.parseInt(st.nextToken()); //필요한 나무길이 20억 이하
		int[] arr = new int[N];                   //나무 높이 10억
		int max = 0;
		
		st= new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Integer.max(max, arr[i]);
		}
		
		long begin = 0;
		long end = max + 1; // upper bound:조건에 만족하는 가장 큰 값
		while (begin < end) {
			long mid = (begin + end) / 2;
			long len = 0;
			for(int x : arr) {
				if ( x > mid) len += x - mid;
			}
			if( len >= M)
				begin = mid + 1;
			else
				end = mid;
		}
		System.out.println(end-1);
		
			
	}
}