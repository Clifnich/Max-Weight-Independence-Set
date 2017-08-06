package com.puzhen.huffman;

import junit.framework.TestCase;
import java.util.*;

public class HeapTest extends TestCase {

	public HeapTest(String name) {
		super(name);
	}

	public void test0() {
		Queue<BTNode> heap = new PriorityQueue<BTNode>(new BTComparator());
		BTNode bigger = new BTNode(10);
		BTNode smaller = new BTNode(1);
		heap.add(bigger);
		heap.add(smaller);
		// extract-min
		BTNode node = heap.poll();
		assertEquals(1, node.getData());
	}
	
	public void testHeap() {
		Heap heap = new Heap();
		BTNode bigger = new BTNode(10);
		BTNode smaller = new BTNode(1);
		heap.add(bigger);
		heap.add(smaller);
		// extract-min
		BTNode node = heap.poll();
		assertEquals(1, node.getData());
	}
}
