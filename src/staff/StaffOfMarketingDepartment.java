package staff;

public interface StaffOfMarketingDepartment extends StaffOfCommercialDepartment, StaffOfProductionDepartment,StaffOfLogisticsDepartment{
    void SetTargetGroup(String group);
}
