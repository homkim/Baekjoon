package 단계별문제.c10_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Bj1427_소트인사이드 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		int N = str.length();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			arr.add( Integer.parseInt( str.substring(i, i+1) ) );
		}
		
		Collections.sort(arr);
		Collections.reverse(arr);
		
		for(int v : arr)
			System.out.print(v);
		
	}

}
