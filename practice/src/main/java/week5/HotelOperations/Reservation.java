package week5.HotelOperations;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType,int numberOfNights, boolean isWeekend){
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }
    //getter
    public String getRoomType(){
        return roomType;
    }
    //setter
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    //getter
    public int getNumberOfNights() {
        return numberOfNights;
    }
    //setter

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }
    public double getPrice() {
        double basePrice;

        if (roomType.equalsIgnoreCase("king")){
            basePrice = 139.00;
        } else if (roomType.equals("double")) {
            basePrice = 124.00;
        } else {
            basePrice = 0.0;
        }
        if (isWeekend){
            basePrice *= 1.10;
        }
        return basePrice;
    }
    public double getReservationTotal(){
        return getPrice() * numberOfNights;
    }
}
