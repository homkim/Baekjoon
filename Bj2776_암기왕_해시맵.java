import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//2776 암기왕 : hashmap
class Bj2776_암기왕_해시맵 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			HashMap<Integer, Integer> map = new HashMap<>();
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) {
				int x = Integer.parseInt(st.nextToken());
				if(!map.containsKey(x)) map.put(x, 1);				
			}
			
			int M = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < M; i++) {
				int x = Integer.parseInt(st.nextToken());
				if(map.containsKey(x))
					sb.append("1\n");
				else
					sb.append("0\n");
			}
			
		}
		System.out.println(sb);
	}
}