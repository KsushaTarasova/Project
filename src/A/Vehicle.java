package A;

public abstract class Vehicle implements Movable {
    protected String color;

    public Vehicle(String color) {
        this.color = color;
    }

    public abstract void start();

    public abstract void stop();

}
