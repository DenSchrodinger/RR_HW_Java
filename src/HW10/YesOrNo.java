package HW10;
public class YesOrNo {
//    HW10.1    https://www.codewars.com/kata/53369039d7ab3ac506000467/train/java
//    Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
    public static String boolToWord(boolean b) {
        if (b){
            return "Yes";
        }
        else {
            return "No";
        }
    }
}