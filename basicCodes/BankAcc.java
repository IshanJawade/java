import java.util.Scanner;

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
        System.out.println("The Amount of Rs."+ amount + " is successfuly credited to the account.");
        return AccBalance = AccBalance + amount;
        
    }

    public double debit(double amount){
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
        Scanner sc = new Scanner(System.in);

        int num = 1;

        while (num != 0) {
            System.out.print("1. Credit \n2. Debit \n3. View Accout Details \n0. Logout\n>>");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.print("Enter amount to be credited: ");
                    int credAmount = sc.nextInt();
                    acc1.credit(credAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to be debited: ");
                    int debitAmount = sc.nextInt();
                    acc1.debit(debitAmount);
                    break;
                case 3:
                    acc1.AccDetails();
                default:
                    break;
            }
        }
        sc.close();
    }
}
