public class EmployeeTest {
    public static void main(String[] args) {
        Date dob = new Date(7, 24, 1984);
        Date hireDate = new Date(3, 12, 2018);
        Employee employee = new Employee("Ali", "Roohan", dob, hireDate);
        System.out.println(employee);

    }
}