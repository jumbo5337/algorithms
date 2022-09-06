package old.tasks.task3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringCounter {

    private static String replace(String s){
        return s.replace(",", "")        /// удаляем знаки препинания
                .replace(".", "")
                .replace("...", "")
                .replace("!", "")
                .replace("?", "")
                .replace("«", "")
                .replace("\"", "")
                .replace("»", "")
                .replace("\n", " ")
                .replace(" в ", "")
                .replace(" с ", "")
                .replace(" В ", "")
                .replace(" С ", "")
                .replace(" и ", "")
                .replace(" И ", "")
                .replace(" - ", "")
                .replace("\"", "")
                .replace(":", "")
                .replace(",", "")
                .replace(".", "")
                .replace("(", "")
                .replace(")", "")
                .replace("„", "");

    }

    public static HashMap<String, Integer> stringMap(String s){
        s=replace(s);
        s.split(" ");

        List<String> collect = Arrays.asList(s.split(" "))
                .stream()
                .filter(x -> !x.isEmpty() || !x.trim().isEmpty())
                .collect(Collectors.toList());
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String str: collect){
            String string = replace(str).trim().toLowerCase();
            Integer count=hashMap.get(string);
            if (count==null){
                hashMap.put(string, 1);
            } else {
                hashMap.put(string, count+1);
            }
        }
        return hashMap;
    }

    public static void showWordCount (String s){
        HashMap<String, Integer> hashMap = stringMap(s);
        Set<String> keySet = hashMap.keySet();
        for (String str:keySet){
            System.out.println("Слово: "+str + ",        встретилось: "+ hashMap.get(str) + " раз");
        }

    }

}
