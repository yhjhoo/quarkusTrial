package org.prince;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpClient;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/app")
@Produces(MediaType.APPLICATION_JSON)
public class ExampleResource {

    @GET
    @Path("hello")
    public String hello() {
        return "hello";
    }

    @POST
    @Path("hi")
    public Response hi(@HeaderParam("Content-Type") String contentType, @Context HttpHeaders httpHeaders, @Context Request request, String body) {
        System.out.println(body);
        System.out.println(contentType);
        System.out.println(request.getMethod());

        httpHeaders.getRequestHeaders().forEach(
                (s, strings) -> System.out.printf("%s : %s \n", s, String.join(";", strings))
        );


        /*Vertx vertx = Vertx.vertx();
        HttpClient httpClient = vertx.createHttpClient();*/

        return Response.accepted().status(200).entity(new Person("Yang", "Huajie")).type(MediaType.APPLICATION_JSON).build();
    }


    @GET
    @Path("/getObject")
    public Person getObject() {
        return new Person("Yang", "Huajie");
    }
}