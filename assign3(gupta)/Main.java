import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account[] accounts = new Account[100];
        int count = 0;

        while (true) {

            System.out.println("\n===== PCCOE COOPERATIVE BANK =====");
            System.out.println("1. Add Account");
            System.out.println("2. Remove Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Display Accounts");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < 100) {
                        accounts[count] = new Account();

                        accounts[count].getData();

                        count++;

                        System.out.println("Account added successfully.");
                    } else {
                        System.out.println("Account limit reached.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Account Number to remove: ");
                    int removeNo = sc.nextInt();

                    boolean removed = false;

                    for (int i = 0; i < count; i++) {

                        if (accounts[i].accountNumber == removeNo) {

                            for (int j = i; j < count - 1; j++) {
                                accounts[j] = accounts[j + 1];
                            }

                            accounts[count - 1] = null;
                            count--;

                            removed = true;

                            System.out.println("Account removed successfully.");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Account not found.");
                    }

                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int depositNo = sc.nextInt();

                    boolean foundDeposit = false;

                    for (int i = 0; i < count; i++) {

                        if (accounts[i].accountNumber == depositNo) {

                            System.out.print("Enter amount to deposit: ");
                            double amount = sc.nextDouble();

                            accounts[i].deposit(amount);

                            foundDeposit = true;
                            break;
                        }
                    }

                    if (!foundDeposit) {
                        System.out.println("Account not found.");
                    }

                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int withdrawNo = sc.nextInt();

                    boolean foundWithdraw = false;

                    for (int i = 0; i < count; i++) {

                        if (accounts[i].accountNumber == withdrawNo) {

                            System.out.print("Enter amount to withdraw: ");
                            double amount = sc.nextDouble();

                            accounts[i].withdraw(amount);

                            foundWithdraw = true;
                            break;
                        }
                    }

                    if (!foundWithdraw) {
                        System.out.println("Account not found.");
                    }

                    break;

                case 5:
                    if (count == 0) {
                        System.out.println("No accounts available.");
                    } else {

                        for (int i = 0; i < count; i++) {

                            System.out.println("\n--- Account " + (i + 1) + " ---");

                            accounts[i].displayData();
                        }
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using PCCOE Cooperative Bank.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}