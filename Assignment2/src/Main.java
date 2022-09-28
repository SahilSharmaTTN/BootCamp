public class Main {
    enum Type{
        SAVINGS,
        CURRENT;
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
        SBI sbibank =  new SBI("SBI","SBIN0001");

        Account sbi1 =  new Account("SBIA123" ,"A",1000,Type.SAVINGS);
        Account sbi2 =  new Account("SBIB123" ,"B",10000,Type.CURRENT);

        sbibank.accountsList.add(sbi1);
        sbibank.accountsList.add(sbi2);
        sbibank.printDetails();

        sbibank.deposit(500,"SBIA123");
        try {
            sbibank.withdraw(2000,"SBIB123");
        }catch (InsufficientAmountException e){
            e.printStackTrace();
        }


        BOI boiBank =  new BOI("BANK OF INDIA","BOIN001");

        boiBank.printDetails();

        Account boi1 =  new Account("BOIA123" ,"X",5000,Type.SAVINGS);
        Account boi2 =  new Account("BOIB123" ,"Y",50000,Type.CURRENT);

        boiBank.accountsList.add(boi1);
        boiBank.accountsList.add(boi2);


        boiBank.deposit(500,"BOIA123");
        try {
            boiBank.withdraw(40000,"BOIB123");
        }catch (InsufficientAmountException e){
            e.printStackTrace();
        }

        ICICI icici =  new ICICI("ICICI","ICICIN0001");
        icici.printDetails();




    }
}