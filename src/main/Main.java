package main;
import staff.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        ArrayList<Staff> staff=new ArrayList<Staff>();
        Accountant acc=new Accountant("Root John",988.98);
        Economist ec=new Economist("James Lily", 874.89);
        MarketingAndAdvertisingManager m=new MarketingAndAdvertisingManager("Piller Anthony",958.47);
        PurchasingManager p=new PurchasingManager("Treek Tim",833.45);
        ProductManager pm=new ProductManager("Taylor Mary",965.45);
        staff.add(acc);
        staff.add(ec);
        staff.add(m);
        staff.add(p);
        staff.add(pm);
        for(Staff s:staff){
            s.GetInfo();
        }
        int menu;
        while(true){
            menu=0;
            System.out.println("Staff:\n 1)Accountant;\n 2)Economist;\n 3)Marketing and Advertising Manager;\n 4)Purchasing Manager;\n 5)Product Manager;\n 6)Exit.");
            menu=sc.nextInt();
            while(menu>6){
                System.out.println("Try again. There are only 6 menu items.");
                menu=sc.nextInt();
            }
            switch(menu){
                case 1:{
                    acc.GetInfo();
                    acc.GetSalary();
                    acc.AddBudget(155.45);
                    acc.WithdrawBudget(48.59);
                    acc.ShowStatistics();
                    break;}
                case 2:{
                    ec.GetInfo();
                    ec.GetSalary();
                    ec.ShowStatistics();
                    ec.AddBudget(26.45);
                    ec.ShowStatistics();
                    ec.WithdrawBudget(10);
                    ec.ShowStatistics();
                    break;}
                case 3:{
                    m.GetInfo();
                    m.GetSalary();
                    m.AddBudget(155.45);
                    m.WithdrawBudget(5);
                    m.ShowListOfShops();
                    m.AddShop("Trix");
                    m.ShowListOfShops();
                    m.ShowProductsAdvert();
                    m.CreateProduct("Buy our bricks at the Trix store!");
                    m.ShowProductsAdvert();
                    m.ShowReport();
                    m.SetSales(15);
                    m.SetTargetGroup("men");
                    m.ShowReport();
                    break;}
                case 4:{
                    p.GetInfo();
                    p.GetSalary();
                    p.AddBudget(155.45);
                    p.ShowBudget();
                    p.WithdrawBudget(50);
                    p.ShowBudget();
                    p.ShowMaterials();
                    p.AddNewMaterial("stone");
                    p.ShowMaterials();
                    break;}
                case 5:{
                    pm.GetInfo();
                    pm.GetSalary();
                    pm.ShowListOfShops();
                    pm.AddShop("Poptrat");
                    pm.ShowListOfShops();
                    pm.SetTargetGroup("businessmen");
                    pm.ShowReport();
                    pm.ShowProducts();
                    pm.CreateProduct("bricks");
                    pm.ShowProducts();
                    break;
                }
                case 6:{return;}
            }
        }

    }
}

