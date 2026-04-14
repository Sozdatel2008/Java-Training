package task8;

public class Account {
    private double balance = 0;
    private static double interestRate;

    public Account() {
        this.balance = 0.0;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (amount <= 0) {
            System.out.println("Declined. Enter number greater than 0");
            return;
        }
        balance = balance + amount;
    }

    public void transfer(Account account, double amount){
        if(account == null){
            System.out.println("Account does not exist");
            return;
        }

        if(amount <= 0 || amount > balance){
            System.out.println("You don't have enough money. Withdraw declined");
            return;
        }
        this.withdraw(amount); 
        account.deposit(amount);
    }

    public void withdraw(double amount){
        if(amount <= 0 || amount > balance){
            System.out.println("You don't have enough money. Withdraw declined");
            return;
        }
        balance = balance - amount;
    }

    public static void setInterestRate(double rate) {
        if(rate < 0){
            System.out.println("Wrong interest rate.");
            return;
        }
        interestRate = rate;
    }

    public void addInterest(){
        balance += balance * (interestRate / 100);
    }
}
