package A;

public class Programmer extends Employee{
    String level;
    public Programmer(String name, int salary, String level) {
        super(name, salary);
        this.level = level;
    }
    public Programmer(){
        super();
        level = "kakashka";
    }

    @Override
    public void add0(int amount) {
       this.salary *= Math.pow(10, amount);
    }

    @Override
    public void work() {
        System.out.println(name + " пишет код...");
    }

    @Override
    public void print() {
        System.out.println("Программист " + name +
                "\nЗарплата: " + salary + "\t Уровень: " + level);
    }
}
