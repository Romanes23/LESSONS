package Lesson_07.Abstract1_Interfase.Accaunt;

public class CurentAccaunt implements Accaunt{
    private double balance;
    private double overDraftLimit;

    public CurentAccaunt(double balance, double overDraftLimit) {
        this.balance = balance;
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void deposite(double amount) {
balance+= amount;
    }

    @Override
    public void withdraw(double amount) {
if(balance+overDraftLimit>=amount)
    balance-=amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }
}
