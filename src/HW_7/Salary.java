package HW_7;

public class Salary extends Employee {
//        класс HW_7.Salary с единственным методом - getSum(HW_7.Employee[] employeeArray),
//        метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
     public Salary(String Name, int Age, String Gender, double salary) {
         super(Name, Age, Gender, salary);
     }

     public static double getSum(Employee[] employeeArray) {
         double sum = 0.0;
         for (int i = 0; i < employeeArray.length; i++) {
             sum += employeeArray[i].getSalary();
         }
         return sum;
     }
 }