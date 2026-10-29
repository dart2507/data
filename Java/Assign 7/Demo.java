import java.util.Scanner;
public class Demo {
    public static void main(String args[]){
        int choice;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("\n1.Car\n2.Bus\n3.Train\n4.Exit\n");
        System.out.print("Enter your choice:");
        choice=sc.nextInt();
        switch(choice){
            case 1:{
                Transport C=new Car();
                int distance;
                System.out.println("Enter the distacne travelled by car: ");
                distance=sc.nextInt();
                if (distance>0){
                    System.out.println("Fare for car is: "+C.calculateFare(distance));
                }else{
                    System.out.println("Error! Negative distance not allowed.");
                }
                break;
            }
            case 2:{
                Transport B=new Bus();
                int distance;
                System.out.println("Enter the distacne travelled by bus: ");
                distance=sc.nextInt();
                if (distance>0){
                    System.out.println("Fare for car is: "+B.calculateFare(distance));
                }else{
                    System.out.println("Error! Negative distance not allowed.");
                }
                break;
            }
            case 3:{
                Transport T=new Train();
                int distance;
                System.out.println("Enter the distance travelled by train: ");
                distance=sc.nextInt();
                if (distance>0){
                    System.out.println("Fare for car is: "+T.calculateFare(distance));
                }else{
                    System.out.println("Error! Negative distance not allowed.");
                }
                break;
            }
            case 4:{
                System.out.println("Exited the program!!");
                break;
            }
            default:
                System.out.println("invalid choice:");
                break;
        }
    }while(choice!=4);
    }
}
