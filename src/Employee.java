import java.util.Objects;

public class Employee {

    private String fio;
    private int department;
    private double salary;
    private static int counter = 0;
    private int id;

    public Employee(String fio, int department, int salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFio() {
        return fio;
    }
    public int getDepartment() {
        return department;
    }
    double getSalary() {
        return salary;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(fio, employee.fio) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, department, salary);
    }
    @Override
    public String toString() {
        return "Сотрудник " + id +
                ": " + fio +
                ", отдел: " + department +
                ", зарплата: " + salary;
    }


}
