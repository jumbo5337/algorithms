package old.tasks.task4;

public class VectorCounter {

    public static int count(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = 0;
        int count = 0;
        for(int i: arr){
            if(i>0){
                count+=1;
                max = Integer.max(count, max);
            } else {
                count=0;
            }
        }
        return max;
    }

}
