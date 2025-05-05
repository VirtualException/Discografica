/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseDatos;
import aplicacion.Trabajador;
import aplicacion.DatosAdicionalesTrabajadores;
import aplicacion.TipoTrabajador;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author basesdatos
 */
public class DAOTrabajadores extends AbstractDAO {

   public DAOTrabajadores (Connection conexion, aplicacion.FachadaAplicacion fa){
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    public Trabajador validarTrabajador(String usuario, String password){
        Trabajador resultado=null;
        Connection con;
        PreparedStatement stmTrabajador=null;
        ResultSet rsTrabajador;

        con=this.getConexion();

        try {
        stmTrabajador=con.prepareStatement("select pasaporte, nombre, telefono_contacto, email, usuario, password, tipo "+
                                        "from trabajador "+
                                        "where usuario = ? and password = ?");
        stmTrabajador.setString(1, usuario);
        stmTrabajador.setString(2, password);
        rsTrabajador=stmTrabajador.executeQuery();
        if (rsTrabajador.next())
        {
            resultado = new Trabajador(rsTrabajador.getString("pasaporte"), rsTrabajador.getString("nombre"),
                                      rsTrabajador.getString("telefono_contacto"), rsTrabajador.getString("email"),
                                      rsTrabajador.getString("usuario"), rsTrabajador.getString("password"), rsTrabajador.getString("tipo"));

        }
        } catch (SQLException e){
          System.out.println(e.getMessage());
          this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
          try {stmTrabajador.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
        }
        return resultado;
    }
    public List<Trabajador> obtenerTrabajador(String pasaporte, String nombre){
        List<Trabajador> resultado =new ArrayList<Trabajador>();
        Connection con;
        Trabajador trabajadoractual;
        PreparedStatement stmTrabajador=null;
        ResultSet rsTrabajador;
        con=this.getConexion();
        String consulta = "select pasaporte, nombre, telefono_contacto, email, usuario, password, tipo "+
                                        "from trabajador ";
        if(!pasaporte.isEmpty()){
            consulta = consulta + "where pasaporte like '%" + pasaporte +"%'" ;
            if(!nombre.isEmpty()){
                consulta = consulta + "AND nombre like '%" + nombre +"%'" ;
            }
        }else{
            if(!nombre.isEmpty()){
                consulta = consulta + "where nombre like '%" + nombre +"%'" ;
            }
        }
        try{
            stmTrabajador = con.prepareStatement(consulta);
            rsTrabajador = stmTrabajador.executeQuery();
            while(rsTrabajador.next()){
                trabajadoractual = new Trabajador(rsTrabajador.getString("pasaporte"), rsTrabajador.getString("nombre"),
                                      rsTrabajador.getString("telefono_contacto"), rsTrabajador.getString("email"),
                                      rsTrabajador.getString("usuario"), rsTrabajador.getString("password"), rsTrabajador.getString("tipo"));
                resultado.add(trabajadoractual);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
            try{stmTrabajador.close();} catch(SQLException e){System.out.println("Error al cerrar los cursores");}
        }
        return resultado;
    }
    public List<DatosAdicionalesTrabajadores> obtenerotdatos(String pasaporte){
        List<DatosAdicionalesTrabajadores> resultado = new ArrayList<>();
        Connection con;
        DatosAdicionalesTrabajadores otdtrabajador;
        PreparedStatement stmTrabajador = null;
        ResultSet rsTrabajador;

        con = this.getConexion();

        String consulta = 
            "SELECT " +
            "COALESCE(e.ip_registrada, p.ip_registrada) AS ip_registrada, " +
            "a.nombre_artista, " +
            "a.pasaporteM AS pasaporte_manager, " +
            "m.agencia, " +
            "COALESCE(e.afiliacion, p.afiliacion) AS afiliacion, " +
            "g.nombre_grupo " +
            "FROM artista a " +
            "LEFT JOIN manager m ON a.pasaporteM = m.pasaporteM " +
            "LEFT JOIN escritor e ON a.pasaporteA = e.pasaporteE " +
            "LEFT JOIN productor p ON a.pasaporteA = p.pasaporteP " +
            "LEFT JOIN estar_en_grupo eg ON a.pasaporteA = eg.pasaporteA AND eg.fecha_fin IS NULL " +
            "LEFT JOIN grupo g ON eg.nombre_grupo = g.nombre_grupo " +  
            "WHERE a.pasaporteA = ?";  

        try {
            stmTrabajador = con.prepareStatement(consulta);
            stmTrabajador.setString(1, pasaporte); 

            rsTrabajador = stmTrabajador.executeQuery();

        while (rsTrabajador.next()) {
            otdtrabajador = new DatosAdicionalesTrabajadores(
                rsTrabajador.getInt("ip_registrada"),
                rsTrabajador.getString("nombre_artista"),
                rsTrabajador.getString("nombre_grupo"),
                rsTrabajador.getString("pasaporte_manager"),
                rsTrabajador.getString("agencia"),
                rsTrabajador.getString("afiliacion")
            );
            resultado.add(otdtrabajador);
        }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                if (stmTrabajador != null) stmTrabajador.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar los cursores");
            }
        }

        return resultado;
    }
    public List<Trabajador> obtenerManagers(){
        List<Trabajador> resultado =new ArrayList<Trabajador>();
        Connection con;
        Trabajador trabajadoractual;
        PreparedStatement stmTrabajador=null;
        ResultSet rsTrabajador;
        con=this.getConexion();
        String consulta = "select pasaporte, nombre, telefono_contacto, email, usuario, password, tipo "+
                                        "from trabajador ";
        
        consulta = consulta + "where tipo like 'Manager'" ;
            
        try{
            stmTrabajador = con.prepareStatement(consulta);
            rsTrabajador = stmTrabajador.executeQuery();
            while(rsTrabajador.next()){
                trabajadoractual = new Trabajador(rsTrabajador.getString("pasaporte"), rsTrabajador.getString("nombre"),
                                      rsTrabajador.getString("telefono_contacto"), rsTrabajador.getString("email"),
                                      rsTrabajador.getString("usuario"), rsTrabajador.getString("password"), rsTrabajador.getString("tipo"));
                resultado.add(trabajadoractual);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally{
            try{stmTrabajador.close();} catch(SQLException e){System.out.println("Error al cerrar los cursores");}
        }
        return resultado;
    }
    public void borrarTrabajador(String pasaporte, String nombre){
        List<Trabajador> listatrabajadores = obtenerTrabajador(pasaporte, nombre);
        Connection con;
        Trabajador trabajadoractual;
        PreparedStatement stmTrabajador=null;
        ResultSet rsTrabajador;
        con=this.getConexion();
        
        try{
           stmTrabajador = con.prepareStatement("delete from trabajador where pasaporte = ? and nombre = ?");
           stmTrabajador.setString(1, pasaporte);
           stmTrabajador.setString(2, nombre);
           stmTrabajador.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try {
                stmTrabajador.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar los cursores");
            }
        }
        
    }
    public void anadirNuevoTrabajador(String pasaporte, String nombre, String contacto, String email, String user, String password, String tipo, String afiliacion, String agencia, String nombrear, String grupo, String pasaporteM){
        List<Trabajador> resultado =new ArrayList<Trabajador>();
        Connection con;
        Trabajador trabajadoractual;
        PreparedStatement stmTrabajador=null;
        ResultSet rsTrabajador;
        con=this.getConexion();
        
        try{
           stmTrabajador = con.prepareStatement("insert into trabajador (pasaporte, nombre, telefono_contacto, email, usuario, password, tipo)" + "values(?,?,?,?,?,?,?)");
           stmTrabajador.setString(1, pasaporte);
           stmTrabajador.setString(2, nombre);
           stmTrabajador.setString(3, contacto);
           stmTrabajador.setString(4, email);
           stmTrabajador.setString(5, user);
           stmTrabajador.setString(6, password);
           stmTrabajador.setString(7, tipo);
           stmTrabajador.executeUpdate();
           stmTrabajador.close();
           if(TipoTrabajador.valueOf(tipo) == TipoTrabajador.Artista){
               stmTrabajador = con.prepareStatement("insert into artista (pasaporteA, pasaporteM, nombre_artista)" + "values(?,?,?)"); 
               stmTrabajador.setString(1, pasaporte);
               stmTrabajador.setString(2, pasaporteM);
               stmTrabajador.setString(3, nombrear);
               stmTrabajador.executeUpdate();
           }else if(TipoTrabajador.valueOf(tipo) == TipoTrabajador.Escritor){
               stmTrabajador = con.prepareStatement("insert into escritor (pasaporteE, afiliacion)" + "values(?,?)"); 
               stmTrabajador.setString(1, pasaporte);
               stmTrabajador.setString(2, afiliacion);
               stmTrabajador.executeUpdate();
               stmTrabajador = con.prepareStatement("insert into estar_en_grupo (pasaporteA, nombre_grupo, fecha_inicio, fecha_fin)" + "values(?,?, CURRENT_DATE, NULL)"); 
               stmTrabajador.setString(1, pasaporte);
               stmTrabajador.setString(2, grupo);
           }else if(TipoTrabajador.valueOf(tipo) == TipoTrabajador.Manager){
               stmTrabajador = con.prepareStatement("insert into manager (pasaporteM, agencia)" + "values(?,?)"); 
               stmTrabajador.setString(1, pasaporte);
               stmTrabajador.setString(2, agencia);
               stmTrabajador.executeUpdate();
           }else if(TipoTrabajador.valueOf(tipo) == TipoTrabajador.Productor){
               stmTrabajador = con.prepareStatement("insert into productor (pasaporteP, afiliacion)" + "values(?,?)"); 
               stmTrabajador.setString(1, pasaporte);
               stmTrabajador.setString(2, afiliacion);
               stmTrabajador.executeUpdate();
           }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try {
                stmTrabajador.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar los cursores");
            }
        }
    }    
    public void actualizarTrabajador(String pasaporte, String nombre, String contacto, String email, String user, String password, String tipo, String afiliacion, String agencia, String nombrear, String grupo, String pasaporteM){
        Connection con;
        PreparedStatement stmTrabajador = null;

        con = this.getConexion();

        try {
        
            stmTrabajador = con.prepareStatement("UPDATE trabajador SET nombre = ?, telefono_contacto = ?, email = ?, usuario = ?, password = ?, tipo = ? WHERE pasaporte = ?");
        stmTrabajador.setString(1, nombre);
        stmTrabajador.setString(2, contacto);
        stmTrabajador.setString(3, email);
        stmTrabajador.setString(4, user);
        stmTrabajador.setString(5, password);
        stmTrabajador.setString(6, tipo);
        stmTrabajador.setString(7, pasaporte);
        stmTrabajador.executeUpdate();

        
        stmTrabajador.close();

        
        if (TipoTrabajador.valueOf(tipo) == TipoTrabajador.Artista) {
            stmTrabajador = con.prepareStatement(
                "UPDATE artista SET pasaporteM = ?, nombre_artista = ? WHERE pasaporteA = ?"
            );
            stmTrabajador.setString(1, pasaporteM);
            stmTrabajador.setString(2, nombrear);
            stmTrabajador.setString(3, pasaporte);
            stmTrabajador.executeUpdate();

        } else if (TipoTrabajador.valueOf(tipo) == TipoTrabajador.Escritor) {
            stmTrabajador.close();
            stmTrabajador = con.prepareStatement(
                "UPDATE escritor SET afiliacion = ? WHERE pasaporteE = ?"
            );
            stmTrabajador.setString(1, afiliacion);
            stmTrabajador.setString(2, pasaporte);
            stmTrabajador.executeUpdate();

            
            stmTrabajador.close();
            stmTrabajador = con.prepareStatement(
                "UPDATE estar_en_grupo SET nombre_grupo = ? WHERE pasaporteA = ? AND fecha_fin IS NULL"
            );
            stmTrabajador.setString(1, grupo);
            stmTrabajador.setString(2, pasaporte);
            int updated = stmTrabajador.executeUpdate();

            
            if (updated == 0) {
                stmTrabajador.close();
                stmTrabajador = con.prepareStatement(
                    "INSERT INTO estar_en_grupo (pasaporteA, nombre_grupo, fecha_inicio, fecha_fin) VALUES (?, ?, CURRENT_DATE, NULL)"
                );
                stmTrabajador.setString(1, pasaporte);
                stmTrabajador.setString(2, grupo);
                stmTrabajador.executeUpdate();
            }

        } else if (TipoTrabajador.valueOf(tipo) == TipoTrabajador.Manager) {
            stmTrabajador.close();
            stmTrabajador = con.prepareStatement(
                "UPDATE manager SET agencia = ? WHERE pasaporteM = ?"
            );
            stmTrabajador.setString(1, agencia);
            stmTrabajador.setString(2, pasaporte);
            stmTrabajador.executeUpdate();

        } else if (TipoTrabajador.valueOf(tipo) == TipoTrabajador.Productor) {
            stmTrabajador.close();
            stmTrabajador = con.prepareStatement(
                "UPDATE productor SET afiliacion = ? WHERE pasaporteP = ?"
            );
            stmTrabajador.setString(1, afiliacion);
            stmTrabajador.setString(2, pasaporte);
            stmTrabajador.executeUpdate();
        }

    } catch (SQLException e) {
        System.out.println("Error actualizando trabajador: " + e.getMessage());
        this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
    } finally {
        try {
            if (stmTrabajador != null) stmTrabajador.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar el statement");
        }
    }
    }
    
}
