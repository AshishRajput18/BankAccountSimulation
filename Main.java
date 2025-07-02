import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        Account acc = new Account(name);
        int choice;

        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmt = sc.nextDouble();
                    acc.deposit(depositAmt);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmt = sc.nextDouble();
                    acc.withdraw(withdrawAmt);
                    break;

                case 3:
                    acc.checkBalance();
                    break;

                case 4:
                    acc.printTransactionHistory();
                    break;

                case 5:
                    System.out.println("🚪 Exiting... Thank you!");
                    break;

                default:
                    System.out.println("❌ Invalid choice.");
            }

        } while (choice != 5);
        sc.close();
    }
}
