package HW8_2;

public class EmployeeUtils {
public  int findByName (String name, Employee[] arr){
    //    поиск сотрудника в массиве по его имени
    for (int i = 0; i< arr.length; i++){
        if (name.equals(arr[i].getName())){
            return i;
        }
    }
    return -1;
}

    public  int findBySubName (String subname, Employee[] arr){
        //    поиск сотрудника в массиве по вхождению указанной строки в его имени
        for (int i = 0; i< arr.length; i++){
            if (arr[i].getName().contains(subname)){
                return i;
            }
        }
        return -1;
    }

    public  int sumSalary (Worker[] arr){
        //  подсчет зарплатного бюджета для всех сотрудников в массиве
        int result = 0;
        for (int i = 0; i< arr.length; i++){
            result += arr[i].getBaseSalary();
            }
        return result;
        }

    public  int maxSalary (Worker[] arr){
        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i< arr.length; i++){
            if (maxSalary < arr[i].getSalaryWorker());
            maxSalary = arr[i].getSalaryWorker();
        }
        return maxSalary;
    }

    public  int minSalary (Worker[] arr){
        int minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (minSalary > arr[i].getSalaryWorker());
            minSalary = arr[i].getSalaryWorker();
        }
        return minSalary;
    }

//    поиск наименьшего количества подчиненных в массиве менеджеров
public  int minSub (Manager[] arr){
    int minSub = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++){
        if (minSub > arr[i].getNumberOfSubordinates());
        minSub = arr[i].getNumberOfSubordinates();
    }
    return minSub;
}

//    поиск наибольшего количества подчиненных в массиве менеджеров
public  int maxSub (Manager[] arr){
    int maxSub = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++){
        if (maxSub < arr[i].getNumberOfSubordinates());
        maxSub = arr[i].getNumberOfSubordinates();
    }
    return maxSub;
}

//    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
public  int maxDelta (Manager[] arr){
    int maxDelta = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++){
        int delta = arr[i].getSalaryManager() - arr[i].getBaseSalary();
        if (maxDelta < delta);
        maxDelta = delta;
    }
    return maxDelta;
}
//    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
public  int minDelta (Manager[] arr){
    int minDelta = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++){
        int delta = arr[i].getSalaryManager() - arr[i].getBaseSalary();
        if (minDelta > delta);
        minDelta = delta;
    }
    return minDelta;
}
}