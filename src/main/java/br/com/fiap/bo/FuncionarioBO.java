package br.com.fiap.bo;

import br.com.fiap.dao.FuncionarioDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioBO
{
    private FuncionarioDAO funcionarioDAO;

    public FuncionarioBO() throws SQLException, ClassNotFoundException {
        funcionarioDAO = new FuncionarioDAO();
    }

    public boolean login(String nome, String setor) throws SQLException {
        String sql = "SELECT 1 FROM funcionarios WHERE nome = ? AND setor = ?";

        try (PreparedStatement stmt = funcionarioDAO.minhaConexao.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, setor);

            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        }
    }
}
