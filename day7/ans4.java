package CP.day7;
public class ans4 {
    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking paramBooking = new HotelBooking("Sneha Maurya", "single", 4);
        HotelBooking copyBooking = new HotelBooking(paramBooking);
        defaultBooking.display();
        paramBooking.display();
        copyBooking.display();
    }
}
class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    public HotelBooking() {
        this.guestName = "Vanshika Parashar";
        this.roomType = "Standard";
        this.nights = 10;
    }
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking another) {
        this.guestName = another.guestName;
        this.roomType = another.roomType;
        this.nights = another.nights;
    }
    public void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
}

