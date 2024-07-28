package org.example.collections.practice.Date20240126;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class DiffrenteDate {
    public static void main(String[] args) throws ParseException {
        String startDate="20240128";
        String endDate="20240127";
        SimpleDateFormat sd1=new SimpleDateFormat("YYYYMMdd");
        Date data1=sd1.parse(startDate);
        
        SimpleDateFormat sd2=new SimpleDateFormat("yyyyMMdd");
        Date date2=sd2.parse(endDate);

        //Duration duration=Duration.between(data1,date2);


    }
}
