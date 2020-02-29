/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.aula1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Juridica extends Pessoa {
    /*
     * Atributos
     */
    private int id;
    private String fantasia;
    private String razaoSocial;
    private String cnpj;
    private Boolean isentoInscricaoEstadual;
    private String inscricaoEstadua;
    private Fisica protprietario;

    /*
     * Encapsulamento
     */
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Boolean getIsentoInscricaoEstadual() {
        return isentoInscricaoEstadual;
    }

    public void setIsentoInscricaoEstadual(Boolean isentoInscricaoEstadual) {
        this.isentoInscricaoEstadual = isentoInscricaoEstadual;
    }

    public String getInscricaoEstadua() {
        return inscricaoEstadua;
    }

    public void setInscricaoEstadua(String inscricaoEstadua) {
        this.inscricaoEstadua = inscricaoEstadua;
    }

    public Fisica getProtprietario() {
        return protprietario;
    }

    public void setProtprietario(Fisica protprietario) {
        this.protprietario = protprietario;
    }
    
    public double calcularImposto(double valorBruto) {
        return valorBruto + ((valorBruto / 100)* 70);
    } 
   
  
    public boolean inserir() {
        Conexao c = new Conexao();
        Boolean controle = false;
        try {
            String sql = "INSERT INTO Juridica VALUES (NULL, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = c.getConn().prepareStatement(sql);
            statement.setInt(1, this.getId());
            statement.setString(2, this.getFantasia());
            statement.setString(3, this.getRazaoSocial());
            statement.setString(4, this.getCnpj());
            statement.setBoolean(5, this.getIsentoInscricaoEstadual());
             statement.setString(6, this.getInscricaoEstadua());
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
            String sql = "UPDATE Fisica SET cpf = ?, nome = ?, idade = ?, altura = ?, peso = ?, sexo = ? WHERE id = ?";
            PreparedStatement statement = c.getConn().prepareStatement(sql);
            statement.setInt(1, this.getId());
            statement.setString(2, this.getFantasia());
            statement.setString(3, this.getRazaoSocial());
            statement.setString(4, this.getCnpj());
            statement.setBoolean(5, this.getIsentoInscricaoEstadual());
            statement.setString(6, this.getInscricaoEstadua());
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
            String sql = "DELETE FROM Juridica WHERE id = ?";
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
            String sql = "SELECT * FROM Juridia WHERE id = ?";
            PreparedStatement statement = c.getConn().prepareStatement(sql);
            statement.setInt(1, this.getId());
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                this.setId(result.getInt("id"));
                this.setFantasia(result.getString("fantasia"));
                this.setRazaoSocial(result.getString("razaoSocial"));
                this.setCnpj(result.getString("cnpj"));
                this.setInscricaoEstadua(result.getString("insentoInscicaoEstadual"));
                this.setInscricaoEstadua(result.getString("inscricaoEstadua"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         finally {
            c.fechar();
        }
    }
    
    public ArrayList<Juridica> listar() {
        Conexao c = new Conexao();
        Boolean controle = false;
        ArrayList<Juridica> lj = new ArrayList<Juridica>();
        try {
            String sql = "SELECT * FROM Juridica";
            PreparedStatement statement = c.getConn().prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                Juridica j = new Juridica();
                j.setId(result.getInt("id"));
                j.setFantasia(result.getString("fantasia"));
                j.setRazaoSocial(result.getString("razaoSocial"));
                j.setCnpj(result.getString("cnpj"));
                j.setIsentoInscricaoEstadual(result.getBoolean("insentoInscricaoEstadual"));
                j.setInscricaoEstadua(result.getString("inscricaoEstadua"));
                lj.add(j);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         finally {
            c.fechar();
        }
        return lj;
      
    }

    public String getIscricaoEstadual() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getIsentoInscicaoEstadual() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
    

