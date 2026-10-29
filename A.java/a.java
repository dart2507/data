import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Account[] accounts = new Account[100];
        int count = 0;
        int choice;
        do{
            System.out.println("~~PCCOE BANK~~");
            System.out.println("1.Add Account");
            System.out.println("2.Remove Account");
            System.out.println("3.Deposit Money");
            System.out.println("4.Withdraw Money");
            System.out.println("5.Display Accounts");
            System.out.println("6.Exit");

            System.out.println("Enter your choice :- ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter account no :-");
                    int accno = sc.nextInt();

                    sc.nextLine();
                    System.out.println("Enter name of Account Holder :-");
                    String name = sc.nextLine();

                    System.out.println("Enter initial Balance :-");
                    double balance = sc.nextDouble();

                    accounts[count] = new Account(accno, name, balance);
                    count++;

                    break;

                case 2:
                    System.out.println("Enter account number which you want to remove :-");
                    accno = sc.nextInt();
                   
                    boolean found = false;

                    for(int i = 0; i<count; i++){
                        if(accounts[i]!= null && accounts[i].accno == accno){
                            accounts[i] = null;
                            System.out.println("Account removed Successfully ");
                            found = true;
                            break;
                        }
                    }

                    if(found == false){
                        System.out.println("No account Found");
                    }
                    break;

                case 3:
                    System.out.println("Enter Account number :-");
                    accno = sc.nextInt();
                    found = false;

                    System.out.println("Enter Amount to be deposited :");
                    double amount = sc.nextDouble();

                    for(int i = 0; i<count; i++){
                        if(accounts[i]!= null && accounts[i].accno == accno){
                            accounts[i].deposit(amount);
                            found = true;
                            break;
                        }
                    }
                    if(found == false){
                        System.out.println("No account Found");
                    }
                    break;

                case 4:
                    System.out.println("Enter Account number :-");
                    accno = sc.nextInt();
                    found = false;
                   
                    System.out.println("Enter Amount to be withdraw :");
                    amount = sc.nextDouble();

                    for(int i = 0; i<count; i++){
                        if(accounts[i]!= null && accounts[i].accno == accno){
                            accounts[i].withdraw(amount);
                            found = true;
                            break;
                        }
                    }
                    if(found == false){
                        System.out.println("No account Found");
                    }
                    break;
                   
                case 5:
                    System.out.println("--Bank Details--");
                        for(int i = 0; i<count; i++){
                            if(accounts[i]!=null){
                                accounts[i].display();
                                System.out.println();  
                                }
                        }
                        break;
                case 6:
                    System.out.println("Thank you for using the system");
                    break;

                default:
                    System.out.println("Invalid Choice");    
            }
        }while (choice != 6);

            sc.close();
    }
   
}
class Account {
    int accno;
    String name;
    double balance;

    Account(int accno, String name, double balance){
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }
//display
void display(){
    System.out.println("Account no:- " + accno);
    System.out.println("Account holder name:- " + name);
    System.out.println("Balance :- " + balance);
}    

//deposit
void deposit(double amount){
    if(amount<0){
        System.out.println("Negative amount cannot be entered");
    }else{
    balance = balance + amount;
    System.out.println("Updated Balance :- " + balance);}
}
   
//withdraw
void withdraw(double amount){
    if(amount<0){
        System.out.println("Negative amount cannot be entered");
    }
    if(balance < amount){
        System.out.println("Insufficient balance ");
    }
    else{
        balance = balance - amount;
        System.out.println("Updated balance is :- " + balance);
    }
}

}







///updated case 1

