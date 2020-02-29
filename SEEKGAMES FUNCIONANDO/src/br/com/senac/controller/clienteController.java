package br.com.senac.controller;
import br.com.senac.DAO.ClienteDAO;
import br.com.senac.model.entidade.cliente;
import java.util.List;

public class clienteController {
   
   public String validarDados (cliente c){
        String mensagem="";
        if(c.getCPF().equalsIgnoreCase("")){
            mensagem+="O campo \'CPF\' é obrigatório.\n";
        }
        if(c.getNome().equalsIgnoreCase("")){
            mensagem+="O campo \'Nome\' é obrigatório.\n";
        }
        if(c.getTelefone().equalsIgnoreCase("")){
            mensagem+="O campo \'Telefone\' é obrigatório.\n";
        }
        if(c.getRua().equalsIgnoreCase("")){
            mensagem+="O campo \'Rua\' é obrigatório.\n";
        }
        if(c.getBairro().equalsIgnoreCase("")){
            mensagem+="O campo \'Bairro\' é obrigatório.\n";
        }/*
        if(c.getNumero()){
            mensagem+="O campo \'Numero\' é obrigatório.\n";
        }
        if(c.getIdade().equalsIgnoreCase("")){
            mensagem+="O campo \'Idade\' é obrigatório.\n";
        }
        if(c.getPontos().equalsIgnoreCase("")){
            mensagem+="O campo \'Pontos\' é obrigatório.\n";
        }*/
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

