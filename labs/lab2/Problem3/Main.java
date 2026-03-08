package labs.lab2.Problem3;

public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank();

    
        SavingAccount savings = new SavingAccount(52, 5.0);
        
      
        CheckingAccount checking = new CheckingAccount(67);

        
        myBank.openAccount(savings);
        myBank.openAccount(checking);

        
        System.out.println("--- Выполнение операций ---");
        
      
        savings.deposit(1000.0);
        
    
        checking.deposit(500.0);   
        checking.withdraw(100.0); 
        checking.deposit(50.0);    
        checking.withdraw(20.0);   
        checking.deposit(10.0);    

     
        System.out.println("\nСостояние счетов ДО обновления:");
        myBank.displayAccounts();

        
        myBank.update();

   
        System.out.println("\nСостояние счетов ПОСЛЕ обновления (update):");
        myBank.displayAccounts();
        
       
    }
    

}

