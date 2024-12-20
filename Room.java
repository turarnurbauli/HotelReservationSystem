
public class Room {
    private int roomNumber;
    private String type;
    private double pricePerNight;
    private boolean isAvailable;

    // Constructor
    public Room(int roomNumber, String type, double pricePerNight, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", type='" + type + '\'' +
        ", pricePerNight=" + pricePerNight +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
