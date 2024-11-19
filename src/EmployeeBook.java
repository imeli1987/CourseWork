public class EmployeeBook {

    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public boolean findAddEmployee() {
        if (size >= employees.length) {
            return false;
        }
        return true;
    }
    public final void addEmployee(String fio, int department, int salary) {
        if (findAddEmployee()) {
            Employee newEmployee = new Employee(fio, department, salary);
            employees[size++] = newEmployee;
            System.out.println("Сотрудник " + newEmployee.getId() + " добавлен");
        } else {
            System.out.println("Невозможно добавить сотрудника, нет места");
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                System.out.println("Сотрудник с id=" + id + " не найден");
                break;
            }
            if (employees[i].getId() == id) {
                System.out.println("Сотрудник с id=" + employees[i].getId() + " удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }
    public final void getSalarySum() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println(sum);
    }

    public final void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public final void minSalary() {
        double min = -1;
        int id = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                id = employees[i].getId() - 1;
            }
        }
        if (min == -1) {
            System.out.println("Сотрудников нет");
            return;
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + employees[id]);
    }

    public final void maxSalary() {
        double max = 1000000000;
        int id = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                id = employees[i].getId() - 1;

            }
        }
        if (max == 1000000000) {
            System.out.println("Сотрудников нет");
            return;
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + employees[id]);
    }

    public final void averageSalary() {
        double salarySum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            salarySum += employee.getSalary();
        }
        if (employees.length == 0) {
            System.out.println("Средняя зарплата: 0");
            return;
        }
        System.out.println("Средняя зарплата: " + salarySum / employees.length);
    }

    public final void printFio() {
        if (employees.length == 0) {
            System.out.println("Сотрудников нет");
            return;
        }
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFio());
            }
        }
    }

    public final void indexSalary(int percent) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            employees[i].setSalary((int) (employees[i].getSalary() + employees[i].getSalary() * ((double) percent / 100)));
        }
        if  (employees.length == 0) {
            System.out.println("Сотрудников нет");
            return;
        }
    }

    public final void minDepartmentSalary(int department) {
        double min = 1000000000.00;
        int id = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() < min) {
                    min = employees[i].getSalary();
                    id = employees[i].getId() - 1;
                }
            }
        }
        if (min == 1000000000.00) {
            System.out.println("Сотрудников в отделе нет");
            return;
        }
        System.out.println("Сотрудник с минимальной зарплатой в отделе: " + employees[id]);
    }

    public final void maxDepartmentSalary(int department) {
        double max = -1.00;
        int id = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() > max) {
                    max = employees[i].getSalary();
                    id = employees[i].getId() - 1;
                }
            }
        }
        if (max == -1.00) {
            System.out.println("Сотрудников в отделе нет");
            return;
        }
        System.out.println("Сотрудник с максимальной зарплатой в отделе: " + employees[id]);
    }

    public final void sumDepartmentSalary(int department) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Сумма зарплат в отделе: " + sum);
    }

    public final void averageDepartmentSalary(int department) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Средняя зарплата в отделе: 0");
            return;
        }
        System.out.println("Средняя зарплата в отделе: " + sum / count);
    }

    public final void indexDepartmentSalary(int department, int percent) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getDepartment() == department) {
                employees[i].setSalary((int) (employees[i].getSalary() + employees[i].getSalary() * ((double) percent / 100)));
            }
        }
    }

    public final void printDepartmentEmployees(int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getDepartment() == department) {
                System.out.println("Сотрудник " + (i + 1) + ": " + employees[i].getFio() + ", " + employees[i].getSalary());
            }
        }
    }

    public final void salaryLessThanMin(int salaryLess) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getSalary() < salaryLess) {
            //    System.out.println("Сотрудник " + employees[i].getId() + ": " + employees[i].getFio() + ", " + employees[i].getSalary());
                System.out.println(employees[i]);

            }
        }
    }

    public final void salaryMoreThanMax(int salaryLess) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getSalary() >= salaryLess) {
            //    System.out.println("Сотрудник " + employees[i].getId() + ": " + employees[i].getFio() + ", " + employees[i].getSalary());
                System.out.println(employees[i]);

            }
        }
    }
    public final void id(int id) {
        id = id - 1;
        System.out.println(employees[id]);
    }
    public final void printEmployeeId ( int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getId() == id && employees[i] != null) {
                System.out.println(employees[i]);
                break;
            } else {
                System.out.println("Сотрудник не найден");
                break;
            }
        }
    }
}