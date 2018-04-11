package thuan;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/home")
public class TestWS {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String hello()
	{
		return "Hello";
	}
}
