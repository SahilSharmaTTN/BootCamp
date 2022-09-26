package Q1;

public class Student {
    static String FirstName = "Sahil";
    static String LastName = "Sharma";
    static int age = 23;


    public static void main(String[] args) {

        System.out.println("Inside Main");
        System.out.println();
        Student.printDetails();
    }


    static{
        System.out.println("Printing using static block");

        System.out.println("First Name:"+FirstName);
        System.out.println("Last Name:" +LastName);
        System.out.println("Age:"+ age);

        System.out.println("----------xxxxx-------------");
    }

    static void printDetails(){

        System.out.println("Printing using static method");

        System.out.println("First Name:"+FirstName);
        System.out.println("Last Name:" +LastName);
        System.out.println("Age:"+ age);
    }
}
