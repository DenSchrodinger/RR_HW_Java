package HW10;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("\n ====================== HW 10.1 codewars 1");
//    HW10.1    https://www.codewars.com/kata/53369039d7ab3ac506000467/train/java
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(YesOrNo.boolToWord(b1));
        System.out.println(YesOrNo.boolToWord(b2));

        System.out.println("\n ====================== HW 10.1 codewars 2");
//    HW10.1    https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java
        System.out.println(BasicOperations.basicMath("+", 1, 4));
        System.out.println(BasicOperations.basicMath("-", 5, 3));
        System.out.println(BasicOperations.basicMath("*", 8, 9));
        System.out.println(BasicOperations.basicMath("/", 6, 3));

        System.out.println("\n ====================== HW 10.1 codewars 3");
//    HW10.1    https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java
        int[] result = Sequence.reverse(10);
        System.out.println(Arrays.toString(result));

        System.out.println("\n ====================== HW 10.1 codewars 4");
//    HW10.1    https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java
        Solution.setInput("I hate arrays they are sucks");
        System.out.println(Solution.stringToArray("I hate arrays they are sucks"));

        System.out.println("\n ====================== HW 10.1 codewars 5");
//    HW10.1    https://www.codewars.com/kata/577bd026df78c19bca0002c0/train/java


//    HW10.2    https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
//    HW10.2    https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
//    HW10.2    https://www.codewars.com/kata/5704aea738428f4d30000914/train/java
//    HW10.2    https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java
//    HW10.2    https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java

//    HW10.3    https://www.codewars.com/kata/53369039d7ab3ac506000467/train/java
//    HW10.3    https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java
//    HW10.3    https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java
//    HW10.3    https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java
//    HW10.3    https://www.codewars.com/kata/577bd026df78c19bca0002c0/train/java
    }
}