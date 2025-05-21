package workshops.CarDealership;

public class SalesContract extends Contract {
    private double taxRate = 0.05;
    private int recordingFee = 100;
    private double processingFee;
    private boolean toFinance;
    private double monthlyPayment;

    public SalesContract(String date, String customerName, String customerEmail, Vehicle vehicle,  boolean toFinance) {
        super(date, customerName, customerEmail, vehicle);
        this.taxRate = taxRate;
        this.recordingFee = recordingFee;
        this.processingFee = vehicle.getPrice() > 10000 ? 495 : 295;
        this.toFinance = toFinance;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public int getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(int recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isToFinance() {
        return toFinance;
    }

    public void setToFinance(boolean toFinance) {
        this.toFinance = toFinance;
    }

    @Override
    public double getTotalPrice() {
        double price = getVehicleSold().getPrice();
        double tax = price * taxRate;


        return price + tax + recordingFee + processingFee;
    }

    @Override
    public double getMonthlyPayment() {
        if(!toFinance) return 0.0;

        double total = getTotalPrice();
        int monthsToPay = 10000 > total ? 48 : 24;
        double interest = 10000 > total ? 0.0425 : 0.0525;
        double monthlyRate = interest / 12;


        return (total * monthlyRate) / (1- Math.pow(1 + monthlyRate, -monthsToPay));

    }
}
