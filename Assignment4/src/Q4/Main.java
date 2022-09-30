package Q4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.stream()
                .map(e -> e * 2)
                .forEach(System.out::println);

        Employee e1 = new Employee("A B C",100000L,"Noida");
        Employee e2 = new Employee("A E F",200000L,"Delhi");
        Employee e3 = new Employee("K I J",300000L,"Gurgaon");
        Employee e4 = new Employee("K L M",200000L,"Delhi");
        Employee e5 = new Employee("A E F",200000L,"Delhi");
        Employee e6 = new Employee("K I J",300000L,"Gurgaon");
        Employee e7 = new Employee("F L M",200000L,"Delhi");

        List<Employee> employeeList =  new ArrayList<>();

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        employeeList.add(e7);



        employeeList
                .stream()
                .filter(employee -> employee.getSalary() > 100000L && employee.getCity().equals("Delhi"))
                .map(Employee::getFirstName)
                .distinct()
                .forEach(System.out::println);



    }


}
