public class Book2 implements Printable2{
    private String name;
    public Book2(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Book is " + this.name);
    }
}
