package HW_2;
public class HW2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        //сложение, умножение, вычитание, деление.
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a / b);

        int a1 = 13;
        int b2 = 6;
        //Также вывести остаток от деления и сделать проверку на четность этих переменных.
        System.out.println(a1 % b2);
        if (a1 % 2 != 0) {
            if (b2 % 2 != 0) {
                System.out.println("Переменные a и b нечётные");
            } else
                System.out.println("Переменная a - нечётная, переменная b - чётная");
        } else {
            System.out.println("Переменная a - чётная, переменная b -не знаю");
        }

        //Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).
        System.out.println("\uD83D\uDE0A");
        System.out.println("\u263A");

    }
}