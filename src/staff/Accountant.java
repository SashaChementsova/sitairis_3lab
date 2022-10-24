package staff;

public class Accountant extends StaffOfAccounting{
    private String SNP;
    private double salary;
    public Accountant(String SNP,double salary){
        this.salary=salary;
        this.SNP=SNP;
    }
    public void GetSalary(){
        System.out.println("Salary: "+salary);
    }
    public void GetInfo(){
        System.out.println("SNP: "+SNP);
    }
    public void ShowStatistics(){
        System.out.println("Accounting statistics.\nBudget: "+budget);
    }
}
