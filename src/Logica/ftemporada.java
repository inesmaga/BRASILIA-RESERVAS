/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.vtemporada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author inesm
 */
public class ftemporada {
	 private final  Conexion mysql=new Conexion();
    private final Connection  cn= mysql.conectar();
    private String sSQL="";
    
    
    public DefaultTableModel mostrar(String buscar){
    DefaultTableModel modelo;
    String [] titulos={"ID","Periodo(Mes)","Temporada"};
    String [] registro = new String[3];
   
    modelo = new DefaultTableModel(null,titulos);
    sSQL="select * from temporada where periodotemp like '%"+buscar+"%' order by  idtemporada";
    
        try {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            while(rs.next()){
            registro[0]=rs.getString("idtemporada");
            registro[1]=rs.getString("periodotemp");
            registro[2]=rs.getString("temporada");
            
            modelo.addRow(registro);
                   
            }
            return modelo;
            
                    } catch (SQLException e) {
                        JOptionPane.showConfirmDialog(null, e);
                        return null;
        }
    }
    public boolean insertar(vtemporada dts){
    sSQL="insert into temporada(periodotemporada,temporada)values(?,?)";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            
            pst.setInt(1,dts.getPeriodotemp());
            pst.setString(2,dts.getTemporada());
          
            int n=pst.executeUpdate();
            
            if (n==0) {
               return false;
            }
               
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        return true;
    }    
       
     public boolean editar(vtemporada dts){
    sSQL="update temporada set periodotemp=?,temporada=?"
            +  " where idtemporada=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getPeriodotemp());
            pst.setString(2, dts.getTemporada());
           pst.setInt(3, dts.getIdtemporada());
             
              int n=pst.executeUpdate();
              
       if(n==0){
           return false;
       }
       
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        return true;
     } 
         public String busctemp(Integer nu) {

        sSQL = "select temporada  from temporada where periodotemp like '%" + nu + "%'  ";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
              String ned = rs.getString("temporada");
                return ned;

            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
          
        }

   return "";  
}
}
