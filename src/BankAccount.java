public class BankAccount {

    private double balance;

    public void withDraw(double sum) throws NotEnoughMoneyException {
        if (balance < sum) {
            throw new NotEnoughMoneyException("Недостаточно средств. Ваш баланс: ", this.getBalance());
        }
        this.balance = this.balance - sum;
    }
    public void deposit(double sum){
        this.balance = this.balance + sum;
    }

    public double getBalance() {
        return balance;
    }
}