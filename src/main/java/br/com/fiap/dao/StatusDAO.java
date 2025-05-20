package br.com.fiap.dao;

import br.com.fiap.beans.Status;
import br.com.fiap.conexoes.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StatusDAO
{
    public Connection minhaConexao;

    public StatusDAO() throws SQLException, ClassNotFoundException
    {
        super();
        this.minhaConexao = new Conexao().conexao();
    }

    public String inserir(Status status, int idStatus) throws SQLException
    {
        PreparedStatement stmt = minhaConexao.prepareStatement("INSERT INTO status VALUES ( ?, ?, ?, ?)");

        String emManutencao = Boolean.toString(status.isEmManutencao());
        if(emManutencao.equals("false"))
        {
            emManutencao = "f";
        }
        else
        {
            emManutencao = "t";
        }

        stmt.setInt(1, idStatus);
        stmt.setString(2, status.getDescricao());
        stmt.setString(3, emManutencao);
        stmt.setInt(4, status.getPrevisaoMin());

        stmt.execute();
        stmt.close();

        return "Status Criado";
    }
}
