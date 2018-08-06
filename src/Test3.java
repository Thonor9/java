import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test3 {
	public static void main(String[] args) {
		  Calendar c = Calendar.getInstance();
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月");
		  c.set(Calendar.YEAR, 2013);
		  c.set(Calendar.MONTH, Calendar.JANUARY);
		  c.set(Calendar.DATE, 1);
		  for (int i = 0; i < 12; i++) {
		   System.out.println(sdf.format(c.getTime()) + "有" + c.getActualMaximum(Calendar.DATE) + "天");
		   c.add(Calendar.MONTH, 1);

		  }
		 }


}
