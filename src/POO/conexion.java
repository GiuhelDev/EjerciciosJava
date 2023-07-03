//GIUHEL DEV - HELIO PIZARRO
package POO;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {
    
    Connection con;
    public String db="productos";
    public String url="jdbc:mysql://127.0.0.1/"+db;
    public String user="root";
    public String pass="";
    
    public Connection conectar(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            con=DriverManager.getConnection(this.url, this.user, this.pass);
        }catch (Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return con;
    }
}
