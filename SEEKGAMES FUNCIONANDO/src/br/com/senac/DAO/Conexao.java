package br.com.senac.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    private Connection con;
    
    public Connection getConexao(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager
                         .getConnection("jdbc:mysql://localhost/seekgames",
                                        "root",
                                        "");
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro Cmdo SQL " +
                        ex.getMessage()
                         );
        } catch (ClassNotFoundException ex) {
                 JOptionPane.showMessageDialog(null, "Driver não Encontrado " 
                         + ex.getMessage() );
        }
        
        return con;
    }
    
    public void fecharConexao(){
       try{
        con.close();   
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Erro "+ex.getMessage());
       }
    }
}