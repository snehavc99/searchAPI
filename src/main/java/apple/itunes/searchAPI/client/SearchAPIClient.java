package apple.itunes.searchAPI.client;

import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import apple.itunes.searchAPI.response.ResponseBean;

/*
 * author-Sneha
 */
public class SearchAPIClient {
	ResponseBean resClassObj = null;

	public static void main(String args[]) {
		SearchAPIClient cli = new SearchAPIClient();
		cli.searchAPIResult("https://itunes.apple.com/search?term=Jack&country=US");
	}

	public ResponseBean searchAPIResult(String URL) {
		resClassObj = new ResponseBean();
		boolean success = false;
		// creating a jersey client and set the URL
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URL);
		ObjectMapper mapper = new ObjectMapper();
		// since the response is in JSON set the mediatype as JSON
		Response response = target.request(MediaType.APPLICATION_JSON).get();
		if (response.getStatus() == 200) {
			success = true;
			String resp = response.readEntity(String.class);
			try {
				resClassObj = mapper.readValue(resp, ResponseBean.class);
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		resClassObj.setStatus(success);
		return resClassObj;

	}

}
