package com.puzhen.huffman;

import java.util.*;

public class BTComparator implements Comparator<BTNode> {

	public int compare(BTNode node1, BTNode node2) {
		return node1.getData() - node2.getData();
	}

}
