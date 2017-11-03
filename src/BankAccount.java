import java.util.Scanner;

/**
 * Created by derianescobar on 11/3/17.
 */
public class BankAccount {

    int balance;
    int bankAccountNum;
    String name;

    public BankAccount(int balance, int bankAccountNum, String name){

        this.balance = balance;
        this.bankAccountNum = bankAccountNum;
        this.name = name;
    }

    public String deposit(int n){

        balance += n;

        return "Your new balance is, " + balance;
    }

    public String withdraw(int n){

        if(n > balance){

            return "ERROR: Cannot do process, insufficent funds";
        }
        balance -= n;

        return "Your current balance is, " + balance;
    }

    public String getBalance(){

        return "Your Current Balance is " + balance;
    }

    public int getBankAccountNum(){

        return bankAccountNum;
    }

    public String quit() {

        Scanner scans = new Scanner(System.in);

        System.out.println("Would you like to quit?");

        if (scans.next().equalsIgnoreCase("Yes")) {

            System.exit(0);

        }

        return "What would you like to do next? ";

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the amount the bank account will start with");
        int amount = scan.nextInt();
        System.out.println("Enter the amount the bank account number");
        int bankNumber = scan.nextInt();
        System.out.println("Enter the name of the owner");
        String accountName = scan.next();

        BankAccount ba = new BankAccount(amount, bankNumber, accountName);

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
