package assignment3;
import java.util.Scanner;

import assignment3.cs.NODE;
public class rahmabst {

	
	public static class BinaryTree{
		private static TreeNode root;
	private static class TreeNode{
	private TreeNode left;
	private TreeNode right;
	private int data;
	public  TreeNode(int data){
	this.data=data;
	}
	}
	public static void creatBinaryTree(){
	TreeNode first =new TreeNode(1);
	TreeNode second =new TreeNode(2);
	TreeNode third =new TreeNode(3);
	TreeNode fourth =new TreeNode(4);
	TreeNode fifth =new TreeNode(5);
	root =first;
	first.left=second;
	first.right=third;
	second.left=fourth;
	second.right=fifth;
	traversePreOrder(root);
	}
	public static void traversePreOrder(TreeNode node) {
	    if (node != null) {
	        System.out.println("%s " + node.data);
	        traversePreOrder(node.left);
	        traversePreOrder(node.right);
	    }}
	public static void main(String[]  args){ creatBinaryTree();}
	}
}