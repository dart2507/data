import java.util.Scanner;
class Person {
String name;
int age;
String address;
long tele;
//input for the info of the person
void inputInfo() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name:");
    name = sc.nextLine();
    System.out.println("Enter the age:");
    age = sc.nextInt();
    System.out.println("Enter the address:");
    address = sc.nextLine();
    address = sc.nextLine();
    System.out.println("Enter telephone number:");
    tele = sc.nextLong();
}

void displayInfo() {
System.out.println("--- Person Details ---");
System.out.println("Name:" + name + " is" + age +  "years old.");
System.out.println("Address: " + address);
System.out.println("Telephone number:"+ tele);
}
}