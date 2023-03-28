package HW9;

import HW8_2.BaseManager;

public class Director extends BaseManager {
    private int salaryDirector;
    public Director(String name, int baseSalary, int numberOfSubordinates, int salaryDirector) {
        super(name, baseSalary, numberOfSubordinates);
        this.salaryDirector = salaryDirector;
    }

    public void setSalaryDirector(int salaryDirector) {
        this.salaryDirector = salaryDirector;
    }

        public int getSalaryDirector() {
        if(getNumberOfSubordinates() == 0){
            return getBaseSalary();
            //Если количество подчиненных 0, то результат как у обычного рабочего.
        }
        else {
            return (int) (getBaseSalary() * ((getNumberOfSubordinates() / 100) * 9 ));
            //<базовая ставка> * (<количество подчиненных> / 100 * 9).
        }
    }
}
