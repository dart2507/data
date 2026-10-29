abstract class Employee{
    String Name;
    int employeeId;
    String Address;
    double basicPay;
    String Department;
   
    abstract double calculateSalary();


    Employee(String Name,int employeeId,String Address,String Department,double basicPay){
        this.Name=Name;
        this.employeeId=employeeId;
        this.Address=Address;
        this.Department=Department;
        this.basicPay=basicPay;
    }
}
class worker extends Employee{
    int workHours;


    worker(String Name,int employeeId,String Address,double basicPay,String Department,int workHour){
        super(Name,employeeId,Address,Department,basicPay);
        this.workHours=workHour;
    }


    double calculateSalary(){
        return (basicPay+(workHours*100));
    }
}

class supervisor extends Employee{
    int allowance;
    int deduction;


    supervisor(String Name,String Address,int employeeId,double basicPay,String Department,int allowance,int deduction){
        super(Name,employeeId,Address,Department,basicPay);
        this.allowance=allowance;
        this.deduction=deduction;
    }


    double calculateSalary(){
        return (basicPay+allowance-deduction);
    }
}
class manager extends Employee{
    int bonus;
    int allowance;
   
    manager(String Name,String Address,int employeeId,double basicPay,String Department,int allowance,int bonus){
        super(Name,employeeId,Address,Department,basicPay);
        this.bonus=bonus;
        this.allowance=allowance;
    }


    double calculateSalary(){
        return (basicPay+bonus+allowance);
    }
}