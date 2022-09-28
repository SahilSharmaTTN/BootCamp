import java.util.ArrayList;

abstract public class Bank {
    protected String bankName;
    protected String ifsc;
    protected ArrayList<Account> accountsList ;

    public Bank() {
    }

    public Bank(String bankName, String ifsc) {
        this.bankName = bankName;
        this.ifsc = ifsc;
    }

    abstract void printDetails();


    abstract void transactionLog(String accNum,String type ,double oldBalance,double newBalance,double amount,boolean status);


    void deposit(int amount, String accNum) {
        for (Account account : accountsList) {
            if (accNum.equals(account.getAccountNumber())) {
                transactionLog(accNum,"Deposit", account.getBalance(),account.getBalance()+amount,amount,true);
                account.setBalance(account.getBalance() + amount);

                return;
            }
        }
    }

    void withdraw(int amount, String accNum) throws InsufficientAmountException {
        for (Account account : accountsList) {
            if (accNum.equals(account.getAccountNumber())) {

                if (amount > account.getBalance()) {
                    transactionLog(accNum, "Withdrawal",account.getBalance(),account.getBalance(),amount,false);
                    throw new InsufficientAmountException("Insufficient Balance");


                } else {

                    transactionLog(accNum, "Withdrawal",account.getBalance(),account.getBalance()-amount,amount,true);
                    account.setBalance(account.getBalance() - amount);
                }
            }
        }
    }

}
