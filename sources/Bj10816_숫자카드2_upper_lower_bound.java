package sources;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
// 10816 숫자카드2 upper/lower bound
public class Bj10816_숫자카드2_upper_lower_bound {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int ans = 0;
		for(int i = 0; i < M; i++) {
			int a = Integer.parseInt(st.nextToken());
			ans = upper_bound(arr, a) - lower_bound(arr, a);
			bw.write(ans + " ");
		}
		bw.flush();
			
	}
	static int lower_bound(int[] arr, int target) {
		int begin = 0;
		int end = arr.length;
		while (begin < end) {
			int mid = (begin + end) / 2;
			if(arr[mid] < target)
				begin = mid + 1;
			else
				end = mid;
		}
		return end;
	}
	static int upper_bound(int[] arr, int target) {
		int begin = 0;
		int end = arr.length;
		while (begin < end) {
			int mid = (begin + end) / 2;
			if(arr[mid] <= target)
				begin = mid + 1;
			else
				end = mid;
		}		
		return end;
	}	
}
