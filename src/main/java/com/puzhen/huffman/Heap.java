package com.puzhen.huffman;

import java.util.PriorityQueue;

public class Heap extends PriorityQueue<BTNode> {

	private static final long serialVersionUID = -2184365608369561471L;

	public Heap() {
		super(new BTComparator());
	}
	
	public void insert(BTNode node) {
		add(node);
	}
	
	public BTNode extractMin() {
		return poll();
	}
}
