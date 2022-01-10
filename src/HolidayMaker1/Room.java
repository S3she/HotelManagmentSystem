package HolidayMaker1;

public class Room {

    private int roomID;
    private String roomType;
    private int roomCapacity;
    private int roomAmount;
    private int roomNumber;


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Room(int roomID, String roomType, int roomCapacity, int roomAmount, int roomNumber) {
        this.roomID = roomID;
        this.roomType = roomType;
        this.roomCapacity = roomCapacity;
        this.roomAmount = roomAmount;
        this.roomNumber = roomNumber;
    }


    @Override
    public String toString() {
        return "Room{" +
                "roomID=" + roomID +
                ", roomType='" + roomType + '\'' +
                ", roomCapacity=" + roomCapacity +
                ", roomAmount=" + roomAmount +
                ", roomNumber=" + roomNumber +
                '}';
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public int getRoomAmount() {
        return roomAmount;
    }

    public void setRoomAmount(int roomAmount) {
        this.roomAmount = roomAmount;
    }
}
