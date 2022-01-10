package HolidayMaker1;

public class Room_location {

    private int roomID;
    private int HotelID;
    private int roomNumber;

    public Room_location(int roomID, int hotelID, int roomNumber) {
        this.roomID = roomID;
        HotelID = hotelID;
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Room_location{" +
                "roomID=" + roomID +
                ", HotelID=" + HotelID +
                ", roomNumber=" + roomNumber +
                '}';
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public int getHotelID() {
        return HotelID;
    }

    public void setHotelID(int hotelID) {
        HotelID = hotelID;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
