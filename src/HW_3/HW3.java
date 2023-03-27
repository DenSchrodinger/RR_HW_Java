package HW_3;

public class HW3 {
    public static void main(String[] args) {
        int a = 38 ;
        int b = 4 ;

        if(a == b) {
            System.out.println("a = b");
        }

        if(a < b) {
            System.out.println("a < b");
        }

        if(a > b) {
            System.out.println("a > b");
        }

        if((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        }
        else {
            System.out.println("some variable is odd");
        }

        if(a > 10) {
            System.out.println("a больше 10");
        }

        if(a < 100) {
            System.out.println("a меньше 100");
        }

        if((a / 2) < 20) {
            System.out.println("результат деления a на 2 меньше 20");
        }

        if(a >= 5 && a <= 50) {
            System.out.println("значение переменной между 5 и 50 включительно");
        }
        else {
            System.out.println("значение переменной меньше 5 или больше 50");
        }
    }
}