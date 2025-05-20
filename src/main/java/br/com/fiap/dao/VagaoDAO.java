package br.com.fiap.dao;

import br.com.fiap.beans.Vagao;
import br.com.fiap.conexoes.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VagaoDAO
{
    public Connection minhaConexao;

    public VagaoDAO() throws SQLException, ClassNotFoundException
    {
        super();
        this.minhaConexao = new Conexao().conexao();
    }

    public String inserir(Vagao vagao, int idMetro) throws SQLException
    {
        PreparedStatement stmt = minhaConexao.prepareStatement("INSERT INTO vagao VALUES (?, ?, ?, ?)");

        String cheio = Boolean.toString(vagao.isCheio());
        if(cheio.equals("false"))
        {
            cheio = "f";
        }
        else
        {
            cheio = "t";
        }

        stmt.setInt(1, idMetro );
        stmt.setInt(2, vagao.getAtualLotacao());
        stmt.setInt(3, vagao.getMaximaLotacao());
        stmt.setString(4, cheio);

        stmt.execute();
        stmt.close();
        return "Vagao Criado";
    }
}
