package br.com.fiap.dao;

import br.com.fiap.beans.Usuario;
import br.com.fiap.conexoes.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UsuarioDAO {

    public Connection minhaConexao;

    public UsuarioDAO() throws SQLException, ClassNotFoundException {
        super();
        this.minhaConexao = new Conexao().conexao();
    }

    public String inserir(Usuario usuario) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("INSERT INTO usuarios (nome, email, senha, cpf) VALUES (?, ?, ?, ?)");

        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getEmail());
        stmt.setString(3, usuario.getSenha());
        stmt.setString(4, usuario.getCpf());

        stmt.execute();
        stmt.close();
        return "Usuario Criado";
    }

    public List<Usuario> selecionar() throws SQLException {
        List<Usuario> listaUsuarios = new ArrayList<>();
        PreparedStatement stmt = minhaConexao.prepareStatement("select * from usuarios");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Usuario usuario = new Usuario();
            usuario.setNome(rs.getString(2));
            usuario.setEmail(rs.getString(3));
            usuario.setSenha(rs.getString(4));
            usuario.setCpf(rs.getString(5));
            listaUsuarios.add(usuario);
        }
        return listaUsuarios;
    }
}

