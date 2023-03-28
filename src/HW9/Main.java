package HW9;
import java.util.Arrays;
public class Main {
//    Задача №1 задание из Task 8.2 со следующими условиями:
//    Все методы возвращающие ЗП должны называться getSalary
//    Все методы в утилитарном классе должны быть static
        public static void main(String[] args) {

            System.out.println("\n========================= Задача №1.\n");

            Employee employee1 = new Employee("John", 36);
            Employee employee2 = new Employee("Jake", 42);
            Employee employee3 = new Employee("Jeff", 30);

            Employee[] employees = {employee1,employee2, employee3};
            String[] names = new String[employees.length];
            for (int i = 0 ; i < names.length; i++) {
                names[i] = employees[i].getName();
            }
            System.out.println(Arrays.toString(names));
        }
}