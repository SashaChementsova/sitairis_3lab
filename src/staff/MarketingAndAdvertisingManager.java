package staff;

public class MarketingAndAdvertisingManager extends StaffOfAdvertisingAndPRDepartment implements StaffOfSalesDepartment,StaffOfMarketingDepartment{
    private String SNP;
    private double salary;
    static String targetgroup;
    static String productadvert;
    public MarketingAndAdvertisingManager(String SNP,double salary){
        this.salary=salary;
        this.SNP=SNP;
        targetgroup="adults";
        productadvert="Buy our product!";
    }
    public void GetSalary(){
        System.out.println("Salary: "+salary);
    }
    public void GetInfo(){
        System.out.println("SNP: "+SNP);
    }
    public void ShowReport(){
        System.out.println("Report.\nBudget: "+budget+"\nSales: "+sales+"\nTarget group: "+targetgroup);
    }
    public void ShowListOfShops(){
        if(shops.isEmpty()){
            System.out.println("The list of shops is empty");
        }
        else{
            for(String s : shops){
                System.out.println(s);
            }
        }
    }
    public void AddShop(String shname){
        shops.add(shname);
    }
    public void ShowProductsAdvert(){
        System.out.println("Advertisement: "+productadvert);
    }
    public void SetSales(int sale){
        sales=sale;
    }
    public void CreateProduct(String prname){
        productadvert=prname;
    }
    public void SetTargetGroup(String group){
        targetgroup=group;
    }

}
