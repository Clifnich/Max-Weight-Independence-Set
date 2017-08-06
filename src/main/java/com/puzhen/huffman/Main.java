package com.puzhen.huffman;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		Heap heap = new Heap();
		Scanner scanner = new Scanner(new FileInputStream(new File("huffman.txt")));
		// skip the header data
		int size = scanner.nextInt();
		List<BTNode> list = new ArrayList<BTNode>(size);
		while (scanner.hasNext()) {
			int data = scanner.nextInt();
			BTNode n = new BTNode(data);
			heap.insert(n);
			list.add(n);
		}
		scanner.close();
		
		// run the huffman algorithm
		while (heap.size() != 1) {
			BTNode n1 = heap.extractMin();
			BTNode n2 = heap.extractMin();
			BTNode parent = new BTNode(n1.getData() + n2.getData());
			parent.setLeft(n1);
			parent.setRight(n2);
			heap.insert(parent);
		}
		
		System.out.println("Final depth is: " + heap.extractMin().getDepth());
		
		int minHeight = 9999999;
		for (BTNode n : list) {
			int height = n.getHeight();
			if (height < minHeight)
				minHeight = height;
		}
		
		System.out.println("Minimum code length is: " + minHeight);
	}
}
