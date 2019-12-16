package agencyProperties;

public class Account {
    private double balance;
    private int agency;
    private int number;
    private Client holder;
    private static int total =0;

    public Account(int agency, int number) {
        Account.total++;
        System.out.println("The total accounts " + Account.total);

        this.agency = agency;
        this.number = number;
        this.balance = 100;
        System.out.println("Creating a new Account: " + this.number);
    }

    public void deposits(double value) {
        this.balance += value;
    }

    public boolean withdraw(double value) {
        if(this.balance >= value) {
            this.balance -= value;
            return true;
        } else {
        }	return false;
    }

    public boolean transfer(double value, Account destination) {
        if(this.balance >= value) {
            this.balance -= value;
            destination.deposits(value);
            return true;
        }	return false;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        if(number <= 0) {
            System.out.println("The number can´t be a negative number or zero");
        }
        this.number = number;
    }

    public int getAgency() {
        return this.agency;
    }

    public void setAgency(int agency) {
        if(agency <= 0) {
            System.out.println("The Agency can´t be a negative number or zero");
        }
        this.agency = agency;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public Client getHolder() {
        return holder;
    }

    public static int getTotal() {
        return Account.total;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
