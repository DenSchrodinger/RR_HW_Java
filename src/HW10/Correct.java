package HW10;

import java.util.Arrays;

public class Correct {
    //    HW10.1    https://www.codewars.com/kata/577bd026df78c19bca0002c0/train/java
    //Character recognition software is widely used to digitise printed texts.
    //Thus the texts can be edited, searched and stored on a computer.
    //When documents (especially pretty old ones written with a typewriter),
    // are digitised character recognition softwares often make mistakes.
    //Your task is correct the errors in the digitised text.
    // You only have to handle the following mistakes:
    //S is misinterpreted as 5
    //O is misinterpreted as 0
    //I is misinterpreted as 1
    public static String correct(String string) {
        string = string.replace('5', 'S');
        string = string.replace('0', 'O');
        string = string.replace('1', 'I');
        return string;
    }
}
