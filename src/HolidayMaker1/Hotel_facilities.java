package HolidayMaker1;

public class Hotel_facilities {

    private String hotelFacilitiesName;
    private int hotelFacilitiesID;

    public Hotel_facilities(String hotelFacilitiesName, int hotelFacilitiesID) {
        this.hotelFacilitiesName = hotelFacilitiesName;
        this.hotelFacilitiesID = hotelFacilitiesID;
    }

    @Override
    public String toString() {
        return "Hotel_facilities{" +
                "hotelFacilitiesName='" + hotelFacilitiesName + '\'' +
                ", hotelFacilitiesID=" + hotelFacilitiesID +
                '}';
    }

    public String getHotelFacilitiesName() {
        return hotelFacilitiesName;
    }

    public void setHotelFacilitiesName(String hotelFacilitiesName) {
        this.hotelFacilitiesName = hotelFacilitiesName;
    }

    public int getHotelFacilitiesID() {
        return hotelFacilitiesID;
    }

    public void setHotelFacilitiesID(int hotelFacilitiesID) {
        this.hotelFacilitiesID = hotelFacilitiesID;
    }
}
