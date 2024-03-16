public class NotEnoughMoneyException extends Exception{
    private double remainingAmount;

    public NotEnoughMoneyException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public double getCurrentBalance(double balance) {
        return this.remainingAmount;
    }
}
