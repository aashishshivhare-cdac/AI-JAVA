package day6;

public class TestSetEmployee {
    public static void main(String[] args) {
        SetEmpOperation empOperation = new SetEmpOperation();
        empOperation.addEmployee(new Employee(1, "Aashish"));
        empOperation.addEmployee(new Employee(2, "Aakash"));
        empOperation.addEmployee(new Employee(1, "Viraat"));

        empOperation.printAll();

//        empOperation.removeEmployee(1);
//        empOperation.printAll();


    }
}
