package A;

public class Product implements Summable {
    private String name;
    private int cost;
    private int percent;

    public Product(String name, int cost, int percent) {
        this.name = name;
        this.cost = cost;
        this.percent = percent;
    }

    @Override
    public void print() {
        System.out.println("Цена товара " + sum() + "\nСебестоимоть " + cost +
                "\tПроцент наценки " + percent);
    }

    @Override
    public double sum() {
        return cost + cost * percent/ 100.0;
    }
}
