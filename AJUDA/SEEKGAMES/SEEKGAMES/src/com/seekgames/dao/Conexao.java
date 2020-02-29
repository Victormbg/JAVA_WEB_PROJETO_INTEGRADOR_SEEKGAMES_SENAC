package com.seekgames.dao;

import java.sql.*;


public class Conexao {

    private final String USUARIO = "root";
    private final String SENHA = "";
    private final String URL = ("jdbc:mysql://localhost/dbsistemavenda");
    private Connection conexao;

    public Conexao() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            conexao.setAutoCommit(false);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new ClassNotFoundException("O driver de conexão não foi adicionado ao projeto.\n" + e.getMessage());
        } catch (SQLException e) {
            throw new SQLException("Problemas nos parâmetros de conexão.\n" + e.getMessage());
        }
    }

    public Connection getConexao() {
        return conexao;
    }

    public void confirmar() throws SQLException {
        try {
            conexao.commit();
        } catch (SQLException e) {
            throw new SQLException("Problemas na instrução SQL.\n" + e.getMessage());
        } finally {
            conexao.close();
        }
    }
}
