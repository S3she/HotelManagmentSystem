package HolidayMaker1;

import java.sql.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;

public class Program {

    Connection conn = null;

    public Program() {
        connectToDb();
    }

    void connectToDb() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:booking.db");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Guest> getAllGuests() {

        ArrayList<Guest> guests = new ArrayList<>();
        String query = "SELECT * FROM guest";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String firstName = resultSet.getString("First_Name");
                String lastName = resultSet.getString("Last_Name");
                String phoneNumber = resultSet.getString("Phone_Number");
                String emailAdress = resultSet.getString("Email_Adress");
                String dateOfBirth = resultSet.getString("Date_Of_Birth");
                int guestID = resultSet.getInt("Guest_ID");
                int reservationID = resultSet.getInt("Reservation_ID");


                guests.add(new Guest(firstName, lastName, phoneNumber, emailAdress, dateOfBirth, guestID,
                        reservationID));

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return guests;
    }

    public int createGuest(Guest newGuest) {

        int incrementID = 0;
        String query = "INSERT INTO guest (First_Name, Last_Name, Phone_Number, Email_Adress, Date_Of_Birth) VALUES(?, ?, ?, ?, ?)";


        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, newGuest.getFirst_Name());
            preparedStatement.setString(2, newGuest.getLast_Name());
            preparedStatement.setString(3, newGuest.getPhoneNumber());
            preparedStatement.setString(4, newGuest.getEmail_Adress());
            preparedStatement.setString(5, newGuest.getDate_Of_Birth());

            preparedStatement.executeUpdate();
            ResultSet generatedkeys = preparedStatement.getGeneratedKeys();

            while (generatedkeys.next()) {
                incrementID = generatedkeys.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return incrementID;

    }

}


