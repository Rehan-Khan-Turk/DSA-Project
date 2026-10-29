package models;
import java.time.LocalDate;
public class payment {
    private int paymentId;
    private int purchaseId;
    private String customerName;
    private double totalAmount;
    private double amountPaid;
    private String paymentMethod;
    private LocalDate paymentDate;
    public payment(int paymentId, int purchaseId, String customerName, double totalAmount, double amountPaid, String paymentMethod, LocalDate paymentDate) {
        setPaymentId(paymentId);
        setPurchaseId(purchaseId);
        setCustomerName(customerName);
        setTotalAmount(totalAmount);
        setAmountPaid(amountPaid);
        setPaymentMethod(paymentMethod);
        this.paymentDate = LocalDate.now();
    }
    public int getPaymentId() {
        return paymentId;
    }
    public int getPurchaseId() {
        return purchaseId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public double getAmountPaid() {
        return amountPaid;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public LocalDate getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentId(int paymentId) {
        if (paymentId <= 0) {
            throw new IllegalArgumentException("Payment ID must be positive");
        }
        this.paymentId = paymentId;
    }
    public void setPurchaseId(int purchaseId) {
        if (purchaseId <= 0) {
            throw new IllegalArgumentException("Purchase ID must be positive");
        }
        this.purchaseId = purchaseId;
    }
    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be null or empty");
        }
        this.customerName = customerName;
    }
    public void setTotalAmount(double totalAmount) {
        if (!Double.isFinite(totalAmount) || totalAmount <= 0) {
            throw new IllegalArgumentException("Car price must be a positive number");
        }
        this.totalAmount = totalAmount;
    }
public void setAmountPaid(double amountPaid) {
    if(!Double.isFinite(amountPaid) || amountPaid < 0 || amountPaid > totalAmount){
        throw new IllegalArgumentException("Amount must be between 0 and total amount");
    }
    this.amountPaid = amountPaid;
}
public void setPaymentMethod(String PaymentMethod) {
    if (paymentMethod == null ||!(paymentMethod.equalsIgnoreCase("Cash")|| paymentMethod.equalsIgnoreCase("Bank Transfer"))) {
            throw new IllegalArgumentException("Payment method must be Cash or Bank Transfer");
        }
        this.paymentMethod = paymentMethod.trim();
    }
    public double getRemainingBalance() {
        return totalAmount - amountPaid;
        }
    public String getPaymentStatus() {
        if(amountPaid == 0){
            return "Pending";
        } else if (amountPaid < totalAmount) {
            return "Partial";
        } else {
            return "Paid in Full";
        }
    }
        public String getPaymentReceipt() {
        return "\n===== PAYMENT RECEIPT ====="
            + "\nPayment ID: " + getPaymentId()
            + "\nPurchase ID: " + getPurchaseId()
            + "\nCustomer Name: " + getCustomerName()
            + "\nTotal Amount: " + getTotalAmount()
            + "\nAmount Paid: " + getAmountPaid()
            + "\nRemaining Balance: " + getRemainingBalance()
            + "\nPayment Method: " + getPaymentMethod()
            + "\nPayment Status: " + getPaymentStatus()
            + "\nPayment Date: " + getPaymentDate()
            + "\n===========================";
    }
}

