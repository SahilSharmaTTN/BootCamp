package Q4;

public class Employee {

    private String name;
    private int age;
    private String designation;

    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return name + " " +age + " " + designation;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (!(o instanceof Employee)) {
            return false;
        }

        Employee e1 = (Employee) o;
        if(this.name.equals(e1.getName())){
            if(this.designation.equals(e1.getDesignation())){
                if(this.age == e1.getAge()){
                    return true;
                }
            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
