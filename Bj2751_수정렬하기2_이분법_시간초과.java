import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

// 2751 수 정렬하기 2
// 이분법 이용
class Bj2751_수정렬하기2_이분법_시간초과 {
	public static void main(String[] args) throws Exception {
		long t1 = System.currentTimeMillis();
		System.setIn( new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			if(list.size() == 0) list.add(x);
			else if(x >= list.get(list.size()-1)) list.add(x);
			else {
				int idx = lower_bound(list, x);
				list.add(idx, x);
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < N; i++) {
			bw.write(list.get(i)+"");
			bw.newLine();
		}
		bw.flush();
		
	}

	private static int lower_bound(List<Integer> list, int x) {
		int begin = 0;
		int end = list.size() - 1;
		while(begin < end) {
			int mid = (begin + end) / 2;
			if(list.get(mid) < x) begin = mid + 1;
			else end = mid;
		}
		return end;
	}
}