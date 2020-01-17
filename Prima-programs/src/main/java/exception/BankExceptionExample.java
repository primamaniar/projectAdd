package exception;

public class BankExceptionExample {
    public static void main(String [] args) {
        CheckAccount c = new CheckAccount(301);
        System.out.println("Depositing $800...");
        c.deposit(800.00);

        try {
            System.out.println("\nWithdrawing $500...");
            c.withdraw(500.00);
            System.out.println("\nWithdrawing $600...");
            c.withdraw(600.00);
        } catch ( InsufficientBalanceException e) {
            System.out.println("Sorry, but you are short $" + e.getAmount());
            e.printStackTrace();
        }
    }
}
