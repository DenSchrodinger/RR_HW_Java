package HW10;

public class Kata {
    //    HW10.2    https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
    public static boolean feast(String beast, String dish) {
        char beastFirst = beast.charAt(0); // get first character of beast
        char beastLast = beast.charAt(beast.length() - 1); // get last character of beast
        char dishFirst = dish.charAt(0); // get first character of dish
        char dishLast = dish.charAt(dish.length() - 1); // get last character of dish

        if (beastFirst == dishFirst && beastLast == dishLast) { // check if first and last characters match
            return true;
        }
        else {
            return false;
        }
    }
}
