package br.com.fiap.beans;

import javax.swing.*;
import java.util.ArrayList;

public class Metro {
    private int numeroMetro, quantidadeVagoes, maximaMetro;
    private Linha linhaAtuacao;
    private Status statusMetro;

    //Essa arraylist deve conter todos os vagões ligados a esse metro
    private ArrayList<Vagao> vagoes;

    public void adicionarVagoes()
    {
        if(vagoes == null) {
            int contador = 0;
            ArrayList<Vagao> tempVagoes = new ArrayList<Vagao>();
            do {
                contador++;
                //Vou começar o contador por 1 para parecer com o id do banco de dados
                tempVagoes.add(new Vagao(Integer.parseInt(JOptionPane.showInputDialog("Qual é o máximo de pessoas neste vagão?"))));

            } while (JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais um vagão?", "Vagao numero" + contador, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
            setVagoes(tempVagoes);
        }
        else
        {
            System.out.println("Metro já tem vagões criados!");
        }
    }

    public int calcularMaximaMetro()
    {
        int maximo = 0;
        for(Vagao a : vagoes)
        {
            maximo += a.getMaximaLotacao();
        }
        return maximo;
    }

    public Metro()
    {
        super();
    }

    public Metro(int numeroMetro, ArrayList<Vagao> vagoes, Linha linha, Status status) {
        this.numeroMetro = numeroMetro;
        this.linhaAtuacao = linha;
        this.statusMetro = status;
        this.vagoes = vagoes;
        this.quantidadeVagoes = vagoes.size();
        this.maximaMetro = calcularMaximaMetro();
    }

    public Metro(int numeroMetro, Linha linha, Status status) {
        this.numeroMetro = numeroMetro;
        this.linhaAtuacao = linha;
        this.statusMetro = status;
        adicionarVagoes();
        this.quantidadeVagoes = vagoes.size();
        this.maximaMetro = calcularMaximaMetro();
    }

    public ArrayList<Vagao> getVagoes() {
        return vagoes;
    }

    public void setVagoes(ArrayList<Vagao> vagoes) {
        this.vagoes = vagoes;
    }

    public int getNumeroMetro() {
        return numeroMetro;
    }

    public void setNumeroMetro(int numeroMetro) {
        this.numeroMetro = numeroMetro;
    }

    public int getQuantidadeVagoes() {
        return quantidadeVagoes;
    }

    public void setQuantidadeVagoes(int quantidadeVagoes) {
        this.quantidadeVagoes = quantidadeVagoes;
    }

    public int getMaximaMetro() {
        return maximaMetro;
    }

    public void setMaximaMetro(int maximaMetro) {
        this.maximaMetro = maximaMetro;
    }

    public Linha getLinhaAtuacao() {
        return linhaAtuacao;
    }

    public void setLinhaAtuacao(Linha linhaAtuacao) {
        this.linhaAtuacao = linhaAtuacao;
    }

    public Status getStatusMetro() {
        return statusMetro;
    }

    public void setStatusMetro(Status statusMetro) {
        this.statusMetro = statusMetro;
    }

    @Override
    public String toString() {
        return "Metro{" +
                "\n numeroMetro=" + numeroMetro +
                ",\n quantidadeVagoes=" + quantidadeVagoes +
                ",\n maximaMetro=" + maximaMetro +
                ",\n linhaAtuacao=" + linhaAtuacao.getNomeLinha() +
                ",\n statusMetro=" + statusMetro +
                '}';
    }
}