package staff;
import java.util.ArrayList;

public class PurchasingManager implements StaffOfFinanceDepartment{
    private static ArrayList<String> materials;
    private String SNP;
    private double salary;
    private static double budget=0;
    public PurchasingManager(String SNP,double salary){
        materials = new ArrayList<>();
        this.salary=salary;
        this.SNP=SNP;
    }
    public void ShowMaterials(){
        if(materials.isEmpty()){
            System.out.println("The list of materials is empty");
        }
        else{
            for(String m : materials){
                System.out.println(m);
            }
        }
    }
    public void AddNewMaterial(String material){
        materials.add(material);
    }
    public void GetSalary(){
        System.out.println("Salary: "+salary);
    }
    public void GetInfo(){
        System.out.println("SNP: "+SNP);
    }
    public void ShowBudget(){
        System.out.println("Budget: "+budget);
    }
    public void AddBudget(double money){
        budget+=money;
    }
    public void WithdrawBudget(double money){
        budget-=money;
    }
}
