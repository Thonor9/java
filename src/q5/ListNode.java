package q5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值
 * 思路：借助栈实现，或使用递归的方法；
 * */
public class ListNode {
	/**
	 * 创建单链表，并输入，输出数据
	 * */
	static node head = null;
	static node temp = null;
	public void addNode(int d ) {
		/**
		 * 第一步：把数据输入的到节点中;
		 * 第二步：判断头节点是否为空，如果头结点为空，此节点为头结点
		 *        如果不为空把头节点放入temp中。
		 * 第三步：遍历这个链表；
		 *        
		 * 
		 * */
		node node = new node(d);
		if(head == null) {
			head = node;
			return ;
		}
		temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}

	public static void main(String[] args) {
		int a[] = new int[3];
		ListNode id = new ListNode();
		for (int i = 0; i < a.length; i++) {
			Scanner scan = new Scanner(System.in);
			a[i] = scan.nextInt();
			id.addNode(a[i]);
		}
		temp = head;
		for (int i = 0; i < a.length; i++) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		ArrayList<Integer> list = rever();
		for (Integer integer : list) {
			System.out.println(integer);
		}
		

	}
	public static ArrayList<Integer> rever() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		/**
		 * 1。判断链表是否是空，空则直接返回
		 * 2。 遍历链表把数据装入战中，
		 * 3.栈中的内容pop到arraylist中
		 * */
		temp = head;
		if (temp == null) {
			return list;
		}
		Stack<Integer> stack = new Stack<Integer>();
		while(temp != null) {
			stack.push(temp.data);
			temp = temp.next;	
		}
		while (!stack.isEmpty()) {
			list.add(stack.pop().intValue());
			
		}
		return list;
		
	}

}
