package dk.easv.librarysystem.DAL;
// Java  Imports
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
// Java Imports
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

    private static final String PROP_FILE = "config/config.settings";
    private final SQLServerDataSource dataSource;

    public DBConnection() throws IOException {

        Properties databaseProperties = new Properties();
        databaseProperties.load(new FileInputStream(new File(PROP_FILE)));

        dataSource = new SQLServerDataSource();
        dataSource.setServerName(databaseProperties.getProperty("serverName"));
        dataSource.setDatabaseName(databaseProperties.getProperty("databaseName"));
        dataSource.setUser(databaseProperties.getProperty("user"));
        dataSource.setPassword(databaseProperties.getProperty("password"));
        dataSource.setPortNumber(1433);
        dataSource.setTrustServerCertificate(true);

    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public static void main(String[] args) throws SQLException, IOException {
        DBConnection dbConnection = new DBConnection();

        try(Connection connection = dbConnection.getConnection()) {
            System.out.println("Is it open?" + !connection.isClosed());
        }
        // Connection gets closed here
    }

}
