public class Cat extends Animal{
    private String food;
    private String name;
    public Cat(String location, String name, String food) {
        super(location);
        this.name = name;
        this.food = food;
    }
    @Override
    public void makeNoise() {
        System.out.println(this.name+' '+ "say meow");
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
