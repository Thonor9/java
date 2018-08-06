import java.util.Scanner;
/**
 * 递归实现二分查找
 * */
public class Test6 {

	public static void main(String[] args) {
		int[] a ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,};
		Scanner scan = new Scanner(System.in);
		int key = scan.nextInt();
		int x = rank(key, a,0,a.length-1);
		System.out.println(x);
	}
	public static int rank( int key ,int[] a) {
		return rank(key,a,0,a.length-1);
		
	}
	public static int rank(int key ,int[] a,int lo,int hi) {
		if(lo>hi) {
			return -1;
		}
		int mid = lo+(hi-lo)/2;
		 if (key < a[mid]) { 
			return rank(key, a, lo, mid-1);
		}
		else if(key > a[mid]) {
			return rank(key, a, mid+1, hi);
		}
		else {
			return mid;
		}
	}
}
