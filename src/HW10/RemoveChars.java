package HW10;
public class RemoveChars {

    //    HW10.3    https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/java
//    Сreate a function
//    that removes the first and last characters of a string.
//    You're given one parameter, the original string.
//    You don't have to worry with strings with less than two characters.
    public static String remove(String str2) {
        if (str2.length() <= 2) {
            return "";
        } else {
            return str2.substring(1, str2.length() - 1);
        }
    }
}