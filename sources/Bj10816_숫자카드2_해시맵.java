package sources;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Bj10816_숫자카드2_해시맵 {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(st.nextToken());
			if( map.containsKey(a))
				map.put(a, map.get(a) + 1);
			else
				map.put(a, 1);
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int ans = 0;
		for(int i = 0; i < M; i++) {
			int a = Integer.parseInt(st.nextToken());
			if (map.containsKey(a))
				ans = map.get(a);
			else
				ans = 0;
			bw.write(ans + " ");
		}
		bw.flush();
			
	}
}
