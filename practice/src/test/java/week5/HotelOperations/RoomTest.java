package week5.HotelOperations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RoomTest {

    @Test
    void getNumberOfBeds() {
        Room room = new Room(1,150,false,false);

        int result = room.getNumberOfBeds();

        assertEquals(1,result);
    }

    @Test
    void setNumberOfBeds() {
        Room room = new Room(3,120,true,true);

        room.setNumberOfBeds(3);

        assertEquals(3,room.getNumberOfBeds());
    }

    @Test
    void getPrice() {
        Room room = new Room(2,250,true,false);

        assertEquals(250,room.getPrice());
    }

    @Test
    void setPrice() {
        Room room = new Room (3,120,false,false);

        room.setPrice(120);

        assertEquals(120,room.getPrice());
    }

    @Test
    void isOccupied() {
        Room room = new Room(2,200,false,false);

    }

    @Test
    void setOccupied() {
    }

    @Test
    void isDirty() {
    }

    @Test
    void setDirty() {
    }

    @Test
    void isAvailable() {
    }

    @Test
    void checkIn() {

        Room room = new Room(3,550,true,false);

    }
    @Test
    void checkOut(){


    }


}