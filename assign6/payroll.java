import java.util.Scanner;
public class payroll{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


       
        int choice;
        do{
            System.out.println("\nSelect Employee Type:");
            System.out.println("1. Worker");
            System.out.println("2. Supervisor");
            System.out.println("3. Manager");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();


            System.out.print("Enter Employee ID: ");
            int employeeId = sc.nextInt();
            sc.nextLine();


            System.out.print("Enter Employee Name: ");
            String Name = sc.nextLine();


            System.out.print("Enter Address: ");
            String Address = sc.nextLine();


            System.out.print("Enter Department Name: ");
            String Department = sc.nextLine();


            System.out.print("Enter Basic Pay: Rs.");
            double basicPay = sc.nextDouble();


            Employee employee;
            switch (choice) {
                case 1:
                    System.out.print("Enter Overtime Hours: ");
                    double workHour = sc.nextInt();


                    employee = new worker(Name, employeeId , Address, basicPay, Department, (int)workHour);
                    break;


                case 2:
                    System.out.print("Enter Allowances: Rs.");
                    double allowance = sc.nextInt();


                    System.out.print("Enter Deductions: Rs.");
                    double deduction = sc.nextInt();


                    employee = new supervisor(Name,Address,employeeId,basicPay,Department,(int)allowance,(int) deduction);
                    break;


                case 3:
                    System.out.print("Enter Bonus: Rs.");
                    int bonus = sc.nextInt();


                    System.out.print("Enter Allowances: Rs.");
                    int allowance1 = sc.nextInt();


                    employee = new manager(Name,Address,employeeId,basicPay,Department,allowance1, bonus );
                    break;


                default:
                    System.out.println("Invalid employee type!");
                    continue;
            }


            System.out.println("Final Salary: Rs." +employee.calculateSalary());
        }while(choice!=4);
        sc.close();
    }
}