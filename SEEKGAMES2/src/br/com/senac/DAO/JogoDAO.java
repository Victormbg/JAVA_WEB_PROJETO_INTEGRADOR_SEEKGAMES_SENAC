package br.com.senac.DAO;
import br.com.senac.model.entidade.cliente;
import br.com.senac.model.entidade.jogo;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class JogoDAO extends Conexao{
    
    public List<jogo> listar(String nomePesquisa){
       List<jogo> lista = new ArrayList<jogo>();
       try{
           String sql = "SELECT * FROM aluno al"+
                   " inner join pessoa p"+
                   " on al.id = p.id"+
                   " where p.nome like ?";
           PreparedStatement ps = getConexao().prepareStatement(sql);
           ps.setString(1,"%"+nomePesquisa+"%");
           ResultSet rs = ps.executeQuery();
           jogo j;
           while(rs.next()){
              j = new jogo();
              j.setId(rs.getInt("id"));
              j.setNome(rs.getString("nome"));
              j.setPlataforma(rs.getString("plataforma"));
              j.setDesenvolvedora(rs.getString("desenvolvedora"));
              j.setGrupo(rs.getString("grupo"));
              j.setSituacao(rs.getString("situacao"));
              j.setIdadeRecomendada(rs.getInt("idadeRecomendada"));
              j.setPreco(rs.getInt("preco"));
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
       String sql = "insert jogo (nome, cpf, sexo)"+ "values (?, ?, ?)";
       PreparedStatement ps = getConexao().prepareStatement(sql);
       ps.setString(1, j.getNome());
       ps.setString(2, j.getPlataforma());
       ps.setString(3, j.getDesenvolvedora());
       ps.setString(4, j.getGrupo());
       ps.setString(5, j.getSituacao());
       ps.setInt(6, j.getIdadeRecomendada());
       ps.setInt(7, j.getPreco());
       
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
       ps.setInt(1, j.getId());
       ps.setString(2, j.getNome());
       ps.setString(3, j.getPlataforma());
       ps.setString(4, j.getDesenvolvedora());
       ps.setString(5, j.getGrupo());
       ps.setString(6, j.getSituacao());
       ps.setInt(7, j.getIdadeRecomendada());
       ps.setInt(8, j.getPreco());     
       ps.execute();
       ps.close();
       }catch(SQLException ex){
          ex.printStackTrace();
       }finally{
           fecharConexao();
       }
   }
   
    public jogo buscar(int id) {
        jogo j = new jogo ();
        
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
              j.setId(rs.getInt("id"));
              j.setNome(rs.getString("nome"));
              j.setPlataforma(rs.getString("plataforma"));
              j.setDesenvolvedora(rs.getString("desenvolvedora"));
              j.setGrupo(rs.getString("grupo"));
              j.setSituacao(rs.getString("situacao"));
              j.setIdadeRecomendada(rs.getInt("idadeRecomendada"));
              j.setPreco(rs.getInt("preco"));
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
            String sql = "update cliente set "
                    + " nome = ?, "
                    + " endereco = ? "
                    + " where id = ?";

            PreparedStatement ps = getConexao()
            .prepareStatement(sql);
            ps.setInt(1, j.getId());
            ps.setString(2, j.getNome());
            ps.setString(3, j.getPlataforma());
            ps.setString(4, j.getDesenvolvedora());
            ps.setString(5, j.getGrupo());
            ps.setString(6, j.getSituacao());
            ps.setInt(7, j.getIdadeRecomendada());
            ps.setInt(8, j.getPreco()); 
            ps.execute();
            ps.close();
            
            sql = "update cliente set "
                    + " where id = ?";
            
            ps = getConexao().prepareStatement(sql);
            ps.setInt(1, j.getId());
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
        String sql = "delete from jogo where id = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        ps.execute();
        ps.close();
        
        sql = "delete from jogo where id =?";
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
