
public class Test4 {
		 public static void main(String[] args) {
		  Double i = 12.3;
		  double j = 12.3;
		  String str = "123456789";
		   String st = str.substring(1,6);
		  for (int k = 0; k < st.length(); k++) {
			  System.out.print(str.charAt(k));
			  System.out.print(st.charAt(k));
			  
			
		}

		  System.out.println("It is " + (j == i) + " that j==i");
		 }



}
