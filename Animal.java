public class Animal {
    protected String location;
    String food;                                  //вопрос
    public Animal(String location) {
        this.location = location;
    }
    public void makeNoise () {
        System.out.println("Animals say in different ways");
    }
    public void eat () {
        System.out.println("Eat");
    }
    public String getLocation() {           //вопрос
        return location;
    }
    public String getFood() {               //вопрос
        return food;
    }
}
