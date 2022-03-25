class Account {
    private String AccName;
    private int AccNumber;
    private double AccBalance;

    Account(String name, int accNumber, double balance){
        this.AccName = name;
        this.AccNumber = accNumber;
        this.AccBalance = balance;
    }

    public double credit(double amount){
        if (amount < 0){
            System.out.println("Operation unsuccessful!");
            return 0;
        }
        else{
            System.out.println("The Amount of Rs."+ amount + " is successfuly credited to the account.");
            return AccBalance = AccBalance + amount;
        }
        
    }

    public double deposite(double amount){
        if (amount > this.AccBalance){
            System.out.println("Operation unsuccessful!");
            return 0;
        }
        else{
            System.out.println("The Amount of Rs."+ amount + " is successfuly debited from the account.");
            return AccBalance = AccBalance - amount;
        }
        
    }

    public void AccDetails(){
        System.out.println("Result of your query:");
        System.out.println("Account Name: "+this.AccName);
        System.out.println("Account Number: "+this.AccNumber);
        System.out.println("Account Balance: "+this.AccBalance);
    }
}

public class BankAcc {
    
     public static void main(String[] args) {
        Account acc1 = new Account("Ishan Jawade", 24657394, 1000);

        acc1.credit(3000);
        acc1.deposite(5000);
        acc1.AccDetails();
     }
}
