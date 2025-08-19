package teste.quarkus.controller;


import entity.UserEntity;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    @POST
    public Response createUser(UserEntity userEntity) {
        return Response.ok("sangamer").build();
    }
}
