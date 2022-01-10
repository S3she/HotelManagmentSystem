package HolidayMaker1;

public class Guest {

    String firstName;
    String lastName;
    int id;

    public Guest(int id, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    void getInfo() {
        System.out.println("id " + id + " FirstName " + firstName + " LastName " + lastName);
    }
}

