import java.util.Scanner;

public class Villegas_ATM {
    static int balance = 0;
    static Scanner atm = new Scanner(System.in);
    public static void main(String[] args) {
        
        while (true) {
            
        System.out.println("---------------------ATM----------------");
        System.out.println("1. Withdraw\n2. Deposit\n3. Transfer\n4. Check Balance\n5. EXIT ");
        
        System.out.print("Choose Operation: ");
        int operation = atm.nextInt();
            
        if (operation == 1) {
            withdraw();
        }
        else if (operation == 2){
            deposit();
        }
        else if (operation == 3){
            transfer();
        }
        else if (operation == 4){
            balanceCheck();
        } 
        else if (operation == 5){
            System.out.println("Thank you for using our services!");
            break;
        } 
        else {
            System.out.println("Invalid Choice");
        }
    }
    }
    public static void withdraw(){
        System.out.print("Enter amount to be withdrawn: ");
        int withdraw = atm.nextInt();
        if (withdraw <= balance){
            System.out.println("Collect your money");
            balance = balance - withdraw; 

            System.out.print("Check Balance? (Y/N): ");
            char checkbal = atm.next().charAt(0);
            if (checkbal == 'Y'){
                System.out.println("Balance: " + balance);
            } else if (checkbal == 'N'){
            }
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public static void deposit(){
        System.out.print("Enter amount you want to deposit: ");
        int deposit = atm.nextInt();
        balance = balance + deposit;

        System.out.print("Check Balance? (Y/N): ");
        char checkbal = atm.next().charAt(0);
        if (checkbal == 'Y'){
            System.out.println("Balance: " + balance);
        } else if (checkbal == 'N'){
           
        }
       

    }
    public static void transfer(){
        System.out.print("Enter account number: ");
        int accNum = atm.nextInt();
        System.out.print("Enter transfer amount: ");
        int moneySent = atm.nextInt();
        balance = balance - moneySent;

        System.out.print("Check Balance? (Y/N): ");
        char checkbal = atm.next().charAt(0);
        if (checkbal == 'Y'){
            System.out.println("Balance: " + balance);
        } else if (checkbal == 'N'){
        }
      

    }
    public static void balanceCheck(){
        System.out.println("Balance: " + balance);
        
    }
}

