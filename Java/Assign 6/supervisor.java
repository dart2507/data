
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