package A;

public class Bike extends Vehicle{
    private String model;

    public Bike(String color, String model) {
        super(color);
        this.model = model;
    }

    @Override
    public void move() {
        System.out.println("Велосипед едет");
    }

    @Override
    public void start() {
        System.out.println("Велосипед начинает ехать");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед остановился");
    }

    @Override
    public void print() {
        System.out.println("Велосипед: цвет " + color + ", модель " + model);
    }
}
