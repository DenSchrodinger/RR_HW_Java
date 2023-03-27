package HW8_1;

public class Employee extends Worker {
    public Employee(String name, int age, String gender, int daySalary) {
        super(name, age, gender, daySalary);
    }

    public int getSalary(int days) {
        return getDaySalary() * days;
    }
}
