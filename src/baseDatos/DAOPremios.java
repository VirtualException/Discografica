/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseDatos;
import aplicacion.Premiacion;
import aplicacion.Premio;
import java.time.LocalDate;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author basesdatos
 */
public class DAOPremios extends AbstractDAO {

   public DAOPremios (Connection conexion, aplicacion.FachadaAplicacion fa){
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    
    public List<Premiacion> obtenerPremio(String nombre, String institucion){
        List<Premiacion> resultado =new ArrayList<Premiacion>();
        Connection con;
        Premiacion premiacionact;
        PreparedStatement stmPremiacion=null;
        ResultSet rsPremiacion;
        con=this.getConexion();
        String consulta = "SELECT " +
        "p.nombre AS nombre_premio, " +
        "p.institucion, " +
        "pc.fecha_premiacion, " +
        "c.titulo AS nombre_cancion, " +
        "NULL AS nombre_album " +
        "FROM premiar_cancion pc " +
        "JOIN premio p ON pc.nombre_premio = p.nombre " +
        "JOIN cancion c ON pc.ISWC = c.ISWC AND pc.id_album = c.id_album ";
        if(!nombre.isEmpty()){
            consulta = consulta + "where p.nombre like '%" + nombre +"%'" ;
            if(!institucion.isEmpty()){
                consulta = consulta + "AND p.institucion like '%" + institucion +"%'" ;
            }
        }else{
            if(!institucion.isEmpty()){
                consulta = consulta + "where p.institucion like '%" + institucion +"%'" ;
            }
        }
        consulta = consulta + "UNION " +
            "SELECT " +
            "p.nombre AS nombre_premio, " +
            "p.institucion, " +
            "pa.fecha_premiacion, " +
            "NULL AS nombre_cancion, " +
            "a.nombre AS nombre_album " +
            "FROM premiar_album pa " +
            "JOIN premio p ON pa.nombre_premio = p.nombre " +
            "JOIN album a ON pa.id_album = a.id_album " ;
        if(!nombre.isEmpty()){
            consulta = consulta + "where p.nombre like '%" + nombre +"%'" ;
            if(!institucion.isEmpty()){
                consulta = consulta + "AND p.institucion like '%" + institucion +"%'" ;
            }
        }else{
            if(!institucion.isEmpty()){
                consulta = consulta + "where p.institucion like '%" + institucion +"%'" ;
            }
        }
        try{
            stmPremiacion = con.prepareStatement(consulta);
            rsPremiacion = stmPremiacion.executeQuery();
            while(rsPremiacion.next()){
                String nombreCancion = rsPremiacion.getString("nombre_cancion");
                String nombreAlbum = rsPremiacion.getString("nombre_album");
                Premio premio = new Premio(rsPremiacion.getString("nombre_premio"), rsPremiacion.getString("institucion"));
                LocalDate fecha = rsPremiacion.getDate("fecha_premiacion").toLocalDate();

                resultado.add(new Premiacion(premio, nombreCancion, nombreAlbum, fecha));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
            try{stmPremiacion.close();} catch(SQLException e){System.out.println("Error al cerrar los cursores");}
        }
        return resultado;
    }
    public void anadirPremio(String nombre, String institucion, LocalDate fecha, int tipoPremio, String nombrealbcan){
        List<Premiacion> resultado =new ArrayList<Premiacion>();
        Connection con;
        Premiacion premioactual;
        PreparedStatement stmPremiacion=null;
        ResultSet rsPremiacion;
        con=this.getConexion();
        try{
           stmPremiacion = con.prepareStatement("insert into premio (nombre, institucion)" + "values(?,?)");
           stmPremiacion.setString(1, nombre);
           stmPremiacion.setString(2, institucion);
           stmPremiacion.executeUpdate();
           if(tipoPremio == 0){
               String consulta = "select ISWC, id_album from cancion where titulo like '%" + nombrealbcan + "%'";
               stmPremiacion = con.prepareStatement(consulta);
               rsPremiacion = stmPremiacion.executeQuery();
               while (rsPremiacion.next()){
                   String ISWC = rsPremiacion.getString("ISWC");
                   Integer idalbum = rsPremiacion.getInt("id_album");
                   stmPremiacion = con.prepareStatement("insert into premiar_cancion (ISWC, id_album, nombre_premio, fecha_premiacion)" + "values(?,?,?,?)");
                   stmPremiacion.setString(1, ISWC);
                   stmPremiacion.setInt(2, idalbum);
                   stmPremiacion.setString(3, nombre);
                   stmPremiacion.setDate(4, java.sql.Date.valueOf(fecha));
                   stmPremiacion.executeUpdate();
               }
           }if(tipoPremio == 1){
               String consulta = "select id_album from album where nombre like '%" + nombrealbcan + "%'";
               stmPremiacion = con.prepareStatement(consulta);
               rsPremiacion = stmPremiacion.executeQuery();
               while (rsPremiacion.next()){
                   Integer idalbum = rsPremiacion.getInt("id_album");
                   stmPremiacion = con.prepareStatement("insert into premiar_album (id_album, nombre_premio, fecha_premiacion)" + "values(?,?,?)");
                   stmPremiacion.setInt(1, idalbum);
                   stmPremiacion.setString(2, nombre);
                   stmPremiacion.setDate(3, java.sql.Date.valueOf(fecha));
                   stmPremiacion.executeUpdate();
               }
           }
        }catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
            try{stmPremiacion.close();} catch(SQLException e){System.out.println("Error al cerrar los cursores");}
        }
    }
    public void actualizarPremio(String nombre, String institucion, LocalDate fecha, int tipoPremio, String nombrealbcan){
    Connection con = this.getConexion();
    PreparedStatement stmPremiacion = null;
    ResultSet rsPremiacion;
    
    try {
        // Actualiza tabla 'premio'
        stmPremiacion = con.prepareStatement("UPDATE premio SET institucion = ? WHERE nombre = ?");
        stmPremiacion.setString(1, institucion);
        stmPremiacion.setString(2, nombre);
        stmPremiacion.executeUpdate();

        if (tipoPremio == 0) { // Es canción
            String consulta = "SELECT ISWC, id_album FROM cancion WHERE titulo LIKE ?";
            stmPremiacion = con.prepareStatement(consulta);
            stmPremiacion.setString(1, "%" + nombrealbcan + "%");
            rsPremiacion = stmPremiacion.executeQuery();

            while (rsPremiacion.next()) {
                String ISWC = rsPremiacion.getString("ISWC");
                int idalbum = rsPremiacion.getInt("id_album");

                stmPremiacion = con.prepareStatement(
                    "UPDATE premiar_cancion SET ISWC = ?, id_album = ?, fecha_premiacion = ? WHERE nombre_premio = ?"
                );
                stmPremiacion.setString(1, ISWC);
                stmPremiacion.setInt(2, idalbum);
                stmPremiacion.setDate(3, java.sql.Date.valueOf(fecha));
                stmPremiacion.setString(4, nombre);
                stmPremiacion.executeUpdate();
            }
        } else if (tipoPremio == 1) { // Es álbum
            String consulta = "SELECT id_album FROM album WHERE nombre LIKE ?";
            stmPremiacion = con.prepareStatement(consulta);
            stmPremiacion.setString(1, "%" + nombrealbcan + "%");
            rsPremiacion = stmPremiacion.executeQuery();

            while (rsPremiacion.next()) {
                int idalbum = rsPremiacion.getInt("id_album");

                stmPremiacion = con.prepareStatement(
                    "UPDATE premiar_album SET id_album = ?, fecha_premiacion = ? WHERE nombre_premio = ?"
                );
                stmPremiacion.setInt(1, idalbum);
                stmPremiacion.setDate(2, java.sql.Date.valueOf(fecha));
                stmPremiacion.setString(3, nombre);
                stmPremiacion.executeUpdate();
            }
        }

    } catch (SQLException e) {
        System.out.println(e.getMessage());
        this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
    } finally {
        try { if (stmPremiacion != null) stmPremiacion.close(); } 
        catch (SQLException e) { System.out.println("Error al cerrar los cursores"); }
    }
    }
    public void borrarPremio(String nombre, String institucion){
        List<Premiacion> premios = obtenerPremio(nombre, institucion);
        Connection con;
        Premiacion premio;
        PreparedStatement stmPremiacion=null;
        ResultSet rsTrabajador;
        con=this.getConexion();
        
        try{
           stmPremiacion = con.prepareStatement("delete from premio where nombre = ? and institucion = ?");
           stmPremiacion.setString(1, nombre);
           stmPremiacion.setString(2, institucion);
           stmPremiacion.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try {
                stmPremiacion.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar los cursores");
            }
        }
        
    }
}
