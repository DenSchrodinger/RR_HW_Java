package HW9;
public class Manager extends BaseManager {

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    public int getSalary(){
        if(getNumberOfSubordinates() == 0){
            return getSalary();
            //Если количество подчиненных 0, то результат как у обычного рабочего.
        }
        else {
            return (int)(getSalary() * ((getNumberOfSubordinates() / 100) * 3 ));
            //<базовая ставка> * (<количество подчиненных> / 100 * 3).
        }
    }
}