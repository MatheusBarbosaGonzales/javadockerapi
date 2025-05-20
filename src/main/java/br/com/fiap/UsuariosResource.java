package br.com.fiap;


import br.com.fiap.beans.Usuario;
import br.com.fiap.bo.UsuarioBO;
import br.com.fiap.dto.LoginDTO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Path("/usuarios")
public class UsuariosResource
{
    private UsuarioBO usuarioBO;

    public UsuariosResource() {
        try {
            usuarioBO = new UsuarioBO();
        } catch (Exception e) {
            // Log ou tratamento básico
            System.out.println("Erro ao instanciar UsuarioBO: " + e.getMessage());
        }
    }


    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(LoginDTO login) throws SQLException {
        boolean existe = usuarioBO.login(login.email, login.senha);

        if(existe)
        {
            return Response.ok("Login bem sucedido").build();
        }
        else
        {
            return Response.status(Response.Status.UNAUTHORIZED).entity(Map.of("erro", "Nome ou senha incorretas")).build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response criarUsuario(Usuario novoUsuario) {
        try {
            String msg = usuarioBO.inserirBo(novoUsuario);
            return Response.status(Response.Status.CREATED)
                    .entity(Map.of("mensagem", msg)).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity(Map.of("erro", e.getMessage())).build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> selecionarRs() throws ClassNotFoundException, SQLException, SQLException {
        return usuarioBO.selecionarBo();
    }
}
