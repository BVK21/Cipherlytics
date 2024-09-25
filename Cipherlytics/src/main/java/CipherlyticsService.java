

import jakarta.ws.rs.*;

import jakarta.ws.rs.core.Response;




@Path("/price-pilot")
public class CipherlyticsService {


    @GET
    @Path("/hello")
    @Produces("text/plain")
    public Response sayHello() {
        return Response.ok("Hello, World! Bhim").build();
    }

    @GET
    @Path("/hello/{name}")
    @Produces("text/plain")
    public Response sayHello(@PathParam("name") String name) {
        return Response.ok("Hello, " + name + "!").build();
    }
}