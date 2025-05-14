package br.com.fiap.bo;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioBO {
    UsuarioDAO usuarioDao;

    public boolean login(String nome, String senha) throws SQLException {
        String sql = "SELECT 1 FROM usuarios WHERE nome = ? AND senha = ?";

        try (PreparedStatement stmt = usuarioDao.minhaConexao.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        }
    }

    public ArrayList<Usuario> selecionarBo() throws ClassNotFoundException, SQLException {
        usuarioDao = new UsuarioDAO();
        return (ArrayList<Usuario>) usuarioDao.selecionar();
    }


}
