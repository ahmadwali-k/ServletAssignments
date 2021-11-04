package revature.Day2;


interface IBankAccount{
    boolean deposit(int amount);
    boolean withdraw(int amount);
    void getBalance();
}

/**
 * good
 * another example of interface
 * with how to call an interface in main method
 */

class SavingAccount implements IBankAccount{

    private int _balance;
    private int _perDayLimit;

    @Override
    public boolean deposit(int amount) {
        _balance += amount;
        System.out.println("Successfully deposit: "+ amount);
        return true;
    }

    @Override
    public boolean withdraw(int amount) {
        if(_balance < amount){
            System.out.println("Insufficient balance");
            return false;
        }
        // limit 5000
        else if(_perDayLimit + amount > 5000){
            System.out.println("Withdraw attempt failed");
            return false;
        }
        else{
            _balance -= amount;
            _perDayLimit += amount;
            System.out.println("Successfully withdraw: "+ amount);
            return true;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Saving account balance: "+ _balance);
    }
}

class CurrentAccount implements IBankAccount{
    private int _balance;
    @Override
    public boolean deposit(int amount) {
        _balance += amount;
        System.out.println("Successfully deposit: "+ amount);
        return true;
    }

    @Override
    public boolean withdraw(int amount) {
        if(_balance < amount){
            System.out.println("Insufficient balance");
            return false;
        }

        else{
            _balance -= amount;
            System.out.println("Successfully withdraw: "+ amount);
            return true;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Saving account balance: "+ _balance);
    }
}

public class Demo27 {
    public static void main(String[] args) {
        // we cannot create an instance of interface, we can hold the reference of a class that has implemented interface
        // in interface instance.

        IBankAccount savingAccount = new SavingAccount();
        IBankAccount currentAccount  =new CurrentAccount();

        savingAccount.deposit(2000);
        savingAccount.withdraw(1000);
        savingAccount.withdraw(6000);
        savingAccount.getBalance();

        System.out.println();

        currentAccount.deposit(5000);
        currentAccount.withdraw(6000);
        currentAccount.withdraw(2000);
        currentAccount.getBalance();
    }
}
