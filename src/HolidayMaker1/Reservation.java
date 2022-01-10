package HolidayMaker1;

public class Reservation {

    private int reservationID;
    private String checkIn;
    private String checkOut;
    private int roomID;
    private int hotelID;
    private int numberOfGuests;
    private int guestID;
    private int roomNumber;

    public Reservation(int reservationID, String checkIn, String checkOut, int roomID, int hotelID, int numberOfGuests, int guestID, int roomNumber) {
        this.reservationID = reservationID;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.roomID = roomID;
        this.hotelID = hotelID;
        this.numberOfGuests = numberOfGuests;
        this.guestID = guestID;
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationID=" + reservationID +
                ", checkIn='" + checkIn + '\'' +
                ", checkOut='" + checkOut + '\'' +
                ", roomID=" + roomID +
                ", hotelID=" + hotelID +
                ", numberOfGuests=" + numberOfGuests +
                ", guestID=" + guestID +
                ", roomNumber=" + roomNumber +
                '}';
    }

    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public int getGuestID() {
        return guestID;
    }

    public void setGuestID(int guestID) {
        this.guestID = guestID;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
