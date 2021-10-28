package revature;

abstract class Bank {


    public abstract void getBalance(double balance, double amount);

}
class BankA extends Bank {

    @Override
    public void getBalance(double balance, double amount) {
        balance = balance + amount;
        System.out.println("new balance for BankA: " + balance);
    }
}
class BankB extends Bank {

    @Override
    public void getBalance(double balance, double amount) {
        balance = balance + amount;
        System.out.println("new balance for BankB: " + balance);
    }
}
class BankC extends Bank {

    @Override
    public void getBalance(double balance, double amount) {
        balance = balance + amount;
        System.out.println("new balance for BankC: " + balance);
    }
}
class Main4 {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        bankA.getBalance(0, 100);
        BankB bankB = new BankB();
        bankB.getBalance(0, 150);
        BankC bankC = new BankC();
        bankC.getBalance(0,200);
    }
}