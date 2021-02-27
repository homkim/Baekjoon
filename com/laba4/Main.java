package com.laba4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			if (m == 0)
				break;

			int n = 2 * m;
			int primeCnt = 0;
			for (int i = m + 1; i <= n; i++) {
				if (isPrime(i)) primeCnt++;
			}
			bw.write(String.valueOf(primeCnt));
			bw.newLine();
		}
		bw.flush();

	}

	private static boolean isPrime(int n) {
		if (n == 1)
			return false;

		for (int j = 2; j * j <= n; j++) {
			if (n % j == 0)
				return false;
		}

		return true;
	}
}