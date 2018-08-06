import java.io.File;
import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] a = new int[n];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = scan.nextInt();	
//		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+"\t");
//		}
//		File file = new File("tinyW.txt");
//		File file1 = new File("tinyT.txt");
//		int[] a = {1,2,3,4,5,6,7,8,9,10,11};
//		int k = scan.nextInt();
//		int m = rank(k,a);
//		System.out.println(m);
		StringBuilder s=new StringBuilder("Hello");
		if(s.length()>5&& 
				(s.append("there").equals("False")));
		System.out.println("value is "+s);
	}
	public static int rank(int key, int[] a ) {
		int lo = 0;
		int hi = a.length-1;
		while (lo<=hi) {
			int mid = lo +(hi-lo)/2;
			if (key<a[mid]) {
				hi = mid -1;
			}
			else if(key>a[mid]) {
				lo = mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
		
	}
}