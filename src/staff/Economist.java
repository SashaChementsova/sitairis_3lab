package staff;

public class Economist extends StaffOfAccounting{
    private String SNP;
    private double salary;
    public Economist(String SNP,double salary){
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
        System.out.println("Economic statistics.\nBudget: "+budget);
    }
}
