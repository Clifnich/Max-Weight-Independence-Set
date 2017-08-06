package com.puzhen.huffman;

import junit.framework.TestCase;

public class BTNodeTest extends TestCase {

	public BTNodeTest(String name) {
		super(name);
	}

	public void test0() {
		BTNode node = new BTNode(8);
		assertEquals(8, node.getData());
	}
	
	public void test1() {
		BTNode node = new BTNode(9);
		BTNode son = new BTNode(4);
		node.setLeft(son);
		assertEquals(4, node.getLeft().getData());
	}
	
	public void tets2() {
		BTNode grandpa = new BTNode(10);
		BTNode father = new BTNode(8);
		BTNode son = new BTNode(4);
		grandpa.setLeft(father);
		father.setLeft(son);
		
		assertEquals(4, grandpa.getLeft().getLeft().getData());
	}
	
	public void testGetDepth() {
		BTNode grandpa = new BTNode(10);
		BTNode father = new BTNode(8);
		grandpa.setLeft(father);
		assertEquals(1, grandpa.getDepth());
	}
	
	public void testGetDepth1() {
		BTNode grandpa = new BTNode(10);
		BTNode father = new BTNode(8);
		BTNode son = new BTNode(4);
		grandpa.setLeft(father);
		father.setLeft(son);
		
		assertEquals(2, grandpa.getDepth());
		assertEquals(1, father.getDepth());
		assertEquals(0, son.getDepth());
	}
	
	public void testParent() {
		BTNode grandpa = new BTNode(10);
		BTNode father = new BTNode(8);
		grandpa.setLeft(father);
		
		assertEquals(10, father.getParent().getData());
	}
	
	public void testParent1() {
		BTNode grandpa = new BTNode(11);
		BTNode father = new BTNode(8);
		BTNode son = new BTNode(4);
		grandpa.setLeft(father);
		father.setLeft(son);
		
		assertEquals(11, son.getParent().getParent().getData());
	}
	
	public void testGetHeight() {
		BTNode grandpa = new BTNode(10);
		BTNode father = new BTNode(8);
		grandpa.setLeft(father);
		
		assertEquals(1, father.getHeight());
	}
	
	public void testGetHeight1() {
		BTNode grandpa = new BTNode(11);
		BTNode father = new BTNode(8);
		BTNode son = new BTNode(4);
		grandpa.setLeft(father);
		father.setLeft(son);
		
		assertEquals(2, son.getHeight());
	}
}
