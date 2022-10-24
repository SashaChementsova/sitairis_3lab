package staff;

import java.util.ArrayList;

public class ProductManager implements StaffOfMarketingDepartment,StaffOfWarehouseManagementDepartment{
    private String SNP;
    private double salary;
    static String targetgroup;
    static ArrayList<String> shopsofmaterial;
    static ArrayList<String> products;
    public ProductManager(String SNP,double salary){
        this.salary=salary;
        this.SNP=SNP;
        targetgroup="adults";
        products=new ArrayList<String>();
        shopsofmaterial=new ArrayList<String>();
    }
    public void GetSalary(){
        System.out.println("Salary: "+salary);
    }
    public void GetInfo(){
        System.out.println("SNP: "+SNP);
    }
    public void ShowReport(){
        System.out.println("Report.\nTarget group: "+targetgroup);
    }
    public void CreateProduct(String prname){
        products.add(prname);
    }

    public Iterable<String> GetProducts(){
        return products;
    }
    public void ShowProducts(){
        if(products.isEmpty()){
            System.out.println("The list of products is empty");
        }
        else{
            for(String pr : products){
                System.out.println(pr);
            }
        }
    }
    public void AddShop(String shname){
        shopsofmaterial.add(shname);
    }
    public void ShowListOfShops(){
        if(shopsofmaterial.isEmpty()){
            System.out.println("The list of shops of materials is empty");
        }
        else{
            for(String sh : shopsofmaterial){
                System.out.println(sh);
            }
        }
    }
    public void SetTargetGroup(String group){
        targetgroup=targetgroup;
    }
}
