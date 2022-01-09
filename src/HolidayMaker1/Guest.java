package HolidayMaker1;

public class Guest {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAdress;
    private String dateOfBirth;
    private int guest_ID;
    private int reservation_ID;

    public Guest(String firstName, String lastName, String phoneNumber, String emailAdress, String dateOfBirth, int guest_ID, int reservation_ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
        this.dateOfBirth = dateOfBirth;
        this.guest_ID = guest_ID;
        this.reservation_ID = reservation_ID;

    }

    @Override
    public String toString() {
        return "Guest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAdress='" + emailAdress + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", guest_ID=" + guest_ID +
                ", reservation_ID=" + reservation_ID +
                '}';
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getGuest_ID() {
        return guest_ID;
    }

    public void setGuest_ID(int guest_ID) {
        this.guest_ID = guest_ID;
    }

    public int getReservation_ID() {
        return reservation_ID;
    }

    public void setReservation_ID(int reservation_ID) {
        this.reservation_ID = reservation_ID;
    }


    }







