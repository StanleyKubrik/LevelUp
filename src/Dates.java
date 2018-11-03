import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {
    private Date date;
    String oldDate;

    public void printDateFromNow(){
        oldDate = "2018-10-28 12:00:00";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            date = simpleDateFormat.parse(oldDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(day(date));
    }

    private static long day(Date date){
        return (System.currentTimeMillis() - date.getTime()) / (24 * 60 * 60 * 1000);
    }
}