package 단계별문제.c10_정렬;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 2751 수 정렬하기 2
// collections.sort 이용
class Bj2751_수정렬하기2_컬렉션 {
	public static void main(String[] args) throws Exception {
//		long t1 = System.currentTimeMillis();
//		System.setIn( new FileInputStream("input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) list.add( Integer.parseInt(br.readLine()));
		Collections.sort(list);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < N; i++) {
			bw.write(list.get(i)+"");
			bw.newLine();
		}
		bw.flush();

//		long t2 = System.currentTimeMillis();
//		System.out.printf("%.3f", (double)(t2-t1)/1000);
		
	}
}