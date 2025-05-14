package br.com.fiap.beans;

public class Linha {
    private String nomeLinha;
    private int quantidadeEstacoes;
    private int quantidadeBaldiacoes;
    private boolean linhaEmOperacao;

    public Linha()
    {
        super();
    }

    public Linha(String nomeLinha, int quantidadeEstacoes, int quantidadeBaldiacoes, boolean linhaEmOperacao) {
        this.nomeLinha = nomeLinha;
        this.quantidadeEstacoes = quantidadeEstacoes;
        this.quantidadeBaldiacoes = quantidadeBaldiacoes;
        this.linhaEmOperacao = linhaEmOperacao;
    }

    public String getNomeLinha() {
        return nomeLinha;
    }

    public void setNomeLinha(String nomeLinha) {
        this.nomeLinha = nomeLinha;
    }

    public int getQuantidadeEstacoes() {
        return quantidadeEstacoes;
    }

    public void setQuantidadeEstacoes(int quantidadeEstacoes) {
        this.quantidadeEstacoes = quantidadeEstacoes;
    }

    public int getQuantidadeBaldiacoes() {
        return quantidadeBaldiacoes;
    }

    public void setQuantidadeBaldiacoes(int quantidadeBaldiacoes) {
        this.quantidadeBaldiacoes = quantidadeBaldiacoes;
    }

    public boolean isLinhaEmOperacao() {
        return linhaEmOperacao;
    }

    public void setLinhaEmOperacao(boolean linhaEmOperacao) {
        this.linhaEmOperacao = linhaEmOperacao;
    }

    @Override
    public String toString() {
        return "Linha{" +
                "\n nomeLinha='" + nomeLinha + '\'' +
                ",\n quantidadeEstacoes=" + quantidadeEstacoes +
                ",\n quantidadeBaldiacoes=" + quantidadeBaldiacoes +
                ",\n linhaEmOperacao=" + linhaEmOperacao +
                '}';
    }
}
