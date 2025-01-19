
public class Main {
    public static void main(String[] args) {
       
        
        HotelBooking booking1 = new HotelBooking("John Smith", "Deluxe", 3);
        HotelBooking booking2 = new HotelBooking(booking1); // Copy constructor
        System.out.println("Hotel Booking for: " + booking2.guestName + ", Room Type: " + booking2.roomType);

      
    }
}




class HotelBooking {
    String guestName;
    String roomType;
    int nights;

  
    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
}


