package HolidayMaker1;

public class Hotel {

    private String hotelName;
    private int hotelID;
    private String hotelAdress;
    private String hotelPhoneNumber;
    private String hotelCity;
    private String hotelEmail;
    private String hotelZipCode;

    public Hotel(String hotelName, int hotelID, String hotelAdress, String hotelPhoneNumber, String hotelCity, String hotelEmail, String hotelZipCode) {
        this.hotelName = hotelName;
        this.hotelID = hotelID;
        this.hotelAdress = hotelAdress;
        this.hotelPhoneNumber = hotelPhoneNumber;
        this.hotelCity = hotelCity;
        this.hotelEmail = hotelEmail;
        this.hotelZipCode = hotelZipCode;

    }


    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelID=" + hotelID +
                ", hotelAdress='" + hotelAdress + '\'' +
                ", hotelPhoneNumber='" + hotelPhoneNumber + '\'' +
                ", hotelCity='" + hotelCity + '\'' +
                ", hotelEmail='" + hotelEmail + '\'' +
                ", hotelZipCode='" + hotelZipCode + '\'' +
                '}';
    }



    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }

    public String getHotelAdress() {
        return hotelAdress;
    }

    public void setHotelAdress(String hotelAdress) {
        this.hotelAdress = hotelAdress;
    }

    public String getHotelPhoneNumber() {
        return hotelPhoneNumber;
    }

    public void setHotelPhoneNumber(String hotelPhoneNumber) {
        this.hotelPhoneNumber = hotelPhoneNumber;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    public String getHotelEmail() {
        return hotelEmail;
    }

    public void setHotelEmail(String hotelEmail) {
        this.hotelEmail = hotelEmail;
    }

    public String getHotelZipCode() {
        return hotelZipCode;
    }

    public void setHotelZipCode(String hotelZipCode) {
        this.hotelZipCode = hotelZipCode;
    }


    }






