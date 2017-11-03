import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Created by derianescobar on 11/3/17.
 *
 * This creates a bank account
 */
public class BankAccount {

    /**
     *
     * The bank account includes
     * balance, the account number, name and the time at which it was accessed.
     */
    int balance;
    int bankAccountNum;
    String name;
    LocalDateTime time;

    //Constructor to make the bank account
    public BankAccount(int balance, int bankAccountNum, String name, LocalDateTime time){

        this.balance = balance;
        this.bankAccountNum = bankAccountNum;
        this.name = name;
        this.time = time;
    }

    //This will put money into the bank account
    public String deposit(int n){

        balance += n;

        //Returns what the person would see in an ATM machine
        return "Your new balance is, " + balance;
    }

    public String withdraw(int n){

        //If the balance is less than n then return error message
        if(n > balance){

            return "ERROR: Cannot do process, insufficent funds";
        }
        //else we can do the correct process
        balance -= n;

        //returns a string with the new balance after operation
        return "Your current balance is, " + balance;
    }

    //Returns the balance of the bank account
    public String getBalance(){

        return "Your Current Balance is " + balance;
    }

    //returns the bank account number
    public int getBankAccountNum(){

        return bankAccountNum;
    }

    //This is to prompt the user everytime an operation is done
    public String quit() {

        //Scans what the user inputs
        Scanner scans = new Scanner(System.in);

        System.out.println("Would you like to quit?");

        //if yes then we quit
        if (scans.next().equalsIgnoreCase("Yes")) {

            System.exit(0);

        }

        //else we prompt the user what they would like to next
        return "What would you like to do next? ";

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        LocalDateTime time = LocalDateTime.now();

        System.out.println("Enter the amount the bank account will start with");
        int amount = scan.nextInt();
        System.out.println("Enter the amount the bank account number");
        int bankNumber = scan.nextInt();
        System.out.println("Enter the name of the owner");
        String accountName = scan.next();

        BankAccount ba = new BankAccount(amount, bankNumber, accountName,time);

        System.out.println(ba.quit());

                if(scan.next().equalsIgnoreCase("deposit")){

                    System.out.println("How much would you like to deposit");
                    amount = scan.nextInt();
                    System.out.println(ba.deposit(amount));
                    System.out.println(ba.quit());

                }

                if(scan.next().equalsIgnoreCase("balance")){

                    System.out.println(ba.getBalance());
                    System.out.println(ba.quit());
                }

                if(scan.next().equalsIgnoreCase("withdraw")){

                    System.out.println("How much would you like to withdraw?");
                    amount = scan.nextInt();
                    System.out.println(ba.withdraw(amount));
                    System.out.println(ba.quit());
                }

            }


        }
