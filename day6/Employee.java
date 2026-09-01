package day6;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Employee details -> " + this.getId() + " " + this.getName();
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode");
//        return this.getId();
//        return 1;
        return this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Equals");
        if(this == obj)
            return true;

        if(obj instanceof Employee){
            Employee employee = (Employee) obj;
            if(this.getId() == employee.getId()
                    && this.getName().equals(employee.getName()))
                return true;
        }
        return false;
    }
}
