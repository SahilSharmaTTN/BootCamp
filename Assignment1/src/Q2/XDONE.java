package Q2;

import java.util.Scanner;

public class XDONE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inp = "";

        do {
            inp = scanner.nextLine();
            System.out.println(inp);

        } while (!inp.equals("XDONE"));

        scanner.close();

    }
}

