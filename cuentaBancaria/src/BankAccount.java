public class BankAccount {

    //Creamos el saldo, inicialmente vale 0

    private double balance;

    //Getter y setter del saldo

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Constructor

    public BankAccount(double balance){
        this.balance = balance;
    }

    //Funciones de añadir y quitar saldo

    public double addBalance(double amount){
        this.balance = balance + amount;
        return balance;
    }

    public double subBalance(double amount){
        this.balance = balance - amount;
        return balance;
    }
}
