package br.com.fiap.main;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TesteDao
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> usuarios = new ArrayList<>();

        usuarios = usuarioDAO.selecionar();

        for(Usuario usuario : usuarios)
        {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("CPF: " + usuario.getCpf());
            System.out.println("Senha: " + usuario.getSenha());
            System.out.println("----");
        }
    }


}
