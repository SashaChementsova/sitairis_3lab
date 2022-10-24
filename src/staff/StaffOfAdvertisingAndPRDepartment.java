package staff;

import java.util.ArrayList;

public abstract class StaffOfAdvertisingAndPRDepartment implements StaffOfCommercialDepartment {
    protected static double budget=0;
    protected static int sales=0;
    protected static ArrayList<String> shops;
    public StaffOfAdvertisingAndPRDepartment(){
        shops=new ArrayList<String>();
    }
    public void AddBudget(double money){
        budget+=money;
    }
    public void WithdrawBudget(double money){
        budget-=money;
    }
    public abstract void ShowProductsAdvert();
}

