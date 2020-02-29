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
           String sql = "SELECT * FROM cliente where nome like ?";
           PreparedStatement ps = getConexao().prepareStatement(sql);
           ps.setString(1,"%"+nomePesquisa+"%");
           ResultSet rs = ps.executeQuery();
           cliente c;
           while(rs.next()){
              c = new cliente();
              c.setId(rs.getInt("cliente_id"));
              c.setCPF(rs.getString("cpf"));
              c.setNome(rs.getString("nome"));
              c.setTelefone(rs.getString("telefone"));
              c.setRua(rs.getString("rua"));
              c.setBairro(rs.getString("bairro"));
              c.setNumero(rs.getInt("numero"));
              c.setIdade(rs.getInt("idade"));
              c.setPontos(rs.getInt("pontos"));
                           
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
       String sql = "insert into cliente (nome, cpf, idade, telefone, bairro, rua, numero, pontos) values (?,?,?,?,?,?,?,?)";
       PreparedStatement ps = getConexao().prepareStatement(sql);
       ps.setString(1, c.getNome());
       ps.setString(2, c.getCPF());
       ps.setInt(3, c.getIdade());
       ps.setString(4, c.getTelefone());
       ps.setString(5, c.getBairro());
       ps.setString(6, c.getRua());
       ps.setInt(7, c.getNumero());
       ps.setInt(8, c.getPontos());
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
            String sql = "SELECT * FROM cliente where cliente_id = ?";
            PreparedStatement ps = getConexao()
                    .prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
              c.setId(rs.getInt("cliente_id"));
              c.setCPF(rs.getString("cpf"));
              c.setNome(rs.getString("nome"));
              c.setTelefone(rs.getString("telefone"));
              c.setRua(rs.getString("rua"));
              c.setBairro(rs.getString("bairro"));
              c.setNumero(rs.getInt("numero"));
              c.setIdade(rs.getInt("idade"));
              c.setPontos(rs.getInt("pontos"));
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
                    + " cpf = ?, "
                    + " idade = ?, "
                    + " telefone = ?, "
                    + " bairro = ?, "
                    + " rua = ?, "
                    + " numero = ?, "
                    + " pontos = ? "
                    + " where cliente_id = ?";

            PreparedStatement ps = getConexao()
                    .prepareStatement(sql);
            ps.setInt(1, c.getId());
            ps.setString(2, c.getCPF());
            ps.setString(3, c.getNome());
            ps.setString(4, c.getTelefone());
            ps.setString(5, c.getRua());
            ps.setString(6, c.getBairro());
            ps.setInt(7, c.getNumero());
            ps.setInt(8, c.getIdade());
            ps.setInt(9, c.getPontos()); 
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
        String sql = "delete from cliente where cliente_id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
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