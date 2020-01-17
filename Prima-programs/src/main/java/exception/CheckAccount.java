package exception;

public class CheckAccount {
    private double balance;
    private int number;

    public CheckAccount(int number) {
        this.setNumber(number);
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount <= getBalance()) {
            setBalance(getBalance() - amount);
        }else {
            double needs = amount - getBalance();
            throw new InsufficientBalanceException(needs);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
