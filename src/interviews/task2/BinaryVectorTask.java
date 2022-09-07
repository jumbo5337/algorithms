package interviews.task2;

/* Given binary vector of N length
 * Need to find max remote distance
 * [0, 0, 0, 1, 0, 0, 1] --> 3 [X, 0, 0, 1, 0, 0, 1]
 * [0, 1, 0, 0, 0, 0, 0, 1] --> 2 [0, 1, 0, 0, X, 0, 0, 1]
 */
public class BinaryVectorTask {


    public static int findMaxDistance(int[] arr) {

        int max = 0;
        boolean isArrayBorder = true;
        boolean zeroVector = true;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && i == arr.length - 1) {
                isArrayBorder = true;
                if (zeroVector) {
                    max = arr.length;
                }
            }
            if (arr[i] == 0) {
                k++;
            }
            if (arr[i] == 1) {
                zeroVector = false;
                int maxLen;
                if (isArrayBorder) {
                    maxLen = k;
                } else {
                    if (k - 1 == 0) {
                        maxLen = 0;
                    } else {
                        maxLen = (k - 1) / 2;
                    }
                }
                max = Math.max(max, maxLen);
                isArrayBorder = false;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0, 1, 0, 0, 1};
        System.out.println(findMaxDistance(arr1));

        int[] arr2 = {0, 1, 0, 0, 0, 0, 0, 1};
        System.out.println(findMaxDistance(arr2));

        int[] arr3 = {1, 1, 1, 0, 0, 0, 1, 1};
        System.out.println(findMaxDistance(arr3));



    }


}
