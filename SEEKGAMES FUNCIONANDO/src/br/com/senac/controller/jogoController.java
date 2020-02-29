package br.com.senac.controller;
import br.com.senac.DAO.JogoDAO;
import br.com.senac.model.entidade.jogo;
import java.util.List;

public class jogoController {
   
   public String validarDados (jogo j){
        String mensagem="";
        if(j.getNome().equalsIgnoreCase("")){
            mensagem+="O campo \'Nome\' é obrigatório.\n";
        }
        if(j.getPlataforma().equalsIgnoreCase("")){
            mensagem+="O campo \'CPF\' é obrigatório.\n";
        }
        
        if(j.getDesenvolvedora().equalsIgnoreCase("")){
            mensagem+="O campo \'CPF\' é obrigatório.\n";
        }
        if(j.getSituacao().equalsIgnoreCase("")){
            mensagem+="O campo \'CPF\' é obrigatório.\n";
        }
        return mensagem;
   } 
  
   public void incluirJogo(jogo j){
    JogoDAO dao = new JogoDAO();
    dao.incluir(j);
   }
   
   public List<jogo> listarJogo(String nome){
    JogoDAO dao = new JogoDAO();
    return dao.listar(nome);
   }

   public jogo buscarJogo(int id) {
    JogoDAO dao = new JogoDAO();
    return dao.buscar(id);
   }
   public void alterarCliente(jogo j) {
    JogoDAO dao = new JogoDAO();
    dao.alterar(j);
   }
   public void excluirCliente(int id) {
    JogoDAO dao = new JogoDAO();
    dao.excluir(id);
   }
}

