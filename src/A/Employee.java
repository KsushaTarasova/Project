package A;

public abstract class Employee implements Addable{
    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void work();
}
