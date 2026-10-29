import java.util.Scanner;
public class Post{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        MediaPost media = new MediaPost();
        TextPost textpost = new TextPost();
        ImagePost imagepost = new ImagePost();
        int choice;
        do{
            System.out.println("Social Media Post Option ");
            System.out.println("1.Post Text Message ");
            System.out.println("2.Pst an Image..");
            System.out.println("3.Comment on  text post");
            System.out.println("4.Comment on the image post ");
            System.out.println("5.Exit");
            System.out.println("Enter the choice:");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    textpost.post();
                    break;

                case 2:
                    imagepost.post();
                    break;    
                
                case 3:
                    textpost.comment();
                    break;
                case 4:
                    imagepost.comment();
                    break;
                case 5:
                    System.out.println("Exit the program");
                    break;
                default:
                    System.out.println("Invalid choice");            
            } 

            
        
        }while(choice!=5);
        sc.close();
        media.post();
        media.comment();
    }
}