
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
    
    public boolean insertar (productos dts){
        String sql="insert into producto(nombre,precio,cantidad) values(?,?,?)";
        try {
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, dts.getNombre());
            ps.setDouble(2, dts.getPrecio());
            ps.setInt(3, dts.getCantidad());
            int n=ps.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,e);
            return false;
        }
    }
    public boolean editar (productos p){
       String sql="update producto set nombre=?,precio=?,cantidad=?"+
                " where id=?";
        try {
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setDouble(2, p.getPrecio());
            ps.setInt(3, p.getCantidad());
            ps.setInt(4, p.getId());
            int n=ps.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,e);
            return false;
        }
    }
    public void bucar (productos p){
       String sql="select * from producto where id=?";
        try {
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, p.getId());
            rs=ps.executeQuery();
            if(rs.next()){
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setCantidad(rs.getInt(4));
            }else{
                JOptionPane.showMessageDialog(null, "No"
                        + "exite el producto");
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,e);
        }
    }
    public boolean eliminar (productos p){
        String sql = "delete from producto where id=?";
        try {
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, p.getId());
            int n=ps.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,e);
            return false;
        }
        
    }
}
