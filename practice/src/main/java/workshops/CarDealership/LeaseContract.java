package workshops.CarDealership;

public class LeaseContract extends Contract {
    private double leaseRate = 0.07;
    private double interestRate = 0.04;

    public LeaseContract(String date, String customerName, String customerEmail, Vehicle vehicle) {
        super(date, customerName, customerEmail, vehicle);

    }

    public double getLeaseRate() {
        return leaseRate;
    }

    public void setLeaseRate(double leaseRate) {
        this.leaseRate = leaseRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getTotalPrice() {
        double price = getVehicleSold().getPrice();
        double endingValue = price * 0.5;
        double leaseFee = price * leaseRate;



        return endingValue + leaseFee;
    }

    @Override
    public double getMonthlyPayment() {
        double total = getTotalPrice();
        int months = 36;
        double monthlyRate = interestRate / 12;


        return (total * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months));
    }
}
