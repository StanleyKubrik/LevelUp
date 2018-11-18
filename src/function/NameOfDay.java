package function;

import java.util.Map;
import java.util.TreeMap;

public class NameOfDay {
    Map<Integer, String> days = new TreeMap<>();

    public NameOfDay(int i){
        whatDay(i);
    }

    private void whatDay(int i){
        fillMap();
        for (Map.Entry pare : days.entrySet()) {
            if ((Integer)pare.getKey() == i){
                System.out.println(pare.getValue());
            }
        }
    }

    private void fillMap(){
        days.put(1, "Monday");
        days.put(2, "Tuesday");
        days.put(3, "Wednesday");
        days.put(4, "Thursday");
        days.put(5, "Friday");
        days.put(6, "Saturday");
        days.put(7, "Sunday");
    }
}
