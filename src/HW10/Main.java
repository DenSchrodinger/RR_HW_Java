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
        String input = "I love arrays they are my favorite";
        String[] words = Solution.stringToArray(input);
        System.out.println(Arrays.toString(words));

        System.out.println("\n ====================== HW 10.1 codewars 5");
//    HW10.1    https://www.codewars.com/kata/577bd026df78c19bca0002c0/train/java
        String replace = "We need to take S as 5 O as 0 and I as 1";
        System.out.println(Correct.correct(replace));

        System.out.println("\n ====================== HW 10.2 codewars 6");
//    HW10.2    https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
       String abbreviature = "Sam Harris";
       System.out.println(abbreviature + " is for " + AbbreviateTwoWords.abbrevName(abbreviature));

        System.out.println("\n ====================== HW 10.2 codewars 7");
//    HW10.2    https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
        String beast = "Red Dragon t";
        String dish = "Ravioly with eggplant";
        System.out.println(Kata.feast(beast, dish));

        System.out.println("\n ====================== HW 10.2 codewars 8");
//    HW10.2    https://www.codewars.com/kata/5704aea738428f4d30000914/train/java
        System.out.println(Kata2.tripleTrouble("LLh","euo","xtr"));

        System.out.println("\n ====================== HW 10.2 codewars 9");
//    HW10.2    https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java
        char ch = 'a';
        System.out.println(Kata3.position(ch));

        System.out.println("\n ====================== HW 10.2 codewars 10");
//    HW10.2    https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        System.out.println("Сумма массивов arr1 + arr2 = " + Sum.arrayPlusArray(arr1, arr2));

        System.out.println("\n ====================== HW 10.3 codewars 11");
//    HW10.3    https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7/train/java
        String str = "asdfdghghjkl";
        System.out.println(Upper.MakeUpperCase(str));

        System.out.println("\n ====================== HW 10.3 codewars 12");
//    HW10.3    https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/java
        String str2 = "arrrrrray";  //commit test
        //System.out.println(RemoveChars.remove());

//        System.out.println("\n ====================== HW 10.3 codewars 13");
////    HW10.3    https://www.codewars.com/kata/57eae20f5500ad98e50002c5/train/java
//        System.out.println();
//
//        System.out.println("\n ====================== HW 10.3 codewars 14");
////    HW10.3    https://www.codewars.com/kata/58649884a1659ed6cb000072/train/java
//        System.out.println();
//
//        System.out.println("\n ====================== HW 10.3 codewars 15");
////    HW10.3    https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/train/java
//        System.out.println();

    }
}