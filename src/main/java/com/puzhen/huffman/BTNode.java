package com.puzhen.huffman;

/*
 *  Java Program to Implement Binary Tree
 */
  
 /* Class BTNode */
 class BTNode
 {    
     BTNode left, right, parent;
     int data;
 
     /* Constructor */
     public BTNode()
     {
         left = null;
         right = null;
         parent = null;
         data = 0;
     }
     /* Constructor */
     public BTNode(int n)
     {
         left = null;
         right = null;
         data = n;
     }
     /* Function to set left node */
     public void setLeft(BTNode n)
     {
         left = n;
         n.setParent(this);
     }
     /* Function to set right node */ 
     public void setRight(BTNode n)
     {
         right = n;
         n.setParent(this);
     }
     public void setParent(BTNode n) {
    	 parent = n;
     }
     public BTNode getParent() {
    	 return parent;
     }
     /* Function to get left node */
     public BTNode getLeft()
     {
         return left;
     }
     /* Function to get right node */
     public BTNode getRight()
     {
         return right;
     }
     /* Function to set data to node */
     public void setData(int d)
     {
         data = d;
     }
     /* Function to get data from node */
     public int getData()
     {
         return data;
     }   
     
     @Override
     public String toString() {
    	 return String.valueOf(data);
     }
     
     public int getDepth() {
    	 return getDepth(this) - 1;
     }
     
     private int getDepth(BTNode node) {
    	 if (node == null) return 0;
    	 if (node.getLeft() == null && node.getRight() == null)
    		 return 1;
    	 int depthOfLeft = getDepth(node.getLeft());
    	 int depthOfRight = getDepth(node.getRight());
    	 return Math.max(depthOfLeft, depthOfRight) + 1;
     }
     
     
     public int getHeight() {
    	 return getHeight(this);
     }
     
     private int getHeight(BTNode node) {
    	 BTNode parent = node.getParent();
    	 if (parent == null)
    		 return 0;
    	 return parent.getHeight() + 1;
     }
 }