// 직각삼각형 여부: 피타고라스 정리를 활용하면 됨
package 단계별문제.c08_기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P09_직각삼각형 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
 
			int[] a = new int[3];
			a[0] = Integer.parseInt( st.nextToken() );
			a[1] = Integer.parseInt( st.nextToken() );
			a[2] = Integer.parseInt( st.nextToken() );
			if( a[0] == 0 && a[1] == 0 && a[2] == 0) break;
			
			Arrays.sort(a);
			if(a[0]*a[0] + a[1]*a[1] == a[2]*a[2]) System.out.println("right");
			else System.out.println("wrong");
			
		}
		
	}

}
