public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        SBI sbibank =  new SBI("SBI","SBIN0001",9.0);


        Account newAccount =  new Account("SBIA123" ,"A",1000);

        sbibank.accountsList.add(newAccount);

        sbibank.deposit(500,"SBIA123");



    }
}