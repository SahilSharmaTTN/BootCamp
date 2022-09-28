import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class SBI extends Bank{
    public SBI(String bankName, String ifsc, double roi) {
        super(bankName, ifsc, roi);
        this.accountsList = new ArrayList<>();

    }
    //    void deposit(int amount, String accNum) {
//        for (Account account : sbiAccountsList) {
//            if (accNum.equals(account.getAccountNumber())) {
//
//
//                try {
//                    FileWriter myWriter = new FileWriter("sbilogs.txt");
//                    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
//                    myWriter.write("Acc : "+accNum + "timestamp:" + timeStamp+ "Old balance:"+account.balance
//                        +"New Balance" + (account.balance - amount));
//                    myWriter.close();
//                    System.out.println("Successfully wrote to the file.");
//                    account.balance = account.balance + amount;
//                } catch (IOException e) {
//                    System.out.println("An error occurred.");
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//    void withdraw(int amount, String accNum) throws InsufficientAmountException {
//        for (Account account : sbiAccountsList) {
//            if (accNum.equals(account.getAccountNumber())) {
//                if (amount > account.balance) {
//                    throw new InsufficientAmountException("Insufficient Balance");
//                } else {
//                    account.balance = account.balance - amount;
//                }
//
//            }
//        }
//    }

}
