package HolidayMaker1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    Connection conn = null;

    public void connect(){
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:booking.db");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
