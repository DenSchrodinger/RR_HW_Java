package HW_7;

public class Employee extends Person {
//        класс HW_7.Employee с полями как у HW_7.Person (из предыдущего задания) и поле зарплата.
//        Класс должен иметь метод isSameName(HW_7.Employee employee) который возвращает true, если у сотрудника
//        у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
    double salary;
    public Employee(String Name, int Age, String Gender, double salary) {
        super(Name, Age, Gender);
        this.salary = salary;
    }
    @Override
    public String getName(){
        return Name;
    }
    public boolean isSameName(Employee employee) {
        return Name.equals(employee.getName());
    }

    public double getSalary() {
        return salary;
    }
}
