package br.com.fiap.beans;

public class    Vagao {
    private int atualLotacao, maximaLotacao;
    private boolean cheio;

    public Vagao(){
        super();
    }

    //Overload de construtor para criar um vagão que não está em operação, caso seja um cadastro de um novo vagão por exemplo
    public Vagao(int maximaLotacao){
        super();
        this.maximaLotacao = maximaLotacao;
        this.cheio = false;
        this.atualLotacao = 0;
    }

    public Vagao(int maximaLotacao, int atualLotacao) {
        this.maximaLotacao = maximaLotacao;
        setAtualLotacao(atualLotacao);
    }

    public int getAtualLotacao() {
        return atualLotacao;
    }

    public void setAtualLotacao(int atualLotacao) {
        if(atualLotacao > this.maximaLotacao){
            this.atualLotacao = this.maximaLotacao;
            this.cheio = true;
        }else{
            this.atualLotacao = atualLotacao;
            this.cheio = false;
        }
    }

    public int getMaximaLotacao() {
        return maximaLotacao;
    }

    public void setMaximaLotacao(int maximaLotacao) {
        this.maximaLotacao = maximaLotacao;
    }

    public boolean isCheio() {
        return cheio;
    }

    @Override
    public String toString() {
        return "Vagao{" +
                "atualLotacao=" + atualLotacao +
                ", maximaLotacao=" + maximaLotacao +
                ", cheio=" + cheio +
                '}';
    }
}
