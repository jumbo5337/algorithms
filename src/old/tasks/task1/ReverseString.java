package old.tasks.task1;

public class ReverseString {
    public static void main(String[] args) {

      // 1 способо
        String string = "Hello world";
        char[] inputString = string.toCharArray();
        char[] reverseString = new char[inputString.length];
        for (int i=0; i<inputString.length; i++){
            reverseString[reverseString.length-i-1]= inputString[i];
        }
        String reverseString1 = new String(reverseString);
        System.out.println(reverseString1);

     // 2 Способ
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(string);
        stringBuffer.reverse();
        String s = stringBuffer.toString();
        System.out.println(s);



    }



}
