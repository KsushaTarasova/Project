package A;

// Что-то не так!

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.print();
        System.out.println("-------------");
        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.print();
        System.out.println("-------------");
        Product product = new Product("Молоко", 1, 80);
        product.print();
        System.out.println("-------------");
        Programmer programmer = new Programmer("Ксюша", 8000, "ТимЛид");
        programmer.print();
        programmer.work();
        programmer.add0(3);
        programmer.print();

        System.out.println("-------------");
        Bike bike = new Bike("розовый", "Barbie");
        bike.start();
        bike.move();
        bike.stop();
        bike.print();
    }
}