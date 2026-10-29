class manager extends Employee {
    int bonus;
    int allowance;

    manager(String Name, String Address, int employeeId,
            double basicPay, String Department, int allowance, int bonus) {

        super(Name,employeeId, Address,  Department, basicPay);

        this.bonus = bonus;
        this.allowance = allowance;
    }
    double calculateSalary(){
        return (basicPay+bonus+allowance);
    }
}