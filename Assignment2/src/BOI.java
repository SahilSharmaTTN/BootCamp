import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class BOI extends Bank{
    private double roi = 8.7;
    public BOI(String bankName, String ifsc) {
        super(bankName, ifsc);
        this.accountsList = new ArrayList<>();
    }

    @Override
    void printDetails() {
        System.out.println("WELCOME TO BOI");
        System.out.println("Name :" + this.bankName);
        System.out.println("ifsc :" + this.ifsc);
        System.out.println("roi :" + this.roi);
        System.out.println("---------------------------");
    }

    @Override
    void transactionLog(String accNum, String type, double oldBalance,double newBalance , double amount, boolean status) {
        try {
            FileWriter fileWriter = new FileWriter("/home/sahils/IdeaProjects/BootCamp/Assignment2/boi.txt",true);
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
            fileWriter.write("Acc : "+accNum + " timestamp:" + timeStamp+ " Old balance:Rs"+ oldBalance
                    +" New Balance:Rs" + newBalance+ " Type: " + type + " Status:" + status+"\n");

            fileWriter.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
