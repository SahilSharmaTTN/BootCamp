package Q4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Employee,Double> empSals =  new HashMap<>();

        Employee e1 =  new Employee("A" , 22,"JVM");
        Employee e2 =  new Employee("A" , 22,"JVM");
        Employee e3 =  new Employee("C" , 21,"QE");
        Employee e4 =  new Employee("D" , 23,"DEVOPS");
        Employee e5 =  new Employee("X" , 22,"AMC");
        Employee e6 =  new Employee("Z" , 22,"JVM");

        empSals.put(e1,200000.0);
        empSals.put(e2,70000.0);
        empSals.put(e3,80000.0);
        empSals.put(e4,2100000.0);
        empSals.put(e5,50000.0);
        empSals.put(e6,90000.0);


        System.out.println(empSals);


//        System.out.println(e1.hashCode());
//        System.out.println(e2.hashCode());
//        System.out.println(e5.hashCode());



    }
}
