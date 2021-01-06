package az.charming.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLConnect {

    public static void connect(){
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String host = "sql7.freemysqlhosting.net";
            String port = "3306";
            String db = "sql7385467";
            String username = "sql7385467";
            String password = "n98WRBZsPf";
            String connUrl = String.format("jdbc:mysql://%s:%s/%s", host, port, db);
            Connection con = DriverManager.getConnection(connUrl,username,password);
            System.out.println("Connected");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
