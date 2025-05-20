package br.com.fiap.bo;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioBO {
    private UsuarioDAO usuarioDao;

    public UsuarioBO() throws SQLException, ClassNotFoundException {
        usuarioDao = new UsuarioDAO();
    }

    public boolean login(String email, String senha) throws SQLException {
        String sql = "SELECT 1 FROM usuarios WHERE email = ? AND senha = ?";

        try (PreparedStatement stmt = usuarioDao.minhaConexao.prepareStatement(sql)) {
            stmt.setString(1, email);
            stmt.setString(2, senha);

            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next(); // Retorna true se existir registro com esse nome e senha
            }
        }
    }

    public ArrayList<Usuario> selecionarBo() throws SQLException, ClassNotFoundException {
        return (ArrayList<Usuario>) usuarioDao.selecionar();
    }

    public String inserirBo(Usuario usuario) throws SQLException, ClassNotFoundException {
        return usuarioDao.inserir(usuario);
    }
}
