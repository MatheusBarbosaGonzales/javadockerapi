package br.com.fiap;


import br.com.fiap.beans.Usuario;
import br.com.fiap.bo.UsuarioBO;
import br.com.fiap.dto.LoginDTO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Path("/usuarios")
public class UsuariosResource
{
    private UsuarioBO usuarioBO = new UsuarioBO() ;


    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(LoginDTO login) throws SQLException {
        boolean existe = usuarioBO.login(login.nome, login.senha);
        if(existe)
        {
            return Response.ok("Login bem sucedido").build();
        }
        else
        {
            return Response.status(Response.Status.UNAUTHORIZED).entity(Map.of("erro", "Nome ou senha incorretas")).build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> selecionarRs() throws ClassNotFoundException, SQLException, SQLException {
        return usuarioBO.selecionarBo();
    }
}
