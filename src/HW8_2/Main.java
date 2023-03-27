package HW8_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n========================= Задача №0.\n");

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