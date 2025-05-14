package week6.AssetManager;

import java.time.LocalDate;
import java.time.Period;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public Vehicle(String makeModel, int year, int odometer) {
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    public int getCarAge(){
        LocalDate carYear = LocalDate.of(year,1,1);
        LocalDate currentDate = LocalDate.now();

        Period carAge = Period.between(carYear,currentDate);
        return carAge.getYears();
    }
    @Override
    public double getValue(){
        double value = 0;

        if (getCarAge() <= 3){
            value = getOriginalCost() * Math.pow(0.97,getCarAge());
        }
        else if (getCarAge() <= 6){
            value = getOriginalCost() * Math.pow(0.94,getCarAge());
        }
        else if (getCarAge() <= 10){
            value = getOriginalCost() * Math.pow(0.92,getCarAge());
        }else if (getCarAge() > 10){
            value = getOriginalCost() - 1000;

        }else System.out.println("Can't be negative years old");

        if ((odometer > 100000) && (makeModel.toLowerCase().contains("toyota") || makeModel.toLowerCase().contains("honda"))) {
            value *= 0.75;
        }

        return value;
    }

}
