package week5.HotelOperations;

import java.time.LocalDateTime;

public class Employee {
    private String employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;
    private double endTime;

    public Employee (String employeeID,String name, String department,double payRate,double hoursWorked, double startTime, double endTime){
        this.employeeID = employeeID;
        this.name = name;
        this.department= department;
        this.payRate= payRate;
        this.hoursWorked= hoursWorked;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getEmployeeID() {
        return employeeID;
    }

   public String getName(){
        return name;
   }

   public String getDepartment(){
        return department;
   }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getRegularHours() {
        return hoursWorked <= 40 ? hoursWorked : 40;
    }

    public double getOvertimeHours() {
        return hoursWorked > 40 ? hoursWorked - 40 : 0;
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }
    public void punchIn(double time ){
        startTime = time;
    }
    public void punchOut(double time){
        hoursWorked += time - startTime;
    }
    public void punchIn(){
        int hours = LocalDateTime.now().getHour();
        int minutes = LocalDateTime.now().getMinute() * 1/60;
        startTime = hours + minutes;
    }
    public void punchOut(){
        int hours = LocalDateTime.now().getHour();
        int minutes = LocalDateTime.now().getMinute() * 1/60;
        startTime = hours + minutes;
        hoursWorked += endTime - startTime;
    }

}
