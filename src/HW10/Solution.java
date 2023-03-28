package HW10;
public class Solution {
    //    HW10.1    https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java
    // Write a function to split a string and convert it into an array of words.
    // Examples (Input ==> Output):
    // "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]

    public static String[] stringToArray(String s) {
        String[] words = s.split(" ");
        return words;
    }

}
