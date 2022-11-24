public class Engineer {

    String name;
    String surname;
    String position;
    int salary;

    public Engineer(String name, String surname, String position, int salary) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }
    public void name() {
            System.out.println("Person's name: \n"+ name);
        }
    public void surname() {
        System.out.println("Person's surname: \n" +surname);
    }
    public void position() {
        System.out.println("Person's position: \n" + position);
    }
    public void salary() {
        System.out.println("Person's salary: \n" + salary);
    }
}

//public void displayInfo(String name, String surname,  String position, int salary) {
//    System.out.println("Person's name: \n"+ name +"\nPerson's surname: \n" +surname + "\nPerson's position: \n" + position +"\nPerson's salary: \n" + salary);
//}