package me.tychsen.std;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("HelloWorld")
@Consumes({"application/json"})
@Produces({"application/json"})
public class Test {
    @GET
    public String index() {
        return "Whatever dude";
    }
}
