package Lesson_07.Abstract1_Interfase.Accaunt;

public class Main {
    static void main() {
Banc banc =new Banc();
SavingAccaunt savingAccaunt = new SavingAccaunt(2000, 1.25);
        System.out.printf(" Сбер счет %n  Сумма %.2f%n  проц ставка %.2f%n" , savingAccaunt.getBalance(), savingAccaunt.getInerestRate());

CurentAccaunt curentAccaunt = new CurentAccaunt(5000,1000);
       System.out.printf(" Текущий счет %n  Депозит %.2f%n  Овердрафт %.2f%n" , curentAccaunt.getBalance(), curentAccaunt.getOverDraftLimit());

banc.addAccount(savingAccaunt);
banc.addAccount(curentAccaunt);

        System.out.println(" Вносим на сбер счет");
banc.deposit(savingAccaunt,1000);
        System.out.println(" Вносим на тек счет");
        banc.deposit(savingAccaunt,500);

        System.out.println(" Сним  сбер счет");
        banc.withDraw(savingAccaunt,300);



        System.out.println(" Вместе тек счет сбер счет");
banc.printAccountBalance();

        System.out.println(" %%  сбер счет");
        savingAccaunt.applyInterest();
        banc.printAccountBalance();





}
}
