import java.util.Scanner;

public class StockAccManagement {
    public static void main(String[] args) {
        System.out.println("Welcome to stock Acc. Management System");
        int Account_Balance=10;
        int TotalAmmount_Invested=0;
        String[] Stock_Name=new String[10];
        int NumberofShares[]=new int[10];
        int Share_Price[]=new int[10];
        int Total_SharePrice[]=new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number of stocks you buy");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        System.out.println("Enter Stock Name for product "+i);
        Stock_Name[i]=sc.next();
        System.out.println("Enter Number of Shares");
        NumberofShares[i]=sc.nextInt();
        System.out.println("Enter price for one share");
        Share_Price[i]=sc.nextInt();
        Total_SharePrice[i]=NumberofShares[i]*Share_Price[i];
        TotalAmmount_Invested +=Total_SharePrice[i];

        if(TotalAmmount_Invested>Account_Balance) {
            TotalAmmount_Invested=TotalAmmount_Invested-Total_SharePrice[i];
            System.out.println("Balance is Low you cant buy this share");
            System.out.println("Your Current Acc Bal is "+Account_Balance);
        }
        else {
                Account_Balance = Account_Balance - Total_SharePrice[i];
                System.out.println(i + ")Stock Name is " + Stock_Name[i]);
                System.out.println("Total Number of shares buy is " + NumberofShares[i]);
                System.out.println("Total amount invested for " + Stock_Name[i] + " is " + Total_SharePrice[i] + "\n");
                System.out.println("Account Balance is " + Account_Balance + "\n");
            }
        }
        System.out.println("Total Amount invested for all stocks "+TotalAmmount_Invested);
    }
}
