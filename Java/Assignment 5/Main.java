import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TextPost textPost = new TextPost();
        ImagePost imagePost = new ImagePost();

        int choice;

        do {
            System.out.println("\n===== SOCIAL MEDIA MENU =====");
            System.out.println("1. Post Text Message");
            System.out.println("2. Post Image");
            System.out.println("3. Comment on Text Post");
            System.out.println("4. Comment on Image Post");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    textPost.post();
                    break;

                case 2:
                    imagePost.post();
                    break;

                case 3:
                    textPost.comment();
                    break;

                case 4:
                    imagePost.comment();
                    break;

                case 5:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}