package com.puzhen.mwis;

import java.io.*;
import java.util.*;

public class MWIS {

	/**
	 * This method runs dynamic programming on the
	 * given data set and create a binary array
	 * representing if each vertex is included
	 * in the final independent set.
	 * @param filepath
	 * @return
	 * @throws IOException 
	 */
	public byte[] run(String filepath) throws IOException {
		Scanner scanner = new Scanner(new FileInputStream(new File(filepath)));
		int size = scanner.nextInt();
		int i = 0;
		int[] w = new int[size+1];
		while (scanner.hasNext()) {
			w[++i] = scanner.nextInt();
		}
		scanner.close();
		int[] a = new int[size+1];
		a[0] = 0; a[1] = w[1];
		for (i = 2; i <= size; i++) {
			a[i] = Math.max(a[i-1], a[i-2] + w[i]);
		}
		i--;
		// reconstruction
		Map<Integer, Object> s = new HashMap<Integer, Object>();
//		if (i == 1)
//			s.put(new Integer(w[i]), null);
		while (i >= 1) {
			if (i == 1) {
				if (size <= 1) 
					s.put(new Integer(w[i]), null);
				else
					if (!s.containsKey(new Integer(w[2])))
						s.put(new Integer(w[1]), null);
				i--;
				continue;
			}
			if (a[i-1] >= a[i-2] + w[i])
				i--;
			else {
				s.put(new Integer(w[i]), null);
				i -= 2;
			}
		}
		byte[] binary = new byte[size];
		for (i = 1; i <= size; i++)
			if (s.containsKey(new Integer(w[i])))
				binary[i-1] = 1;
			else
				binary[i-1] = 0;
		return binary;
	}
	
	public static void main(String[] args) throws IOException{
		MWIS mwis = new MWIS();
		byte[] result = mwis.run("mwis.txt");
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i]);
		System.out.println(result.length);
	}
}
