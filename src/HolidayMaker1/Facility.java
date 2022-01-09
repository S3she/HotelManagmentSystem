package HolidayMaker1;

public class Facility {
    private int hotelFacilityID;
    private String facilityName;
    private int hotelID;

    public Facility(int hotelFacilityID, String facilityName, int hotelID) {
        this.hotelFacilityID = hotelFacilityID;
        this.facilityName = facilityName;
        this.hotelID = hotelID;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "hotelFacilityID=" + hotelFacilityID +
                ", facilityName='" + facilityName + '\'' +
                ", hotelID=" + hotelID +
                '}';
    }

    public int getHotelFacilityID() {
        return hotelFacilityID;
    }

    public void setHotelFacilityID(int hotelFacilityID) {
        this.hotelFacilityID = hotelFacilityID;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }
}
