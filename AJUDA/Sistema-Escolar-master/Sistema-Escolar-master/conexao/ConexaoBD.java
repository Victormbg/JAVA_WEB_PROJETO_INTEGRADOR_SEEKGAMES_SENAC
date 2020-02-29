/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifrn.edu.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author neto
 */
public class ConexaoBD {
  public Connection getConnection() {
        Connection Conecxao = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conecxao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancoschoolsystem", "root", "leticia");
                                                 //"jdbc:mysql://192.168.254.1/cpadi?user=root&password=senha"
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Conecxao;
    }

}
