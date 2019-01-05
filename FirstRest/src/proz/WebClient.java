package proz;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

public class WebClient {

	private WebTarget webTarget;
	private String xmlAnswer;

	public WebClient(String table, String code, int topCount) {

		String adress = "http://api.nbp.pl/api/exchangerates/rates/" + table + "/" + code + "/last/" + topCount;

		// utworzenie obiektu klasy Client
		Client client = ClientBuilder.newClient();
		// konstruowanie adresu URI

		UriBuilder uri = UriBuilder.fromUri(adress);

		// reprezentacja zasobu
		webTarget = client.target(uri);

		xmlAnswer = webTarget.request().accept(MediaType.TEXT_XML).get(String.class);
	}

	public String getXmlAnswer() {
		return xmlAnswer;
	}

}
