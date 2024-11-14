import java.util.Arrays;

public class Main {

    private static final Employee[] employees = {
        new Employee("Иванов Иван Иванович", 1, 50000),
        new Employee("Иванов Макар Иванович", 2, 80000),
        new Employee("Иванов Дмитрий Иванович", 3, 60000),
        new Employee("Иванов Евгений Иванович", 4, 65000),
        new Employee("Иванов Николай Иванович", 5, 73000),
        new Employee("Иванов Максим Иванович", 1, 66000),
        new Employee("Иванов Григорий Иванович", 2, 58000),
        new Employee("Иванов Валерий Иванович", 3, 43000),
        new Employee("Иванов Юрий Иванович", 4, 59000),
        new Employee("Иванов Виталий Иванович", 5, 92000)
    };
    public static int getSalarySum(){
        int sum = 0;
        for ( int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }
    public static void printEmployees(){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static void minSalary(){
        int min = employees[0].getSalary();
        int id = 0;
        for (int i = 0; i <employees.length; i++){
            if (employees[i].getSalary() < min ){
                min = employees[i].getSalary();
                id = i;
            }
        }
        System.out.println("Min: " + employees[id]);
    }
    public static void maxSalary(){
        int max = employees[0].getSalary();
        int id = 0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getSalary() > max ){
                max = employees[i].getSalary();
                id = i;
            }
        }
        System.out.println("Max: " + employees[id]);
    }
    public static void averageSalary(){
        System.out.println(getSalarySum() / employees.length);
    }
    public static void printFio(){
        for (Employee employee : employees) {
            System.out.println(employee.getFio());
        }
    }
    public static void indexSalary(int percent){

        for ( int i = 0; i < employees.length; i++){
            employees[i].setSalary( (int) (employees[i].getSalary() + employees[i].getSalary() * ( (double) percent / 100)));
        }
    }
    public static void minDepartmentSalary(int department){
        int min = 1000000000;
        int id = 0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getDepartment() == department){
                if (employees[i].getSalary() < min) {
                    min = employees[i].getSalary();
                    id = i;
                }
            }
        }
        System.out.println(employees[id]);
    }
    public static void maxDepartmentSalary(int department){
        int max = -1;
        int id = 0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getDepartment() == department){
                if (employees[i].getSalary() > max) {
                    max = employees[i].getSalary();
                    id = i;
                }
            }
        }
        System.out.println(employees[id]);
    }
    public static int sumDepartmentSalary(int department){
        int sum = 0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getDepartment() == department){
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDepartmentSalary(5));




        // sumDepartmentSalary(5);
//        maxSalary();
//        minSalary();
//        printEmployees();
//        System.out.println(getSalarySum());
//
//        System.out.println(employees[4].getSalary());
//        Employee employee1 = employees[0];
//        Employee employee2 = employees[1];
//
//        System.out.println(employee1);
//        System.out.println(employee2);
//        employee2.setDepartment(3);
//        System.out.println(employee2);
//
//        System.out.println();
//        averageSalary();
//        printFio();
//
//        printEmployees();
//        indexSalary(10);
//        System.out.println();
//        printEmployees();

    }

}