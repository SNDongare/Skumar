package JavaProgram1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderClass {

	public static void main(String[] args) {


		Calendar cal= Calendar.getInstance();
		
		SimpleDateFormat sdf= new SimpleDateFormat("m/d/yy hh:mm:ss");
		
		System.out.println(sdf.format(cal.getTime()));

	}

}
