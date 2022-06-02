public class Employee {
    private static int counter;
    private final String name;
    private int department;

    private double salary;
    private final int id;


    public Employee(String name, double salary, int department) {
        this.id = counter++;
        this.name = name;
        this.department = department;
        this.salary = salary;

    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("id: %d, ФИО: %s, ЗП: %.1f, отдел №: %d", id,name,salary,department);
    }
}

