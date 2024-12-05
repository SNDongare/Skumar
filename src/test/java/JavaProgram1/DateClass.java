package JavaProgram1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		Date d=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("m/d/yyyy hh:mm:ss");
		
		System.out.println(d);
		System.out.println(sdf.format(d));

	}

}
