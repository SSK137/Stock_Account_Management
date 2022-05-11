import java.util.Scanner;

public class StockAccManagement {
    public static void main(String[] args) {
        System.out.println("Welcome to stock Acc. Management System");
        String[] Stock_Name=new String[10];
        int NumberofShares[]=new int[10];
        int Share_Price[]=new int[10];
        int Total_SharePrice[]=new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number of stocks you buy");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            System.out.println("Enter Stock Name for product " + i);
            Stock_Name[i] = sc.next();
            System.out.println("Enter Number of Shares");
            NumberofShares[i] = sc.nextInt();
            System.out.println("Enter price for one share");
            Share_Price[i] = sc.nextInt();
            Total_SharePrice[i] = NumberofShares[i] * Share_Price[i];

            System.out.println(i + ")Stock Name is " + Stock_Name[i]);
            System.out.println("Total Number of shares buy is " + NumberofShares[i]);
            System.out.println("Total amount invested for " + Stock_Name[i] + " is " + Total_SharePrice[i] + "\n");
        }
    }
}
