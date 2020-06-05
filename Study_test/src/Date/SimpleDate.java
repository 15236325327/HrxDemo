package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {

    public static void main(String[] args) {


        Date s = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s1 = sdf.format(s);
        System.out.println(s1);

        SimpleDateFormat sdr1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String s2 = sdr1.format(s);
        System.out.println(s2);

        String s3 = "2020/03/21 18:34:47";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        try {
            Date d = sdf2.parse(s3);
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