case 1:
    System.out.println("Enter 3 digit Account number:");
    int accno = sc.nextInt();

    // Check that account number has exactly 3 digits
    if (accno < 100 || accno > 999) {
        System.out.println("Error: Account number must be 3 digits!");
        break;
    }

    // Check for duplicate account number
    boolean exists = false;

    for (int i = 0; i < count; i++) {
        if (accounts[i] != null && accounts[i].accno == accno) {
            exists = true;
            break;
        }
    }

    if (exists) {
        System.out.println("Error: Account number already exists!");
        break;
    }

    sc.nextLine();
    System.out.println("Enter account holder name:");
    String name = sc.nextLine();

    System.out.println("Enter Initial Balance:");
    double balance = sc.nextDouble();

    accounts[count] = new Accounts(accno, name, balance);
    count++;

    System.out.println("Account added successfully!");
    break;










public class Main{
    public static void main(String[] args) {
        Shape s = new Shape();

        System.out.println("Area of circle :- " + s.area(7.0));
        System.out.println("Area of rectangle :- " + s.area(4, 5));
        System.out.println("Area of triangle :- " + s.area(3, 2, 4));
        System.out.println("Perimeter of circle :- " + s.perimeter(7));
        System.out.println("Perimeter of rectangle :- " + s.perimeter(4, 5));
    }
}
class Shape{

    //Area of rectangle
    double area(double length, double breadth){
        return (length*breadth);
    }

    //perimeter of rectangle
    double perimeter(double length, double breadth){
        return 2*(length + breadth);    
    }

    //area of circle
    double area(double radius){
        return 3.1416*radius*radius;
    }

    //area of triangle
    double area(double a, double b, double c){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    //perimeter of circle
    double perimeter(double radius){
        return 2*3.1416*radius;
    }
}
class Circle extends Shape{
    double radius;
   
    Circle(double radius){
        this.radius = radius;
    }

}




public class Main {
    public static void main(String[] args) {
        Post p1 = new Textpost();
        p1.post();
        p1.comment();

        Post p2 = new Imagepost();
        p2.post();
        p2.comment();
    }
   
}
class Post {
    void post(){
        System.out.println("Posting a message.....");
    }

    void comment(){
        System.out.println("Commenting on post.....");
    }    
}
class Imagepost extends Post {
    @Override
    void post(){
        System.out.println("Posting an image....");
    }

    @Override
    void comment(){
        System.out.println("Commenting on image post....");
    }
   
}
class Textpost extends Post{
    @Override
    void post(){
        System.out.println("Posting a text message...");
    }

    @Override
    void comment(){
        System.out.println("Commenting on text post....");
    }
   
}







import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("~~Employee Types~~");
        System.out.println("1.Worker");
        System.out.println("2.Supervisor");
        System.out.println("3.Manager");

        System.out.println("Enter your choice :- ");

        choice = sc.nextInt();

        System.out.println("Enter Employee id :- ");
        int employeeid = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Employee name :- ");
        String employeename = sc.nextLine();

        System.out.println("Enter Employee address :- ");
        String employeeaddress = sc.nextLine();

        System.out.println("Enter Employee department :- ");
        String department = sc.nextLine();

        System.out.println("Enter Basic Pay :- ");
        double basicpay = sc.nextDouble();

        System.out.println("Enter Bonus :- ");
        double bonus = sc.nextDouble();

        System.out.println("Enter Allowances :- ");
        double allowances = sc.nextDouble();

        System.out.println("Enter Deduction :- ");
        double deduction = sc.nextDouble();

        System.out.println("Enter Overtime Rate :- ");
        double overtimerate = sc.nextDouble();

        System.out.println("Enter Overtime Hours :- ");
        int overtimehours = sc.nextInt();

        Employee emp = null;

        switch (choice) {
            case 1:
                emp = new Worker(employeeid, employeename, employeeaddress, department, basicpay, bonus, allowances, overtimerate,
                 overtimehours, deduction);
                break;

            case 2:
                emp = new Supervisor(employeeid, employeename, employeeaddress, department, basicpay, bonus, allowances, overtimerate,
                 overtimehours, deduction);  
                break;
               
            case 3:
                emp = new Manager(employeeid, employeename, employeeaddress, department, basicpay, bonus, allowances, overtimerate,
                 overtimehours, deduction);    
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }

