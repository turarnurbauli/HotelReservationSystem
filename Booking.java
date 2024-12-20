
public class Booking {
    private Room room;
    private Guest guest;
    private int numberOfNights;

    // Constructor
    public Booking(Room room, Guest guest, int numberOfNights) {
        this.room = room;
        this.guest = guest;
        this.numberOfNights = numberOfNights;
    }

    // Getters and Setters
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "room=" + room +
                ", guest=" + guest +
                ", numberOfNights=" + numberOfNights +
                '}';
    }
}
