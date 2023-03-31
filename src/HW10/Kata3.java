package HW10;

public class Kata3 {
    //    HW10.2    https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java
//    When provided with a letter, return its position in the alphabet.
//    Input :: "a"
//    Ouput :: "Position of alphabet: 1"
    public static String position(char alphabet) {
        int posInAplphabet = alphabet - 96;
        return "Position of alphabet: " + posInAplphabet;
    }
}
