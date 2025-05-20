package br.com.fiap.beans;

public class Estacao {

    private String titulo, descricao, imagem;
    private int id;

    public Estacao()
    {
        super();
    }

    public Estacao(String titulo, String descricao, String imagem, int id) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.imagem = imagem;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Estacao{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", imagem='" + imagem + '\'' +
                ", id=" + id +
                '}';
    }
}
