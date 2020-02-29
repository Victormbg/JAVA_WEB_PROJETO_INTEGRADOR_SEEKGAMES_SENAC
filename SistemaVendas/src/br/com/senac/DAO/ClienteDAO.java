package br.com.senac.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class ClienteDAO {

    private int id;
    private String Nome;
    private String CPF;
    private String sexo;

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return Idade;
    }
    private int Idade;
    private String DataNascimento;
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }
    
        public boolean inserir() {
        Conexao c = new Conexao();
        Boolean controle = false;
        try {
            String sql = "INSERT INTO Fisica VALUES (NULL, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = c.getConn().prepareStatement(sql);
            statement.setString(1, this.getCpf());
            statement.setString(2, this.getNome());
            statement.setInt(3, this.getIdade());
            statement.setDouble(4, this.getAltura());
            statement.setDouble(5, this.getPeso());
            statement.setString(6, this.getSexo().toString());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                controle = true;
            } else {
                controle = false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            c.fechar();
        }
        return controle;
    }
    
    public boolean alterar() {
        Conexao c = new Conexao();
        Boolean controle = false;
        try {
            String sql = "UPDATE cliente SET cpf = ?, nome = ?, idade = ?, sexo = ? WHERE id = ?";
            PreparedStatement statement = c.getConn().prepareStatement(sql);
            statement.setString(1, this.getCpf());
            statement.setString(2, this.getNome());
            statement.setInt(3, this.getIdade());
            statement.setDouble(4, this.getAltura());
            statement.setDouble(5, this.getPeso());
            statement.setString(6, this.getSexo().toString());
            statement.setInt(7, this.getId());
            int rowsUpdate = statement.executeUpdate();
            if (rowsUpdate > 0) {
                controle = true;
            } else {
                controle = false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         finally {
            c.fechar();
        }
        return controle;
    }
    
    public boolean excluir() {
        Conexao c = new Conexao();
        Boolean controle = false;
        try {
            String sql = "DELETE FROM Fisica WHERE id = ?";
            PreparedStatement statement = c.getConn().prepareStatement(sql);
            statement.setInt(1, this.getId());
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                controle = true;
            } else {
                controle = false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         finally {
            c.fechar();
        }
        return controle;
    }
    
    public void consultar() {
        Conexao c = new Conexao();
        Boolean controle = false;
        try {
            String sql = "SELECT * FROM Fisica WHERE id = ?";
            PreparedStatement statement = c.getConn().prepareStatement(sql);
            statement.setInt(1, this.getId());
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                this.setId(result.getInt("id"));
                this.setNome(result.getString("nome"));
                this.setCpf(result.getString("cpf"));
                this.setIdade(result.getInt("idade"));
                this.setAltura(result.getDouble("altura"));
                this.setPeso(result.getDouble("peso"));
                this.setSexo(TipoSexo.valueOf(result.getString("sexo")));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         finally {
            c.fechar();
        }
    }
    
    public ArrayList<ClienteDAO> listar() {
        Conexao c = new Conexao();
        Boolean controle = false;
        ArrayList<ClienteDAO> lc = new ArrayList<ClienteDAO>();
        try {
            String sql = "SELECT * FROM cliente";
            PreparedStatement statement = c.getConn().prepareStatement(sql);
        ResultSet result = statement.executeQuery();
            while (result.next()) {
                ClienteDAO c = new ClienteDAO();
                c.setId(result.getInt("id"));
                c.setNome(result.getString("nome"));
                c.setCpf(result.getString("cpf"));
                c.setIdade(result.getInt("idade"));
                c.setSexo(result.getString("sexo")));
                lc.add(c);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         finally {
            c.fechar();
        }
        return lc;
    }
}
