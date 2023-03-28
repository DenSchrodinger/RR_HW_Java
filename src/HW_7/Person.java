package HW_7;
public class Person {
//    создать класс HW_7.Person с полями: имя, возраст, пол. Класс должен иметь метод - getName,
//    метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
    String Name;
    int Age;
    String Gender;
    public Person(String Name, int Age, String Gender) {
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
    }

    String getName() {
        if (Gender == "Male") {
            return "Mr. " + Name;
        }

        if (Gender == "Female") {
            return "Mrs. " + Name;
        }
        return null + " - " + " warning, the gender of " + Name + " is ... " + Gender;
    }
}
