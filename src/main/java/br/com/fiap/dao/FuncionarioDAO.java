package br.com.fiap.dao;

import br.com.fiap.beans.Funcionario;
import br.com.fiap.conexoes.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDAO
{
    public Connection minhaConexao;

    public FuncionarioDAO() throws SQLException, ClassNotFoundException
    {
        super();
        this.minhaConexao = new Conexao().conexao();
    }

    public String inserir(Funcionario funcionario, int idFuncionario) throws SQLException
    {
        PreparedStatement stmt = minhaConexao.prepareStatement("INSERT INTO funcionario VALUES (?, ?, ?, ?)");

        stmt.setInt(1, idFuncionario);
        stmt.setString(2, funcionario.getNome() );
        stmt.setString(3, funcionario.getSetor() );
        stmt.setString(4, funcionario.getCargo());

        stmt.execute();
        stmt.close();

        return "funcionario Criado";
    }
}
