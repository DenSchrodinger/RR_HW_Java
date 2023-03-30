package HW10;

public class Kata2 {
    //    HW10.2    https://www.codewars.com/kata/5704aea738428f4d30000914/train/java
        public static String tripleTrouble(String one, String two, String three) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < one.length(); i++) {
                result.append(one.charAt(i));
                result.append(two.charAt(i));
                result.append(three.charAt(i));
            }
            return result.toString();
        }
}