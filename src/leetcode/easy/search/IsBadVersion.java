package leetcode.easy.search;

public class IsBadVersion {

    static int badVersion = 4;

    public static void main(String[] args) {
        System.out.println(firstBadVersion(4));
    }
    public static int firstBadVersion(int n) {
        boolean isCurrentBad = isBadVersion(n);
        if (n == 1 && isCurrentBad){
            return n;
        }
        if (n == 2 && isCurrentBad) {
            if (isBadVersion(1)){
                return 1;
            } else {
                return n;
            }
        }
        int p1=1;
        int p2=n;
        int res = -1;
        while (true){
            int i = (p2-p1)/2;
            int j = i-1;
            boolean isIBad = isBadVersion(i);
            boolean isJBad = isBadVersion(j);
            if (isIBad && !isJBad) {
                res = i;
                break;
            } else if (!isIBad && !isJBad) {
                p1 = i+1;
            } else {
                p2 = i;
            }
        }
        return res;
    }

    private static boolean isBadVersion(int v) {
        return badVersion <= v;
    }
}
