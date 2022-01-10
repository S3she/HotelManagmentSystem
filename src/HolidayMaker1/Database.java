package HolidayMaker1;

import java.sql.*;
import java.util.ArrayList;

import static javax.swing.UIManager.getInt;
import static javax.swing.UIManager.getString;

public class Database {

    Connection conn = null;
    Menu menu = new Menu();

    public Database() {

        connect();
    }

    public void connect() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:booking.db");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public ArrayList<Guest> getPersonData() {
        ArrayList<Guest> persons = new ArrayList<Guest>();
        String query = "SELECT * FROM guest";

        try {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("Guest_ID");
                String firstName = rs.getString("First_Name");
                String lastName = rs.getString("Last_Name");
                persons.add(new Guest(id, firstName, lastName));

            }
            for (Guest p : persons) {
                p.getInfo();
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return persons;
    }


}



