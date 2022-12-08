public class Magazine implements Printable2{
    private String name;
    public Magazine(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Magazine is " + this.name);
    }
}
