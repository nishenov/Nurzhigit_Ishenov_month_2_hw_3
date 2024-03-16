public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(15000);
        double withDrawAmount = 6000;
        while (true){
            try {
                bankAccount.withDraw(6000);
                System.out.println("Current balance: " + bankAccount.getBalance());
            }
            catch (NotEnoughMoneyException nie){
                System.out.println(nie.getMessage() + bankAccount.getBalance());
                if(bankAccount.getBalance() < withDrawAmount){
                    try {
                        bankAccount.withDraw(bankAccount.getBalance());
                    }
                    catch (NotEnoughMoneyException me){
                    }
                    break;
                }
            }

        }
    }
}