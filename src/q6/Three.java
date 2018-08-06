package q6;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 6. 输入某二叉树的前序遍历和中序遍历的结果，请重建二叉树。假设输入的前序遍历和
 * 中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序
 * 遍历序列{4,7,2,1,5,3,8,6},则重建二叉树并返回。
 * 
 * 思路：先找到根结点，然后利用递归方法构造二叉树。
 * */
public class Three {

	public static void main(String[] args) {
			int[] pre = {1,2,4,7,3,5,6,8};
			int[] in = {4,7,2,1,5,3,8,6};
			TreeNode  tn = reConstructBinaryTree(pre,in);
			
			

	}
static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode (int x){
			val = x;
		}
		
	}
public static TreeNode	 reConstructBinaryTree(int[] pre, int[] in) {
	/**
	 * 1.前序遍历的第一个是根。
	 * 2.中序的左右分别为左子树和又字数，如此递归
	 * */
	if(pre == null || in == null)  {
		return null;
	}
	if(pre.length == 0 || in.length == 0) {
		return null;
	}
	if(pre.length != in.length) {
		System.out.println("前序与中序长度不同");
		return null;
	}
	TreeNode root = new TreeNode(pre[0]);
	for (int i = 0; i < pre.length; i++) {
		if(pre[0] == in[i]) {
			root.left = reConstructBinaryTree(
					Arrays.copyOfRange(pre, i, i+1), Arrays.copyOfRange(in, 0, i)
					);	
			root.right = reConstructBinaryTree(
					Arrays.copyOfRange(pre,i+1, pre.length), Arrays.copyOfRange(in, i+1,in.length)
					);	
			
		}
	}
	return null;
	
	
}
}

