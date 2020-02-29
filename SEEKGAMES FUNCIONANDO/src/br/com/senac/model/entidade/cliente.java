package br.com.senac.model.entidade;
public class cliente {
    private int id;
    private String CPF;
    private String Nome;
    private String Telefone;
    private String Rua;
    private String Bairro;
    private int Numero;
    private int Idade;
    private int Pontos;

    public void setId(int id) {
        this.id = id;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public void setPontos(int Pontos) {
        this.Pontos = Pontos;
    }

    public int getId() {
        return id;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public String getRua() {
        return Rua;
    }

    public String getBairro() {
        return Bairro;
    }

    public int getNumero() {
        return Numero;
    }

    public int getIdade() {
        return Idade;
    }

    public int getPontos() {
        return Pontos;
    }
}
