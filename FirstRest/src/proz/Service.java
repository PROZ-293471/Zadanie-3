package proz;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import formatResources.PathToJson;
import formatResources.PathToXml;

// klasa g³ówna implementuj¹ca polecenia HTTP

@Path("293471/exchangerates/rates/{table}/{code}/{topCount}")
public class Service {
	// format XML
	@GET
	@Produces({ MediaType.APPLICATION_XML })
	public String getXML(@PathParam("table") String table, @PathParam("code") String code,
			@PathParam("topCount") int topCount) throws JAXBException {

		return PathToXml.getXml(table, code, topCount);
	}

	// format JSON
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public String getJSON(@PathParam("table") String table, @PathParam("code") String code,
			@PathParam("topCount") int topCount) throws JAXBException {

		return PathToJson.getJson(table, code, topCount);
	}
}
