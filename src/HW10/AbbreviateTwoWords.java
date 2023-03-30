package HW10;
public class AbbreviateTwoWords {
    //    HW10.2    https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
//    Write a function to convert a name into initials.
//    This kata strictly takes two words with one space in between them.
//    The output should be two capital letters with a dot separating them.
//    It should look like this:
//    Sam Harris => S.H
//    patrick feeney => P.F
    public static String abbrevName(String name) {
        // split the name into two words based on the space
        String[] words = name.split(" ");
        // get the first letter of the first word and capitalize it
        String firstInitial = words[0].substring(0, 1).toUpperCase();
        // get the first letter of the second word and capitalize it
        String lastInitial = words[1].substring(0, 1).toUpperCase();
        // concatenate the initials with a dot in between
        String initials = firstInitial + "." + lastInitial + ".";
        return initials;
    }
}
