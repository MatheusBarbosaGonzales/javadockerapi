package br.com.fiap.beans;

public class Funcionario
{
    private String nome, setor, cargo;

    public Funcionario(){
        super();
    }

    public Funcionario(String nome, String setor, String cargo) {
        this.nome = nome;
        this.setor = setor;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", setor='" + setor + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
