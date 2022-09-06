package old.tasks.task5;

import java.util.LinkedHashMap;
import java.util.Random;

public class LogFactory {

    public static LinkedHashMap<String, WorkingHours> getLog(Integer n) {
        LinkedHashMap<String, WorkingHours> workingHoursHashMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String string = "Рабочий " + i;

            Random random = new Random();
            int HH1 = random.nextInt(15) + 8;
            int HH2 = random.nextInt(15) + 8;
            int MM1 = random.nextInt(59);
            int MM2 = random.nextInt(59);
            WorkingHours hours;
            if (HH1 > HH2) {
                hours = new WorkingHours(HH2, MM1, HH1, MM2);
            } else {
                hours = new WorkingHours(HH1, MM1, HH2, MM2);
            }
            workingHoursHashMap.put(string, hours);
        }

     return workingHoursHashMap;
    }


}
