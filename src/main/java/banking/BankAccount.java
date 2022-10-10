package banking;

public class BankAccount {
    public double currentBalance;

    public BankAccount(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    /**
     * @preconditions deposit > 0
     * @postcondition currentBalance += deposit
     */
    public void deposit(double deposit) {
        this.currentBalance += deposit;
    }

    /**
     * @preconditions withdrawal > 0 
     * @postcondition withdrawal
     */
    public double withdrawal(double withdrawal) {
        if (currentBalance - withdrawal < 0) {
            return 0;
        }
        currentBalance -= withdrawal;
        return withdrawal;
    }
}