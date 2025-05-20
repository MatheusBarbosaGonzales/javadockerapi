package br.com.fiap.beans;

public class Status {
    private String descricao;
    private boolean emManutencao;
    private int previsaoMin;
    private Linha linhaManutencao;

    public Status()
    {
        super();
    }

    public Status(String descricao, boolean emManutencao, int previsaoMin) {
        this.descricao = descricao;
        this.emManutencao = emManutencao;
        this.previsaoMin = previsaoMin;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setEmManutencao(boolean emManutencao) {
        this.emManutencao = emManutencao;
    }

    public int getPrevisaoMin() {
        return previsaoMin;
    }

    public void setPrevisaoMin(int previsaoMin) {
        this.previsaoMin = previsaoMin;
    }

    public Linha getLinhaManutencao() {
        return linhaManutencao;
    }

    public void setLinhaManutencao(Linha linhaManutencao) {
        this.linhaManutencao = linhaManutencao;
    }

    @Override
    public String toString() {
        return "Status{" +
                "\n descricao='" + descricao + '\'' +
                ",\n emManutencao=" + emManutencao +
                ",\n previsaoMin=" + previsaoMin +
                ",\n linhaManutencao=" + linhaManutencao +
                '}';
    }
}
