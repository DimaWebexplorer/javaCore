package lr2;

public class OwnTask7 {
    public interface BankAccount {
        void deposit(double amount);
        void withdraw(double amount);
        double getBalance();
    }

    public static class SavingsAccount implements BankAccount {
        private double balance;

        public SavingsAccount() {
            this.balance = 0.0;
        }

        @Override
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            } else {
                throw new IllegalArgumentException("Deposit amount must be positive.");
            }
        }

        @Override
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            } else {
                throw new IllegalArgumentException("Invalid withdrawal amount.");
            }
        }

        @Override
        public double getBalance() {
            return balance;
        }
    }
    public static class CheckingAccount implements BankAccount {
        private double balance;

        public CheckingAccount() {
            this.balance = 0.0;
        }

        @Override
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            } else {
                throw new IllegalArgumentException("Deposit amount must be positive.");
            }
        }

        @Override
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            } else {
                throw new IllegalArgumentException("Invalid withdrawal amount.");
            }
        }

        @Override
        public double getBalance() {
            return balance;
        }
    }
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(1000);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        savingsAccount.withdraw(500);
        System.out.println("Savings Account Balance after withdrawal: " + savingsAccount.getBalance());

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.deposit(2000);
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
        checkingAccount.withdraw(1500);
        System.out.println("Checking Account Balance after withdrawal: " + checkingAccount.getBalance());
    }
}
