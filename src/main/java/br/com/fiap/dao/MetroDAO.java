package br.com.fiap.dao;

import br.com.fiap.conexoes.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MetroDAO
{
    public Connection minhaConexao;

    public MetroDAO() throws SQLException, ClassNotFoundException
    {
        super();
        this.minhaConexao = new Conexao().conexao();
    }

    public String inserir(int idLinha, int idLinhaAtuacao) throws SQLException
    {
        PreparedStatement stmt = minhaConexao.prepareStatement("INSERT INTO metro VALUES (?, ?)");

        stmt.setInt(1, idLinha);
        stmt.setInt(2, idLinhaAtuacao);
        stmt.execute();
        stmt.close();
        return "Metro criado com sucesso";
    }

}
