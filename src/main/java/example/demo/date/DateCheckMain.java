package example.demo.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCheckMain {
    public static void main(String[] args) throws ParseException {
        String sDate1="1507/11/31";
        Date date1=new SimpleDateFormat("yyyy/MM/dd").parse(sDate1);
        System.out.println(sDate1+"\t"+date1);
    }
}
