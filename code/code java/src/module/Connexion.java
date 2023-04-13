package module;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
	private static Connection con=null;
    private static Connexion c=null;
    private Connexion()
    {
        try {
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ecole", "brahim","Br0633**12");
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
            
    }
    public static Connection getInstance()
    {
        if(c==null) c=new Connexion();
        return con;
    }

   
}
