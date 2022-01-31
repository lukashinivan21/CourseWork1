public class Employee {

    static int count = 1;
    private int id;

    private String name;
    private int department;
    private float salary;

    public Employee(String name, int department, float salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Полная информация о сотруднике: ФИО: " + name + ". Отдел: " + department + ". Зарплата: " + salary + ".";
    }
}
