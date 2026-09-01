package day6;

import java.util.HashMap;
import java.util.Map;

public class EmpOperation {

    private Map<Integer, Employee> employeeMap = new HashMap<>();

    //opearation - Add/remove/print

    public void addEmployee(Employee e){
        employeeMap.put(e.getId(), e);
        System.out.println("Employee Added");
    }

    public void removeEmployee(int empId){
        Employee e = employeeMap.remove(empId);
        if(e != null) {
            System.out.println("Employee removed");
        }else{
            System.out.println("Employee not found");
        }
    }

    public void printAll(){
        System.out.println(employeeMap);
    }
}
