package HW8_1;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n========================= Задача №1.\n");

        Employee employee = new Employee("John", 36, "Male", 20);
        System.out.println("Зарплата " + employee.getName() + "a = " + employee.getSalary(13));

        System.out.println("\n========================= Задача №2.\n");
        Manager manager = new Manager("Andre", 40, "Male", 30, 3);
        System.out.println("Зарплата " + manager.getName() + "a = " + manager.getManagerSalary(13));

    }
}
