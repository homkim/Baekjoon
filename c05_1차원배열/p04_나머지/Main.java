/* 나머지 */
package c05_1차원배열.p04_나머지;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> s1 = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			s1.add(sc.nextInt() % 42);
		}
		
		System.out.println(s1.size());
	}
}