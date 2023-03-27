package HW8_1;

public class Manager extends Worker{
    private int workers;

    public Manager(String name, int age, String gender, int daySalary, int workers) {
        super(name, age, gender, daySalary);
        this.workers = workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public int getWorkers() {
        return workers;
    }

    public int getManagerSalary(int days){
        int salary = getDaySalary() * days;
        return (int) (salary + salary * (getWorkers() / 100.0));
    }
}
