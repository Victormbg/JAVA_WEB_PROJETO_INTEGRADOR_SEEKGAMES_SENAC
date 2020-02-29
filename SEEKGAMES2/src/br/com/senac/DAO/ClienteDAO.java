package br.com.senac.DAO;
import br.com.senac.model.entidade.cliente;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO extends Conexao{
    
    public List<cliente> listar(String nomePesquisa){
       List<cliente> lista = new ArrayList<cliente>();
       try{
           String sql = "SELECT * FROM aluno al"+
                   " inner join pessoa p"+
                   " on al.id = p.id"+
                   " where p.nome like ?";
           PreparedStatement ps = getConexao().prepareStatement(sql);
           ps.setString(1,"%"+nomePesquisa+"%");
           ResultSet rs = ps.executeQuery();
           cliente c;
           while(rs.next()){
              c = new cliente();
              c.setId(rs.getInt("id"));
              c.setCPF(rs.getString("cpf"));
              c.setNome(rs.getString("nome"));
              c.setSexo(rs.getString("sexo"));
              
              lista.add(c);
           }
           
       }catch(SQLException e){
           e.printStackTrace();
       }finally{
           fecharConexao();
       }
       return lista;
  }
        public void incluir(cliente c){
       try{
       String sql = "insert cliente (nome, cpf, sexo)"+ "values (?, ?, ?)";
       PreparedStatement ps = getConexao().prepareStatement(sql);
       ps.setString(1, c.getNome());
       ps.setString(2, c.getCPF());
       ps.execute();
       ps.close();
       
       String sql2 = "select max(id) from cliente";
       ps = getConexao().prepareStatement(sql2);
       ResultSet rs = ps.executeQuery();
       rs.first();
       int id = rs.getInt(1);
       ps.close();
       String sql3 = "insert into aluno (id,nome, cpf, sexo)"+"values(?,?,?,?)";
       ps = getConexao().prepareStatement(sql3);
       ps.setInt(1, c.getId());
       ps.setString(2, c.getNome());
       ps.setString(2, c.getCPF());
       ps.setString(2, c.getSexo());       
       ps.execute();
       ps.close();
       }catch(SQLException ex){
          ex.printStackTrace();
       }finally{
           fecharConexao();
       }
   }
   
    public cliente buscar(int id) {
        cliente c = new cliente ();
        
        try {
            String sql = "SELECT * FROM aluno al"
                         + " inner join pessoa p"
                         + " on al.id = p.id"
                         + " where p.id = ?";
            PreparedStatement ps = getConexao()
                    .prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
               c.setId(rs.getInt("id"));
               c.setNome(rs.getString("nome"));
               c.setCPF(rs.getString("cpf"));
               c.setSexo(rs.getString("sexo"));
            }
       
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }
        
        return c;
    }
    
    public void alterar(cliente c){
     try {
            String sql = "update cliente set "
                    + " nome = ?, "
                    + " endereco = ? "
                    + " where id = ?";

            PreparedStatement ps = getConexao()
                    .prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getCPF());
            ps.setInt(3, c.getId());
            ps.execute();
            ps.close();
            
            sql = "update cliente set "
                    + " cpf = ? "
                    + " where id = ?";
            
            ps = getConexao().prepareStatement(sql);
            ps.setString(1, c.getCPF());
            ps.setInt(2, c.getId());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }   
    }
    public void excluir(int id){
    try{
        String sql = "delete from cliente where id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        ps.execute();
        ps.close();
        
        sql = "delete from cliente where id =?";
        ps = getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        ps.execute();
        ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }     
    }
}
