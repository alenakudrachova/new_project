public class Horse extends Animal{
    private String food;
    private String name;
    public Horse(String location, String food, String name) {
        super(location);
        this.food = food;
        this.name = name;
    }
    @Override
    public void makeNoise() {
        System.out.println(this.name+' '+ "say neigh");
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
