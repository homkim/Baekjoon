package com.javalec.laba3;

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
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		for (int i = m; i < n + 1; i++) {
			if (isPrime(i)) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		bw.flush();

	}

	private static boolean isPrime(int n) {
		if (n == 1)
			return false;

		for (int j = 2; j*j <= n; j++) {
			if (n % j == 0)
				return false;
		}

		return true;
	}
}