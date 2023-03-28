package HW10;
public class Solution {
    //    HW10.1    https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java
    // Write a function to split a string and convert it into an array of words.
    // Examples (Input ==> Output):
    // "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]

    private static String input;
    public static String[] stringToArray(String s) {
        //String input = "I hate arrays they are sucks";
        String[] words = input.split(" ");
        return words;
    }

    public static void setInput(String input) {
        Solution.input = input;
    }
//    public static void main(String[] args) {
//        String input = "This is a test string";
//        String[] words = splitString(input);
//        System.out.println(Arrays.toString(words)); // prints ["This", "is", "a", "test", "string"]
//    }
}
