public class AbstractMain {
    public static void main (String[] args) {
        Rectangle rectangle = new Rectangle(7,9);
            System.out.println("Rectangle's perimeter is " + rectangle.getPerimeter());
            System.out.println("Rectangle's area is " + rectangle.getArea());

        Printable2 [] print = new Printable2[3];
        print [0] = new Book2("The Last Wish");
        print [1] = new Book2("Sword of Destiny");
        print [2] = new Magazine("Transformers");

        for (Printable2 printable2 : print) {
            printable2.print();
        }
    }
}

