package Q3;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("1 for Area");
            System.out.println("2 for Circumference");
            System.out.println("3 for EXIT");

            choice = scanner.nextInt();

            switch(choice){
                case 1: area(scanner);
                        break;
                case 2: circumference(scanner);
                        break;
                case 3: return;
            }


        }while(true);


    }

    static void area(Scanner scanner){
        System.out.println("Enter the radius");
        double radius = scanner.nextInt();
        double area =  (22 * radius * radius) / 7;
        System.out.println("AREA:" + area);
    }
    static void circumference(Scanner scanner){
        System.out.println("Enter the radius");
        double radius = scanner.nextInt();
        double Circumference =  (2 * 22 * radius) / 7;
        System.out.println("CIRCUMFERENCE " + Circumference);
    }
}
