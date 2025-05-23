package br.com.fiap;

import br.com.fiap.bo.FuncionarioBO;
import br.com.fiap.dto.LoginFuncionarioDTO;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.sql.SQLException;
import java.util.Map;

@Path("/funcionarios")
public class FuncionariosResource
{
    private FuncionarioBO funcionarioBO;

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(LoginFuncionarioDTO login) throws SQLException {
        boolean existe = funcionarioBO.login(login.nome, login.setor);
        if(existe)
        {
            return Response.ok("Login bem sucedido").build();
        }
        else
        {
            return Response.status(Response.Status.UNAUTHORIZED).entity(Map.of("erro", "Nome ou senha incorretas")).build();
        }
    }
}