        emp.displaydetails();
        sc.close();

    }
   
}
abstract class Employee {
    int employeeid;
    String employeename;
    String employeeaddress;
    String department;
    double basicpay;
    double bonus;
    double allowances;
    int overtimehours;
    double overtimerate;
    double deduction;

    Employee(int employeeid, String employeename, String employeeaddress, String department,
        double basicpay, double bonus, double allowances, double overtimerate, int overtimehours,
        double deduction){


            this.employeeid = employeeid;
            this.employeename = employeename;
            this.employeeaddress = employeeaddress;
            this.department = department;
            this.basicpay = basicpay;
            this.bonus = bonus;
            this.allowances = allowances;
            this.overtimerate = overtimerate;
            this.overtimehours = overtimehours;
            this.deduction = deduction;

        }

        abstract double calculatesalary();

        void displaydetails(){
            System.out.println("Employee ID :- " + employeeid);
            System.out.println("Employee name :- " + employeename);
            System.out.println("Employee address :- " + employeeaddress);
            System.out.println("Employee department :- " + department);
            System.out.println("Basic Pay :- " + basicpay);
            System.out.println("Bonus :- " + bonus);
            System.out.println("Allowances :- " + allowances);
            System.out.println("Overtime Hours :- " + overtimehours);
            System.out.println("Overtime Rate :- " + overtimerate);
            System.out.println("Deduction :- " + deduction);
            System.out.println("Over time pay :- " + (overtimehours*overtimerate));
            System.out.println("Expected salary :- " + calculatesalary());
        }

}
class Supervisor extends Employee {
    Supervisor(int employeeid, String employeename, String employeeaddress, String department,
        double basicpay, double bonus, double allowances, double overtimerate, int overtimehours,
        double deduction){

            super(employeeid, employeename, employeeaddress, department, basicpay, bonus, allowances, overtimerate,
                 overtimehours, deduction);
        }
 
        @Override
        double calculatesalary() {
            return basicpay + bonus + allowances + (overtimehours*overtimerate) - deduction;
        }

   
}





import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Car");
        System.out.println("2.Bus");
        System.out.println("3.Train");
        System.out.println("Enter transport mode :- ");
        int choice = sc.nextInt();

        System.out.println("Enter distance to be travelled :- ");
        double distance = sc.nextDouble();

        Transport transport;

        switch(choice){
            case 1:
                transport = new Car();
                break;

            case 2:
                transport = new Bus();
                break;
               
            case 3:
                transport = new Train();
                break;
               
            default:
                System.out.println("Enter valid choice !!");
                sc.close();
                return;

        }

        double fare = transport.calculateFare(distance);

        if(distance > 0){
            System.out.println("Fare Rs. " + fare);
        }
        sc.close();
    }

   
}
interface Transport {
    double calculateFare(double distance);
}
class Car implements Transport {
    @Override
    public double calculateFare(double distance){
        if(distance < 0){
            System.out.println("Negative distance not allowed");
            return -1;
        }

        return distance*15;

    }
   
}







