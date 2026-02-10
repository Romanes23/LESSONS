package Lesson_07.Abstract1_Interfase.Accaunt;

public class SavingAccaunt implements Accaunt{
    private double balance;
    private double inerestRate;

    public SavingAccaunt(double balsnce, double inerestRate) {
        this.balance = balsnce;
        this.inerestRate = inerestRate;
    }

    @Override
    public void deposite(double amount) {
balance+=amount;
    }

    @Override
    public void withdraw(double amount) {
balance-= amount;
    }

    @Override
    public double getBalance() {
        return  balance;
    }

    public double getInerestRate() {
        return inerestRate;
    }

    public void applyInterest(){
        balance+= balance*inerestRate/100;
    }



}
