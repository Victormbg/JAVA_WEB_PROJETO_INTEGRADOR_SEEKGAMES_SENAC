package br.com.senac.controller;
import br.com.senac.DAO.ClienteDAO;
import br.com.senac.model.entidade.cliente;
import java.util.List;

public class clienteController {
   
   public String validarDados (cliente c){
        String mensagem="";
        if(c.getNome().equalsIgnoreCase("")){
            mensagem+="O campo \'Nome\' é obrigatório.\n";
        }
        if(c.getCPF().equalsIgnoreCase("")){
            mensagem+="O campo \'CPF\' é obrigatório.\n";
        }
        if(c.getSexo().equalsIgnoreCase("")){
            mensagem+="O campo \'Idade\' é obrigatório.\n";
        }
        return mensagem;
   } 
  
   public void incluirCliente(cliente c){
    ClienteDAO dao = new ClienteDAO();
    dao.incluir(c);
   }
   
   public List<cliente> listarCliente(String nome){
    ClienteDAO dao = new ClienteDAO();
    return dao.listar(nome);
   }

   public cliente buscarCliente(int id) {
    ClienteDAO dao = new ClienteDAO();
    return dao.buscar(id);
   }
   public void alterarCliente(cliente c) {
    ClienteDAO dao = new ClienteDAO();
    dao.alterar(c);
   }
   public void excluirCliente(int id) {
    ClienteDAO dao = new ClienteDAO();
    dao.excluir(id);
   }
}

