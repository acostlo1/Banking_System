import java.util.Scanner;
public class Main {

    static Scanner scanner = new Scanner(System.in); //notice how I placed the scanner within our main method, that way it's accesible throuhgout our code

    public static void main(String[] args) {

        //Java Banking Program for Beginners - make it a habit to list out your steps before executing code

        //DECLARE OUR VARIABLES
        double balance = 0;
        boolean isRunning = true; //continue this program while isRunning remains true
        int choice;

        //DISPLAY MENU
        while (isRunning) {
            System.out.println("*****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*****************");


            //GET AND PROCESS USER CHOICE
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        //exit
        System.out.println("****************************");
        System.out.println("Thank you! Have a great day!");
        System.out.println("****************************");
        scanner.close();
    }
    //created a method to showBalance()
    static void showBalance(double balance) {
        System.out.println("*****************");
        System.out.printf("$%.2f\n", balance);
    }
    //created a method to deposit()
    static double deposit() {

        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }

    }
    //created a method to withdraw()
    static double withdraw(double balance) {

        double amount;

        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be nagative");
            return 0;
        } else {
            return amount;
        }

    }
}