package HW8_2;

public class Manager extends BaseManager {

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public int getSalaryManager() {
        if(getNumberOfSubordinates() == 0){
            return getBaseSalary();
            //Если количество подчиненных 0, то результат как у обычного рабочего.
        }
        else {
            return (int)(getBaseSalary() * ((getNumberOfSubordinates() / 100) * 3 ));
            //<базовая ставка> * (<количество подчиненных> / 100 * 3).
        }
    }

}
