public class Parrot extends Animal{
    private String food;
    private String name;
    public Parrot(String location, String food, String name) {
        super(location);
        this.food = food;
        this.name = name;
    }
    @Override
    public void makeNoise() {
        System.out.println(this.name+' '+ "chirp chirp");
    }
    public void makeNoise (String text) {
        System.out.println(this.name + " says " + text);
    }
    @Override
    public void eat () {
        System.out.println(this.name+" eat "+this.food);
    }
    public String getLocation() {
        return location;
    }
    public String getFood() {
        return food;
    }
}
