package Q2;

import java.util.Scanner;

public class XDONE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String result = "";

        String inp = "";

        do {
            inp = scanner.nextLine();

            if(inp.equals("XDONE")){
                break;
            }

            result += " " + inp;


        } while (true);

        System.out.println(result);

        scanner.close();

    }
}

