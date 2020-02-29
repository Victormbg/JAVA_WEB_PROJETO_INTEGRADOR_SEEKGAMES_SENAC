package br.com.senac.aula1;

public abstract class Pessoa {
    
    
    /*
     * Atributos
     */
    private int id;
    private String apelido;
    private String email;
    private String senha;
    private Boolean ativo;
    
    /*
     * Método construtor
     */
    
    /*public Pessoa() {
        
    }
    
    public Pessoa(String email, String Senha) {
        this.email = email;
        this.senha = senha;
    }*/
    
    /*
     * Métodos encapsulados
     */
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getApelido() {
        return this.apelido;
    }
    
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean getAtivo() {
        return this.ativo;
    }
    
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    /*
     * Métodos
     */
    public int adicionar() {
        return 0;
    }

    public boolean alterar() {
        return false;
    }
    
    public boolean excluir() {
        return false;
    }
    
    public void localizar() {
        
    }
}
