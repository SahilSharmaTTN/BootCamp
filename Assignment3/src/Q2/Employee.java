package Q2;

public class Employee implements Comparable<Employee>{
    private String Name;
    private Double age;
    private Double salary;

    public Employee(String name, Double age, Double salary) {
        Name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.Name.compareTo(employee.getName());
    }
}
