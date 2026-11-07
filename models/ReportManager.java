package models;
import java.util.List;
public class ReportManager {
        public String getAvailableVehiclesReport(List<Vehicle> vehicles){
        String report = "\n===== AVAILABLE VEHICLES REPORT =====";
        for(int i=0 ; i<vehicles.size();i++){
            if(vehicles.get(i).isAvailable()){
                report +="\n" + vehicles.get(i).toString() ;
            }
        }
        return report + "\n=====================================";
    }
    public String getSoldVehiclesReport(List<Vehicle> vehicles){
        String report = "\n=====Sold Cars =====";
        for(int i=0; i<vehicles.size();i++){
            if(!vehicles.get(i).isAvailable()){
                report +="\n" + vehicles.get(i).toString();
            }
        }
        return report + "\n===================";
    }
    public String getpurchaseHistory(List<purchase> Purchases){
        String report = "Purchase History Report\n";
        for(int i = 0 ; i<Purchases.size(); i++){
            report += "\nPurchase ID: " + Purchases.get(i).getPurchaseID() 
            + "\nCustomer ID: " + Purchases.get(i).getCustomerID() 
            + "\nVehicle ID: " + Purchases.get(i).getVehicleID() 
            + "\nPurchase Date: " + Purchases.get(i).getPurchaseDate() 
            + "\nAmount: RS. " + Purchases.get(i).getAmount()
            + "\n-----------------------------";
        }
        return report;
    }
    public String getSalesSummary(List<purchase> Purchases){
        double totalSales = 0;
        for(int i = 0 ; i<Purchases.size(); i++){
            totalSales += Purchases.get(i).getAmount();
        }
        return "\n===== SALES SUMMARY ====="
        +"\nTotal Purchases: " + Purchases.size()
        +"\nTotal Sales: RS. " + totalSales
        +"\n==========================";
    }
    public String getspaymentSummary(List<payment> Payments){
        double totalAmount = 0;
        double totalPaid = 0;
        double remainingbalance = 0;
        for(int i = 0 ; i<Payments.size(); i++){
            totalAmount += Payments.get(i).getTotalAmount();
            totalPaid += Payments.get(i).getAmountPaid();
            remainingbalance += Payments.get(i).getRemainingBalance();
        }
        return "\n===== PAYMENT SUMMARY ====="
        +"\nTotal Amount: RS. " + totalAmount
        +"\nTotal Paid: RS. " + totalPaid
        +"\nRemaining Balance: RS. " + remainingbalance
        +"\nTotal Payments: " + Payments.size()
        +"\n============================";
    }
}
