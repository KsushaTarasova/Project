package A;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public void print() {
        System.out.println("Прямоугольник со сторонами " + height + ", " + width
                + "\nПлощадь: " + getArea() + "\tПериметр: " + 2 * sum());
    }

    @Override
    public double sum() {
        return this.height + this.width;
    }
}
