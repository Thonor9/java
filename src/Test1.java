import java.util.ArrayList;
import java.util.Iterator;
public class  Test1 {
	/**
	 * 有1，2，3，4四个数字，用这4个数字来组成重复数字且互不相同
	 * 的三位数，如 123，132，124，写出程序，打印出这些三位书分别是什么，
	 * 并统计这些三位数的总和。
	 * 
	 * */
	

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		ArrayList<Integer> al =chose(a); 
		int sum = 0;
		for (int i = 0; i < al.size(); i++) {
			sum += al.get(i);
			System.out.print(al.get(i)+"\t");
		}
		System.out.println();
		System.out.println("sum="+sum);
//		Iterator<Integer> it = al.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
		

	}
	public static ArrayList<Integer>  chose(int[] a) {
		ArrayList<Integer> al = new ArrayList<>();
		boolean[] b = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = true;
			for (int j = 0; j < a.length; j++) {
				if(b[j]==false) {
					b[j] = true;
					for (int j2 = 0; j2 < b.length; j2++) {
						if(b[j2]==false) {
							al.add(a[i]*100+a[j]*10+a[j2]);
//							System.out.print(a[i]*100+a[j]*10+a[j2]+"\t");
//							System.out.println(i+"三次循环");
						}
					}
					b[j] = false;
				}
				//System.out.println("二次循环");
			}
			//System.out.println("一次循环");
			b[i] = false;
		}
		return al;
	}
//	public static  name() {
//		
//	}

}
