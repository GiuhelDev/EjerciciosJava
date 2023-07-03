
package POO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DaoProducto {
    
    Connection con;
    conexion cn=new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List Listar(){
        List<productos> lista=new ArrayList<>();
        String sql="select * from producto";
        try{
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                productos p=new productos();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setCantidad(rs.getInt(4));
                lista.add(p);
            }
        }catch (Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return lista;
    }
}
