package day6;

import java.util.HashSet;
import java.util.Set;

public class SetEmpOperation {
    private Set<Employee> employeeSet = new HashSet<>();

    //opearation - Add/remove/print

    public void addEmployee(Employee e){
        employeeSet.add(e);
        System.out.println("Employee Added");
    }

    public void removeEmployee(int empId){
        boolean flag = false;
        for(Employee e : employeeSet){
            if(e.getId() == empId){
                employeeSet.remove(e);
                flag = true;
                System.out.println("Employee removed");
                break;
            }
        }
        if(!flag)
            System.out.println("Employee not found");
    }

    public void printAll(){
        System.out.println(employeeSet);
    }
}
