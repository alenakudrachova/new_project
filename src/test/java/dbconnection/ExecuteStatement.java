package dbconnection;

import lombok.SneakyThrows;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecuteStatement extends DBConnector{

    @SneakyThrows
    public static ResultSet getDataFromTable(String tableName) {
        String query = "SELECT * FROM sys.test_table;";
        ResultSet result = statement.executeQuery(query);
        return result;
    }

    @SneakyThrows
    public static void addPosition() {
        String query = "INSERT INTO sys.test_table (id, position, team) VALUES (6, 'QA', 'CreditPlus UA');";
        statement.executeUpdate(query);
    }

    public static void main(String[] args) throws SQLException {
        connect();
        addPosition();
        ResultSet results = getDataFromTable("sys.test_table");
        while (results.next()) {
           System.out.println(results.getInt("id") + " " + results.getString("position") + " " + results.getString("team"));
        }
        closeConnection();
    }
}