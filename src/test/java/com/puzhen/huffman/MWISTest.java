package com.puzhen.huffman;

import java.io.IOException;

import com.puzhen.mwis.MWIS;

import junit.framework.TestCase;

public class MWISTest extends TestCase {

	MWIS mwis = new MWIS();
	
	public MWISTest(String name) {
		super(name);
	}

	public void test0() {
		byte[] array = null;
		try {
			array = mwis.run("tiny");
		} catch (IOException e) {
			fail(e.getMessage());
		}
		byte[] expect = {1};
		assertTrue(arrayEquals(expect, array));
	}
	
	public void testTwoNumbers() {
		byte[] array = null;
		try {
			array = mwis.run("twonumbers");
		} catch (IOException e) {
			fail(e.getMessage());
		}
		byte[] expect = {1, 0};
		assertTrue(arrayEquals(expect, array));
	}
	
	public void testThreeNumbers() {
		byte[] array = null;
		try {
			array = mwis.run("threenumbers");
		} catch (IOException e) {
			fail(e.getMessage());
		}
		byte[] expect = {0, 1, 0};
		assertTrue(arrayEquals(expect, array));
	}
	
	public void testThreeNumbers1() {
		byte[] array = null;
		try {
			array = mwis.run("threenumbers1");
		} catch (IOException e) {
			fail(e.getMessage());
		}
		byte[] expect = {1, 0, 1};
		assertTrue(arrayEquals(expect, array));
	}
	
	public void testFourNumber1() {
		byte[] array = null;
		try {
			array = mwis.run("fourvertices1");
		} catch (IOException e) {
			fail(e.getMessage());
		}
		byte[] expect = {1, 0, 1, 0};
		assertTrue(arrayEquals(expect, array));
	}
	
	public void testFourNumber2() {
		byte[] array = null;
		try {
			array = mwis.run("fourvertices2");
		} catch (IOException e) {
			fail(e.getMessage());
		}
		byte[] expect = {0, 1, 0, 1};
		assertTrue(arrayEquals(expect, array));
	}
	
	public void testFourNumber3() {
		byte[] array = null;
		try {
			array = mwis.run("fourvertices3");
		} catch (IOException e) {
			fail(e.getMessage());
		}
		byte[] expect = {1, 0, 0, 1};
		assertTrue(arrayEquals(expect, array));
	}
	
	private boolean arrayEquals(byte[] array1, byte[] array2) {
		if (array1.length != array2.length)
			return false;
		for (int i = 0; i < array1.length; i++)
			if (array1[i] != array2[i])
				return false;
		return true;
	}
}
