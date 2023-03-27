package HW_7;

public class HW7 {
    public static void main(String[] args) {

        System.out.println("\n=========================\n Задача №1.\n");
        Person jane = new Person("Jane", 35, "Female");
        System.out.println(jane.getName());

        Person bred = new Person("Bred",38 , "Male");
        System.out.println(bred.getName());

        Person fred = new Person("Fred",60 , "Ftaghn");
        System.out.println(fred.getName());

        System.out.println("\n=========================\n Задача №2.\n");

        Employee employee1 = new Employee("John", 30, "Male", 5000.0);
        Employee employee2 = new Employee("Jane", 25, "Female", 6000.0);
        Employee employee3 = new Employee("John", 40, "Male", 7000.0);

        System.out.println(employee1.isSameName(employee2)); // false
        System.out.println(employee1.isSameName(employee3)); // true
        System.out.println(employee2.isSameName(employee3)); // false

        System.out.println("\n=========================\n Задача №3.\n");
        Employee[] employeeArray = {employee1, employee2, employee3};
        System.out.println(Salary.getSum(employeeArray));

        System.out.println("\n=========================\n Задача №4.\n");

        System.out.println("\n=========================\n Задача №5.\n");
        Block b = new Block(new int[] {2,4,6} );
        System.out.println("height is " + b.getHeight());
        System.out.println("length is " + b.getLength());
        System.out.println("width is " + b.getWidth());
        System.out.println("Volume is " + b.getVolume());
        System.out.println("SA is " + b.getSurfaceArea());

//        System.out.println("\n=========================\n Экстра задача.\n");
////        https://www.codewars.com/kata/two-fighters-one-winner/java
//        HW_7.Fighter fighter1 = new HW_7.Fighter("John", 100, 10);
//        HW_7.Fighter fighter2 = new HW_7.Fighter("Jake",120, 7);
//        String firstAttacker;
//        public static String declaireWinner (HW_7.Fighter fighter1, HW_7.Fighter fighter1, String firstAttacker){
//            HW_7.Fighter f1, f2;
//            if (firstAttacker.equals(fighter1.name)){
//                f1 = fighter1;
//                f2 = fighter2;
//            } else {
//                f1 = fighter2;
//                f2 = fighter1;
//            }
//            while (true) {
//                f2.health -= f1.dpa;
//                System.out.println(f1.name + "attacks =>" + f2.name + " health = " + f2.health);
//                if (f2.health <=0) {
//                    return f1.name;
//                }
//
//                f1.health -= f2.dpa;
//                System.out.println(f2.name + "attacks =>" + f1.name + " health = " + f1.health);
//                if (f1.health <=0){
//                    return f2.name;
//                    }
//                }
//            }

        }
    }