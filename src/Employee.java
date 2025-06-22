public class Employee {
    @First
    private String name;
    private String title;
    private Double salary;

    public Employee(String title, Double salary, String name) {
        this.title = title;
        this.salary = salary;
        this.name = name;
    }

    public Double calculateSalary() {
        return this.salary - 1234;
    }

    public void updateSalary() {
        this.salary = 3334444.3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee first = new Employee("Waiter",34342.3,"Stefan");
        Employee second = new Employee("Economist",12234.3,"Jovan");
        System.out.println(first.calculateSalary());
        first.updateSalary();
    }
}
