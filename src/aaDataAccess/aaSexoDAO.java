package aaDataAccess;

import aaDataAccess.aaDTO.aaSexoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
// import Framework.PatException; // Descomenta esto si tienes la clase PatException

public class aaSexoDAO extends aaSQLiteDataHelper implements aaIDAO<aaSexoDTO> {

    @Override
    public aaSexoDTO readBy(Integer id) throws Exception {
        aaSexoDTO oS = new aaSexoDTO();
        String query = " SELECT IdSexo  "
                     + " ,Nombre        "
                     + " ,Estado        "
                     + " ,FechaCrea     "
                     + " ,FechaModifica "
                     + " FROM    SEXO   "
                     + " WHERE   Estado = 'A' AND IdSexo = " + id.toString();
        try {
            Connection conn = openConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                oS = new aaSexoDTO(rs.getInt(1)      // IdSexo
                                  ,rs.getString(2)   // Nombre
                                  ,rs.getString(3)   // Estado
                                  ,rs.getString(4)   // FechaCrea
                                  ,rs.getString(5)); // FechaModifica
            }
        } catch (SQLException e) {
            // throw new PatException(e.getMessage(), getClass().getName(), "readBy()");
            throw e; 
        }
        return oS;
    }

    @Override
    public List<aaSexoDTO> readAll() throws Exception {
        List<aaSexoDTO> lst = new ArrayList<>();
        String query = " SELECT IdSexo "
                     + " ,Nombre     "
                     + " ,Estado     "
                     + " ,FechaCrea  "
                     + " ,FechaModifica "
                     + " FROM    SEXO   "
                     + " WHERE   Estado = 'A' ";

        try {
            Connection conn = openConnection();         // conectar a DB
            Statement stmt = conn.createStatement();    // CRUD : select * ...
            ResultSet rs = stmt.executeQuery(query);    // ejecutar la query
            
            while (rs.next()) {
                aaSexoDTO s = new aaSexoDTO(
                                    rs.getInt(1)        // IdSexo
                                   ,rs.getString(2)     // Nombre
                                   ,rs.getString(3)     // Estado
                                   ,rs.getString(4)     // FechaCrea
                                   ,rs.getString(5));   // FechaModifica
                lst.add(s);
            }
        } catch (SQLException e) {
            // throw new PatException(e.getMessage(), getClass().getName(), "readAll()");
            throw e; // Usamos esto temporalmente si no tienes PatException
        }
        return lst;
    }

    @Override
    public boolean create(aaSexoDTO entity) throws Exception {
        String query = " INSERT INTO SEXO (Nombre) VALUES (?)";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getNombre());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            // throw new PatException(e.getMessage(), getClass().getName(), "create()");
            throw e;
        }
    }

    @Override
    public boolean update(aaSexoDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String query = " UPDATE SEXO SET Nombre = ?, FechaModifica = ? WHERE IdSexo = ?";
        
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getNombre());
            pstmt.setString(2, dtf.format(now).toString());
            pstmt.setInt(3, entity.getIdSexo());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            // throw new PatException(e.getMessage(), getClass().getName(), "update()");
            throw e;
        }
    }

    @Override
    public boolean delete(int id) throws Exception {
        String query = " UPDATE SEXO SET Estado = ? WHERE IdSexo = ?";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "X"); 
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            // throw new PatException(e.getMessage(), getClass().getName(), "delete()");
            throw e;
        }
    }
    

}