import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter rows & columns of Matrix A :");
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();

            System.out.println("Enter rows & columns of Matrix B :");
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();


            if(r1 <= 0 || c1 <= 0 || r2<= 0 || c2<=0){
                throw new IllegalArgumentException(
                    "Matrix dimension must be positive"
                );
            }

            if(c1 != r2){
                throw new IllegalArgumentException(
                    "Matrix Multiplication not possible"
                );
            }


            int [][] A = new int[r1][c1];
            int [][] B = new int[r2][c2];
            int [][] C = new int[r1][c2];

            System.out.println("Enter elements of Matrix A :-");
            for(int i = 0; i<r1; i++){
                for(int j = 0; j<c1; j++){
                    A[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter elements of Matrix B :-");
            for(int i = 0; i<r2; i++){
                for(int j = 0; j<c2; j++){
                    B[i][j] = sc.nextInt();
                }
            }

            MatrixMultiplier [] threads = new MatrixMultiplier[r1];

            for(int i = 0; i< r1; i++){
                threads[i] = new MatrixMultiplier(A,B,C, i);
                threads[i].start();
            }

            for(int i = 0; i< r1; i++){
                threads[i].join();
            }

            System.out.println("Resultant Matrix");
            for(int i = 0; i<r1; i++){
                for(int j = 0; j<c2; j++){
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }catch (InterruptedException e) {
            System.out.println("Error: Thread execution interrupted.");
            Thread.currentThread().interrupt();
        }
        finally{
            sc.close();
        }
       
    }
   
}
public class MatrixMultiplier extends Thread {
    int [][] A,B,C;
    int row;

    MatrixMultiplier(int [][] A, int [][] B, int [][] C, int row){
        this.A = A;
        this.B = B;
        this.C = C;
        this.row = row;

    }
    @Override
    public void run(){
        try{
            for(int j = 0; j<B[0].length; j++){
                C[row][j]=0;
                for(int k = 0; k<B.length; k++){
                    C[row][j] += A[row][k]*B[k][j];
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(
                "Error: Array index out of bounds "
            );
        }

    }


   
}







import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter log file name :- ");
        String filename = sc.nextLine();

        LogAnalayzer analayzer = new LogAnalayzer();
        analayzer.analyzelog(filename);

        sc.close();
    }
   

}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogAnalayzer{

    public void analyzelog(String filename){
        int errorcount = 0;
        int warningcount = 0;
        int infocount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            //Read & analyze log file line by line

            while((line = br.readLine()) != null){
                if(line.contains("[ERROR]")){
                    errorcount++;
                }
                else if(line.contains("[INFO]")){
                    infocount++;
                }
                else if(line.contains("[WARNING]")){
                    warningcount++;
                }
            }

            String result =
            "Total error count :- " + errorcount +"\n" +
            "Total warning count :- " + warningcount + "\n" +
            "Total info count :- " + infocount;

            //display
            System.out.println(result);


            try (BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"))) {
                bw.write(result);
                System.out.println("Result saved to result.txt file");
               
            } catch (IOException e) {
                System.out.println("error writing file");
            }
           
        } catch (IOException e) {
            System.out.println("Log file not found");
        }
    }

}







import java.util.Scanner;

public class Main{
    public static void main(String[]args){
       
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n=sc.nextInt();

        stackexception stack=new stackexception(n);

        try{
            int choice;
            do{
                System.out.println("choice 1: push element");
                System.out.println("choice 2: pop element");
                System.out.println("choice 3: peak element");
                System.out.println("choice 4: exit");
                System.out.print("Enter your choice:");
                choice=sc.nextInt();

                switch(choice){
                    case 1:
                        System.out.print("Enter element to push: ");
                        int i=sc.nextInt();
                        stack.push(i);
                        break;
                    case 2:
                        int p=stack.pop();
                        System.out.print(p+" is popped from stack");
                        break;
                    case 3:
                        int pk=stack.peak();
                        System.out.println(pk+" is the peak element in stack");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }while(choice!=4);
        }catch(IllegalStateException e){
            System.out.println("Error: "+e.getMessage());
        }finally{
            sc.close();
        }
       
    }
}



class stackexception{
    int top=-1;
    int size;
    int stack[];

    stackexception(int size){
        this.size=size;
        stack=new int[size];
    }

    void push(int value){
        if(top>=size-1){
            throw new IllegalStateException("Stack is fulled, cannot pushed "+value);
        }
        top++;
        stack[top]=value;
        System.out.println(value+" is pushed in stack");
    }

    int pop(){
        if(top==-1){
            throw new IllegalStateException("Stack underflow, cannot pop");
        }
        int value=stack[top];
        top--;
        return value;
    }

    int peak(){
        if(top==-1){
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }
}
