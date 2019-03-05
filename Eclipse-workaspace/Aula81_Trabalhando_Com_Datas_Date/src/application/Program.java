package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat simpleDataFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat simpleDataFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date date = simpleDataFormat.parse("25/06/2018");
		Date date2 = simpleDataFormat2.parse("25/06/2018 19:40:07");
		
		System.out.println(date);
		System.out.println(date2);
	}

}
