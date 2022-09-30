package Q4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Employee,Double> empSals =  new HashMap<>();

        Employee e1 =  new Employee("A" , 22,"JVM");
        Employee e2 =  new Employee("B" , 20,"QE");
        Employee e3 =  new Employee("C" , 21,"AMC");
        Employee e4 =  new Employee("D" , 23,"DEVOPS");

        empSals.put(e1,200000.0);
        empSals.put(e2,70000.0);
        empSals.put(e3,60000.0);
        empSals.put(e4,100000.0);


    }
}
