package A;

public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;


    @Override
    public double getArea() {
        double p = sum() / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void print() {
        System.out.println("Треуголник со сторонами " + a + ", " + b + ", " + c +
                "\nПлощадь: " + getArea() + "\tПериметр: " + sum());
    }

    @Override
    public double sum() {
        return this.a + this.b + this.c;
    }
}
