package br.com.senac.DAO;

import java.sql.*;

import java.sql.SQLException;
import java.util.ArrayList;



public  class ClienteDAO {
    //String Statement=null;
   
    private int id;
    private String Nome;
    private String CPF;
    private String sexo;
    private int idade;
    
     /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
        public boolean inserir() {
        Conexao c = new Conexao();
        boolean controle = false;
        try {
            String sql = "insert into cliente(cpf,nome,idade,sexo) values(?,?,?,?)";
            PreparedStatement statement = c.getConn().prepareStatement(sql);
            statement.setString(1, this.getCPF());
            statement.setString(2, this.getNome());
            statement.setInt(3, this.getIdade());
            statement.setString(4, this.getSexo());
            int colunas=statement.executeUpdate();
            if(colunas>0){
                controle=true;
            }else{
                 controle=false;
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
            statement.setString(1, this.getCPF());
            statement.setString(2, this.getNome());
            statement.setInt(3, this.getId());
            statement.setString(4, this.getSexo());
           
            
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
            String sql = "DELETE FROM cliente WHERE id = ?";
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
            String sql = "SELECT * FROM cliente WHERE cpf = ?";
            PreparedStatement statement = c.getConn().prepareStatement(sql);
            statement.setString(1, this.getCPF());
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                this.setId(result.getInt("id"));
                this.setNome(result.getString("nome"));
                this.setCPF(result.getString("cpf"));
                this.setIdade(result.getInt("idade"));
                this.setSexo(result.getString("sexo"));
                
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
                ClienteDAO cd = new ClienteDAO() {};
                cd.setId(result.getInt("id"));
                cd.setNome(result.getString("nome"));
                cd.setCPF(result.getString("cpf"));
                cd.setIdade(result.getInt("idade"));
                lc.add(cd);
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
