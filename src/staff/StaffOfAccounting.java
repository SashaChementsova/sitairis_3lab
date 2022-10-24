package staff;

public abstract class StaffOfAccounting  implements StaffOfFinanceDepartment{
    protected static double budget=0;
    public abstract void ShowStatistics();
    public void AddBudget(double money){
        budget+=money;
    }
    public void WithdrawBudget(double money){
        budget-=money;
    }
}
