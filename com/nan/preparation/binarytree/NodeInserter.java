package com.nan.preparation.binarytree;

/**
You are given a pointer to the root of a binary search tree and a value to be inserted into the tree. Insert this value into its appropriate position in the binary search tree and return the root of the updated binary tree. You just have to complete the function.

Input Format

You are given a function,

node * insert (node * root ,int value) {

}

node is defined as :

Node is defined as :

 class Node 
    int data;
    Node left;
    Node right;
    


static Node Insert(Node root,int value) {

       
    }

Constraints

    No. of nodes in the tree 500

Output Format

Return the root of the binary search tree after inserting the value into the tree.

Sample Input

        4
       / \
      2   7
     / \
    1   3

The value to be inserted is 6.

Sample Output

         4
       /   \
      2     7
     / \   /
    1   3 6

*/
public class NodeInserter {

  public static void main(String[] args) {
    NodeInserter nodeInserter = new NodeInserter();
    
    // Build the tree as shown in the sample.
    
    // Print out the tree.
    
  }

  public static final class Node {
    private final int data; // Always instantiate a node with data, which doesn't change.
    private int left; // This field is meant to be modified during insertion.
    private int right; // This field is meant to be modified during insertion.
  }
}
