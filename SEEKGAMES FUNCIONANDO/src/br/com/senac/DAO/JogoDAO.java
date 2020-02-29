package br.com.senac.DAO;
import br.com.senac.model.entidade.jogo;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class JogoDAO extends Conexao{
    
    public List<jogo> listar(String nomePesquisa){
       List<jogo> lista = new ArrayList<jogo>();
       try{
           String sql = "SELECT * FROM jogo where nome like ?";
           PreparedStatement ps = getConexao().prepareStatement(sql);
           ps.setString(1,"%"+nomePesquisa+"%");
           ResultSet rs = ps.executeQuery();
           jogo j;
           while(rs.next()){
              j = new jogo();
              j.setId(rs.getInt("jogo_id"));
              j.setNome(rs.getString("nome"));
              j.setPlataforma(rs.getString("plataforma"));
              j.setDesenvolvedora(rs.getString("desenvolvedora"));
              j.setSituacao(rs.getString("situacao"));
              j.setIdadeRecomendada(rs.getInt("idadeRecomendada"));
              j.setPreco(rs.getDouble("preco"));
              lista.add(j);
           }           
       }catch(SQLException e){
           e.printStackTrace();
       }finally{
           fecharConexao();
       }
       return lista;
  }
        public void incluir(jogo j){
       try{
       String sql = "insert into jogo (nome, plataforma, desenvolvedora,situacao,idadeRecomendada,preco)"+ "values (?,?,?,?,?,?)";
       PreparedStatement ps = getConexao().prepareStatement(sql);
       ps.setString(1, j.getNome());
       ps.setString(2, j.getPlataforma());
       ps.setString(3, j.getDesenvolvedora());
       ps.setString(4, j.getSituacao());
       ps.setInt(5, j.getIdadeRecomendada());
       ps.setDouble(6, j.getPreco());
       ps.execute();
       ps.close();
       }catch(SQLException ex){
          ex.printStackTrace();
       }finally{
           fecharConexao();
       }
    }
   
    public jogo buscar(int id) {
        jogo j = new jogo();
        try {
            String sql = "SELECT * FROM jogo where jogo_id = ?";
            PreparedStatement ps = getConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
              j.setId(rs.getInt("jogo_id"));
              j.setNome(rs.getString("nome"));
              j.setPlataforma(rs.getString("plataforma"));
              j.setDesenvolvedora(rs.getString("desenvolvedora"));
              j.setSituacao(rs.getString("situacao"));
              j.setIdadeRecomendada(rs.getInt("idadeRecomendada"));
              j.setPreco(rs.getDouble("preco"));
            }       
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }       
        return j;
    }
    
    public void alterar(jogo j){
     try {
            String sql = "update jogo set "
                    + " nome = ?, "
                    + " plataforma = ?, "
                    + " desenvolvedora = ?, "
                    + " situacao = ?, "
                    + " idadeRecomendada = ?, "
                    + " preco = ? "
                    + " where jogo_id = ?";

            PreparedStatement ps = getConexao()
            .prepareStatement(sql);
            ps.setInt(1, j.getId());
            ps.setString(2, j.getNome());
            ps.setString(3, j.getPlataforma());
            ps.setString(4, j.getDesenvolvedora());
            ps.setString(5, j.getSituacao());
            ps.setInt(6, j.getIdadeRecomendada());
            ps.setDouble(7, j.getPreco()); 
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
        String sql = "delete from jogo where jogo_id = ?";
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
