package HolidayMaker1;

public class Room {

    private int roomID;
    private String roomType;
    private int roomCapacity;
    private int roomAmount;

    public Room(int roomID, String roomType, int roomCapacity, int roomAmount) {
        this.roomID = roomID;
        this.roomType = roomType;
        this.roomCapacity = roomCapacity;
        this.roomAmount = roomAmount;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomID=" + roomID +
                ", roomType='" + roomType + '\'' +
                ", roomCapacity=" + roomCapacity +
                ", roomAmount=" + roomAmount +
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
