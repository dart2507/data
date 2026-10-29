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