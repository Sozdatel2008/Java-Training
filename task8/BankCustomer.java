package task8;

public class BankCustomer {
    private Person person;
    private Account account;
    
    public BankCustomer(Person person) {
        this.person = person;
        this.account = new Account();
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Customer: " + person.getName() + " account balance " + account.getBalance();
    }
}
