package day6;

public class TestMapEmployee {
    public static void main(String[] args) {
        EmpOperation empOperation = new EmpOperation();
        empOperation.addEmployee(new Employee(1, "Aashish"));
        empOperation.addEmployee(new Employee(2, "Aakash"));
        empOperation.addEmployee(new Employee(3, "Viraat"));

        empOperation.printAll();

        empOperation.removeEmployee(1);
        empOperation.printAll();


    }
}
