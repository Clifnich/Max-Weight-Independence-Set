package com.puzhen.mwis;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new FileInputStream(new File("1369")));
		int size = scanner.nextInt();
		// the array w counts from 1.
		int[] w = new int[size + 2];
		int i = 0;
		while(scanner.hasNext()) {
			w[++i] = scanner.nextInt();
		}
		scanner.close();
		int[] a = new int[size * 2];
		a[0] = 0; a[1] = w[1];
		for (i = 2; i <= size; i++) {
			a[i] = Math.max(a[i-1], a[i-2] + w[i]);
		}
		
		Map<Integer, Object> s = new HashMap<Integer, Object>(size);
		while (i >= 2) {
			if (i == 1 ) continue;
			if (a[i-1] >= a[i-2] + w[i])
				i--;
			else {
				s.put(new Integer(w[i]), null);
				i -= 2;
			}
		}
		//s.put(new Integer(w[1]), null);
		byte[] result = new byte[9];
		for (i = 1; i <= 8; i++) {
			if (s.containsKey(new Integer(w[i]))) {
				result[i] = 1;
			} else
				result[i] = 0;
		}
		// treat the 1st bit separately
		if (a[2] == w[1]) result[1] = 1;
		for (i = 1; i <= 8; i++)
			System.out.print(result[i]);
	}
}
