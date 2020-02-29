package br.com.senac.aula1;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Fisica extends Pessoa {
    /*
     * Atributos
     */
    private int id;
    private String cpf;
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String sexo;

    /*
     * Encapsulamento
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0 && idade <= 150) {
            this.idade = idade;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura >= 0 && altura <= 3) {
            this.altura = altura;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
            this.sexo = sexo;
    }
    
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
            this.cpf = cpf;
    }
    
    public double calcularImposto(double valorBruto) {
        return valorBruto + ((valorBruto / 100)* 25);
    } 
    
    public boolean inserir() {
        Conexao c = new Conexao();
        Boolean controle = false;
        try {
            String sql = "INSERT INTO fisica (cpf,nome,idade,altura,peso,sexo) VALUES ( ?, ?, ?, ?, ?, ?)";
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
            //ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro"+ex.getMessage());
        } finally {
            c.fechar();
        }
        return controle;
    }
    
    public boolean alterar() {
        Conexao c = new Conexao();
        Boolean controle = false;
        try {
            String sql = "UPDATE Fisica SET cpf = ?, nome = ?, idade = ?, altura = ?, peso = ?, sexo = ? WHERE id = ?";
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
                this.setSexo(result.getString("sexo"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         finally {
            c.fechar();
        }
    }
    
    public ArrayList<Fisica> listar() {
        Conexao c = new Conexao();
        Boolean controle = false;
        ArrayList<Fisica> lf = new ArrayList<Fisica>();
        try {
            String sql = "SELECT * FROM Fisica";
            PreparedStatement statement = c.getConn().prepareStatement(sql);
        ResultSet result = statement.executeQuery();
            while (result.next()) {
                Fisica f = new Fisica();
                f.setId(result.getInt("id"));
                f.setNome(result.getString("nome"));
                f.setCpf(result.getString("cpf"));
                f.setIdade(result.getInt("idade"));
                f.setAltura(result.getDouble("altura"));
                f.setPeso(result.getDouble("peso"));
                f.setSexo(result.getString("sexo"));
                lf.add(f);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         finally {
            c.fechar();
        }
        return lf;
    }

}
