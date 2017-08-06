package com.puzhen.script;

import java.io.*;
import java.util.*;

public class CheckDistinct {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new FileInputStream(new File("mwis.txt")));
		int size = scanner.nextInt(); // skip the size
		int[] array = new int[size];
		int i = 0;
		while (scanner.hasNext())
			array[i++] = scanner.nextInt();
		scanner.close();
		boolean isDistinct = true;
		for (i = 0; i < size - 1; i++) {
			int base = array[i];
			for (int j = i + 1; j < size; j++) 
				if (array[j] == base)
					isDistinct = false;
		}
		System.out.println(isDistinct);
	}
}
