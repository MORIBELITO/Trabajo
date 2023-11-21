package GUI_MODULO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConexiónSQL {


    public static void main(String[] args) throws ClassNotFoundException, SQLException{
    
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://DESKTOP-UJM8O8I:1433;databaseName=Jonas_bd;user=usuarioSQL;password=321;";
        Connection con = DriverManager.getConnection(connectionURL);
        System.out.println("Nos Conectamos");
        
        //Para la consulta en cuestion
        
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from tblProducto");
        
        while (rs.next()){
         String BCC_Prod = rs.getString(1);
         String Nombre = rs.getString(2);
         String Tipo = rs.getString(3);
         double Precio = rs.getDouble(4);
         int Stock = rs.getInt(5);
         System.out.println(BCC_Prod + " " + Nombre + " " + Tipo + " " + Precio + " " + Stock);
       }
    }
    
    
}