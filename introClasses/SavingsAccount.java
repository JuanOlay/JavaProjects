public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  
  public void checkBalance(){
    System.out.println("Hola!");
    System.out.println("tu balance es"+balance);
  }
  
  public void depositar(int cdepositar){
    balance = cdepositar + balance;
    System.out.println("Acabas de depositar " + cdepositar);
  }
  
  public int retirar(int cretirar){
    balance = balance - cretirar;
    System.out.println("Acabas de retirar" + cretirar);
    return cretirar;
  }
  
  public String toString(){
    return "This is a savings account with " + balance + " saved.";
  }
  
  public static void main(String[] args){
    SavingsAccount cuenta = new SavingsAccount(2000);
    
    cuenta.checkBalance();

    cuenta.retirar(300);
    
    cuenta.checkBalance();

    cuenta.depositar(600);
    
    cuenta.checkBalance();
    
    cuenta.depositar(600);
    
    cuenta.checkBalance();
    
    System.out.println(cuenta);
  }       
}