import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Bank {
    protected String bankName;
    protected String ifsc;
    protected double roi;

    protected ArrayList<Account> accountsList ;

    public Bank() {
    }

    public Bank(String bankName, String ifsc, double roi) {
        this.bankName = bankName;
        this.ifsc = ifsc;
        this.roi = roi;
    }

    void printDetails() {
        System.out.println("Name :" + this.bankName);
        System.out.println("ifsc :" + this.ifsc);
        System.out.println("roi :" + this.roi);
    }

    void transactionLog(String accNum,String type ,double balance,double amount,boolean status){
        try {
            FileWriter myWriter = new FileWriter("/home/sahils/abc.txt");
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
            myWriter.write("Acc : "+accNum + " timestamp:" + timeStamp+ " Old balance:"+balance
                    +" New Balance" + (balance - amount) + " Type: " + type + " Status:" + status);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    void deposit(int amount, String accNum) {
        for (Account account : accountsList) {
            if (accNum.equals(account.getAccountNumber())) {
                account.balance = account.balance + amount;
                transactionLog(accNum,"Deposit", account.balance,amount,true);
                return;
            }
        }
    }

    void withdraw(int amount, String accNum) throws InsufficientAmountException {
        for (Account account : accountsList) {
            if (accNum.equals(account.getAccountNumber())) {

                if (amount > account.balance) {
                    transactionLog(accNum, "Withdrawal",account.balance,amount,false);
                    throw new InsufficientAmountException("Insufficient Balance");

                } else {
                    account.balance = account.balance - amount;
                    transactionLog(accNum, "Withdrawal",account.balance,amount,true);
                }
            }
        }
    }

}
