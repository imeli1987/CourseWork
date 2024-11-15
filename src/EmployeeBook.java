public class EmployeeBook {

    private static final Employee[] employees = {
            new Employee("Иванов Иван Иванович", 1, 50000),
            new Employee("Иванов Макар Иванович", 2, 80000),
            new Employee("Иванов Дмитрий Иванович", 3, 60000),
            new Employee("Иванов Евгений Иванович", 5, 65000),
            new Employee("Иванов Семён Иванович", 1, 56000),
            new Employee("Иванов Максим Иванович", 2, 66000),

    };

    public final void getSalarySum() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println(sum);
    }

    public final void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public final void minSalary() {
        double min = employees[0].getSalary();
        int id = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                id = i;
            }
        }
        System.out.println("Min: " + employees[id]);
    }

    public final void maxSalary() {
        double max = employees[0].getSalary();
        int id = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                id = i;
            }
        }
        System.out.println("Max: " + employees[id]);
    }

    public final void averageSalary() {
        double salarySum = 0;
        for (Employee employee : employees) {
            salarySum = employee.getSalary();
        }
        System.out.println(salarySum / employees.length);
    }

    public final void printFio() {
        for (Employee employee : employees) {
            System.out.println(employee.getFio());
        }
    }

    public final void indexSalary(int percent) {

        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary((int) (employees[i].getSalary() + employees[i].getSalary() * ((double) percent / 100)));
        }
    }

    public final void minDepartmentSalary(int department) {
        double min = 1000000000.00;
        int id = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() < min) {
                    min = employees[i].getSalary();
                    id = i;
                }
            }
        }
        System.out.println(employees[id]);
    }

    public final void maxDepartmentSalary(int department) {
        double max = -1.00;
        int id = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() > max) {
                    max = employees[i].getSalary();
                    id = i;
                }
            }
        }
        System.out.println(employees[id]);
    }

    public final void sumDepartmentSalary(int department) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
            }
        }
        System.out.println(sum);
    }

    public final void averageDepartmentSalary(int department) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
                count++;
            }
        }
        System.out.println(sum / count);
    }

    public final void indexDepartmentSalary(int department, int percent) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                employees[i].setSalary((int) (employees[i].getSalary() + employees[i].getSalary() * ((double) percent / 100)));
            }
        }
    }

    public final void printDepartmentEmployees(int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println("Сотрудник " + (i + 1) + ": " + employees[i].getFio() + ", " + employees[i].getSalary());
            }
        }
    }

    public final void salaryLessThanMin(int salaryLess) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < salaryLess) {
                System.out.println("Сотрудник " + (i + 1) + ": " + employees[i].getFio() + ", " + employees[i].getSalary());

            }
        }
    }

    public final void salaryLessThanMax(int salaryLess) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= salaryLess) {
                System.out.println("Сотрудник " + (i + 1) + ": " + employees[i].getFio() + ", " + employees[i].getSalary());

            }
        }
    }

    public final void id(int id) {
        id = id - 1;
        System.out.println(employees[id]);
    }

    public final boolean addEmployee() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return false;
            } else {
                System.out.println("Свободных мест нет");
            }
        }
        return true;
    }

    public final boolean deleteEmployee(int id) {
        for (Employee employee: employees) {
            if (employee.getId() == id && employee != null) {
                employee = null;
                return true;
            }
        }
        return false;
    }
    public final void printEmployeeId ( int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                System.out.println(employees[i]);
            }
        }
    }
//    public final void addEmployee(String fio, int department, int salary){
//        for (int i = 0; i < employees.length; i++){
//            if (searchEmployee()){
//                employees[i] = new Employee(fio, department, salary);
//                break;
//            }
//            System.out.println("Свободных мест нет");
////        }
//    }
}