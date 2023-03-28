package HW9;
public class Director extends BaseManager {
    private int salaryDirector;
    public Director(String name, int baseSalary, int numberOfSubordinates, int salaryDirector) {
        super(name, baseSalary, numberOfSubordinates);
        this.salaryDirector = salaryDirector;
    }

    public void setSalaryDirector(int salaryDirector) {
        this.salaryDirector = salaryDirector;
    }

    @Override
    public int getSalary() {
        if(getNumberOfSubordinates() == 0){
            return getSalary();
            //Если количество подчиненных 0, то результат как у обычного рабочего.
        }
        else {
            return (int) (getSalary() * ((getNumberOfSubordinates() / 100) * 9 ));
            //<базовая ставка> * (<количество подчиненных> / 100 * 9).
        }
    }
}
