import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Stopwatch {
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 1;

    public void fiveMin() throws InterruptedException {
        Date date = new Date();
        date.setHours(0);
        date.setMinutes(0);
        date.setSeconds(0);

        for (; seconds <= 60; seconds++) {
            if (seconds == 60) {
                date.setSeconds(0);
                seconds = 0;
                minutes++;
            }
            if (minutes == 60) {
                date.setMinutes(0);
                minutes = 0;
                hours++;
            }
            if (minutes == 5 && seconds == 1){
                return;
            }
            date.setSeconds(seconds);
            date.setMinutes(minutes);
            date.setHours(hours);

            System.out.println(formatTime(date.getTime()));
            Thread.sleep(1000);
        }
    }

    static String formatTime(long ms) {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss") ;
        format.setTimeZone(TimeZone.getTimeZone("EET"));
        return format.format(new Date(ms));
    }
}
