package br.com.senac.model.entidade;
public class jogo {
    private int id;
    private String Nome;
    private String Plataforma;
    private String Desenvolvedora;
    private String Grupo;
    private String Situacao;
    private int IdadeRecomendada;
    private int preco;

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setPlataforma(String Plataforma) {
        this.Plataforma = Plataforma;
    }

    public void setDesenvolvedora(String Desenvolvedora) {
        this.Desenvolvedora = Desenvolvedora;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }

    public void setIdadeRecomendada(int IdadeRecomendada) {
        this.IdadeRecomendada = IdadeRecomendada;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return Nome;
    }

    public String getPlataforma() {
        return Plataforma;
    }

    public String getDesenvolvedora() {
        return Desenvolvedora;
    }

    public String getGrupo() {
        return Grupo;
    }

    public String getSituacao() {
        return Situacao;
    }

    public int getIdadeRecomendada() {
        return IdadeRecomendada;
    }

    public int getPreco() {
        return preco;
    }
}
