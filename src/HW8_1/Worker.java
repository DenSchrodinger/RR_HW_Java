package HW8_1;

public class Worker {

    private String name;
    private int age;
    private String gender;
    private int daySalary;

    public Worker(String name, int age, String gender, int daySalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.daySalary = daySalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDaySalary(int daySalary) {
        this.daySalary = daySalary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getDaySalary() {
        return daySalary;
    }
}
