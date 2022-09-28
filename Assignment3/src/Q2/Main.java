package Q2;

import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(new Employee("Z",22.0,70000.0));
        empList.add(new Employee("A B",20.0,50000.0));
        empList.add(new Employee("A A",20.0,54000.0));
        empList.add(new Employee("B",21.0,40000.0));
        empList.add(new Employee("K",21.,100000.0));

        printList(empList);

        Collections.sort(empList);

        printList(empList);

       // SalaryComparator salaryComparator =new SalaryComparator();

        Collections.sort(empList,new SalaryComparator());

        printList(empList);


    }

    static  void printList(ArrayList<Employee> employees){
        System.out.println("----------Employee Details---------");
        for(Employee employee : employees){
            System.out.print(employee.getName()+ " ");
            System.out.print(employee.getAge()+ " ");
            System.out.print(employee.getSalary()+ " ");
            System.out.println();
        }
    }

}

class SalaryComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee employee, Employee t1) {
        return (int)(employee.getSalary() - t1.getSalary());
    }
}
