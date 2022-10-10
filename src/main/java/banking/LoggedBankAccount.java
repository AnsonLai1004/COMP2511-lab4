package banking;

public class LoggedBankAccount extends BankAccount {

    public LoggedBankAccount(double currentBalance) {
        super(currentBalance);
    }

    /**
     * @preconditions deposit > 0
     * @postcondition currentBalance += deposit
     */
    @Override
    public void deposit(double deposit) {
        System.out.println("deposit: " + deposit);
        super.deposit(deposit);
    }

    /**
     * @preconditions withdrawal > 0 
     * @postcondition withdrawal
     */
    @Override
    public double withdrawal(double withdrawal) {
        double amount = withdrawal(withdrawal);
        if (amount == 0) {
           System.out.println("fail");  
           return amount;
        }
        System.out.println("withdraw: " + amount);
        return amount;
    }
    
    
}
