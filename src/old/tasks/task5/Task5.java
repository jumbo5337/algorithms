package old.tasks.task5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Task5 {

    public static void main(String[] args) {

        HashMap<Integer, Integer> resultMap = new HashMap<>();
        LinkedHashMap<String, WorkingHours> log = LogFactory.getLog(50);
        log.forEach((x, y) -> {
            int k = 0; int cursor = 1;
            do {
                if ((cursor >= y.getBeginMin()) && (cursor <= y.getEndMin())) {
                    if (resultMap.get(cursor) == null) {
                        resultMap.put(cursor, 1);
                    } else {
                        resultMap.put(cursor, resultMap.get(cursor) + 1);
                    }
                }
                cursor = cursor+1;
            } while (cursor < 1439);
        });

        Set<Integer> keySet = resultMap.keySet();
        Integer maxMoment = 0;
        Integer maxMomentEnd = 0;
        int maxCount = 0;
        for (Integer i : keySet) {
            int current = resultMap.get(i);
            if (current > maxCount) {
                maxCount = current;
                maxMoment = i;
            }
            if (current == maxCount){
                maxMomentEnd = i;
            }
        }

        int maxHH = maxMoment/60;
        int maxMM = maxMoment - 60*maxHH;

        int endHH = maxMomentEnd/60;
        int endMM = maxMomentEnd - 60*endHH;

        System.out.println("Максимальное количество работников " + maxCount +
                " в момент времени c " + maxHH + ":" + maxMM + " по " + endHH  + ":" + endMM);

        for (String s : log.keySet()){
            System.out.println(s + " \n " + log.get(s));
        }
    }


}
