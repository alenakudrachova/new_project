public class Rectangle extends AbstractFigure {
    public int a;
    public int b;
    public Rectangle (int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public int getPerimeter() {
        return 2*(a+b);
    }
    @Override
    public int getArea() {
        return a*b;
    }
}
