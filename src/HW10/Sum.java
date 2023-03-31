package HW10;

public class Sum {
//    HW10.2    https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java
//    get the sum of all their elements.
//    P.S. Each array includes only integer numbers. Output is a number too.
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sumArr1 = 0;
        for (int i = 0 ; i < arr1.length; i++){
            sumArr1 += arr1[i];
        }

        int sumArr2 = 0;
        for (int i = 0 ; i < arr2.length; i++){
            sumArr2 += arr2[i];
        }
        return sumArr1 + sumArr2;
    }
}
