package com.puzhen.huffman;

import junit.framework.Test;
import junit.framework.TestSuite;

public class RunAllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("RunAllTests");
		suite.addTestSuite(BTNodeTest.class);
		suite.addTestSuite(HeapTest.class);
		return suite;
	}
}
