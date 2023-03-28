package HW_6;
public class HW6_2 {
    public static void main(String[] args) {

       System.out.println("\n=========================\n Задача №1 - вывести все буквы “о” из этой строки.\n");
       String s1 = "Перестановочный алгоритм быстрого действия";
       for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'о') {
                System.out.print(s1.charAt(i) + " ");
            }
       }

        System.out.println("\n=========================\n Задача №2 - подсчитать количество букв “е” в строке.\n");
        String s2 = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println("Количество букв 'е' в строке: " + count);

        System.out.println("\n=========================\n Задача №3 - вывести индексы начала всех подстрок - “рит”, независимо от регистра.\n");
        String s3 = "Посмотрите как Рите нравится ритм";
        s3 = s3.toLowerCase();
        int index = s3.indexOf("рит");
        while( index != -1) {
            System.out.print(index + " ");
            index = s3.indexOf( "рит", index + 1);
        }

        System.out.println("\n=========================\n Экстра Задача - подсчитать количество строк в массиве, которые не содержат буквы “е”.\n");
        String[][] array = {
                {"Привет", "всем", "кто"},
                {"изучает", "язык", "программирования"},
                {"java"}
        };
        int count2 = 0;

        for (int i = 0; i < array.length; i++) { // перебираем все строки в массиве
            for (int j = 0; j < array[i].length; j++) { // перебираем все слова в текущей строке
                if (array[i][j].indexOf('е') == -1) { // если слово НЕ содержит букву "е"
                    // можно поставить так же условие: (!array[i][j].contains("е"))
                    // ! перед выражением делает НЕ, т.е. array[i][j].contains("е") - сожержит е,
                    // + ! в начале - НЕ содержит
                    count2 ++;
                }
            }
        }
        System.out.println("Количество строк БЕЗ буквы 'е' : " + count2);

    }
}