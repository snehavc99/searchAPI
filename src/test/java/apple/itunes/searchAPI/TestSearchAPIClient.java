package apple.itunes.searchAPI;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import apple.itunes.searchAPI.client.SearchAPIClient;
import apple.itunes.searchAPI.response.ResponseBean;
/*
 * @author-Sneha
 */
public class TestSearchAPIClient {
	SearchAPIClient serachAPIClient;

	@Before
	public void setUp() {
		serachAPIClient = new SearchAPIClient();
	}

	// testing by passing term
	@Test
	public void testWithTerm() {
		String URL = "https://itunes.apple.com/search?term=Jack,Jackson";
		ResponseBean resObj = serachAPIClient.searchAPIResult(URL);
		assertTrue(resObj.getStatus());
		assertTrue(resObj.getResultCount() > 0);
		assertTrue(resObj.getResults().size() >= 1);
	}

	// mandatory field not passed and hence success response is not returned
	@Test
	public void testInvalidParameters() {
		String URL = "https://itunes.apple.com/search?media=Jack";
		ResponseBean resObj = serachAPIClient.searchAPIResult(URL);
		assertFalse(resObj.getStatus());

	}

	// checking with passing term an country
	@Test
	public void testWithTermAndCountry() {
		String URL = "https://itunes.apple.com/search?term=Jack&country=US";
		ResponseBean resObj = serachAPIClient.searchAPIResult(URL);
		assertTrue(resObj.getStatus());
		assertTrue(resObj.getResultCount() > 0);
		assertTrue(resObj.getResults().size() >= 1);

	}

	// checking by passing term and media parameters
	@Test
	public void testWithTermAndmedia() {
		String URL = "https://itunes.apple.com/search?term=Jack+Jackson&mediaType=movie";
		ResponseBean resObj = serachAPIClient.searchAPIResult(URL);
		assertTrue(resObj.getStatus());
		assertTrue(resObj.getResultCount() > 0);
		assertTrue(resObj.getResults().size() >= 1);
	}

	// verifying with limit 10 hence the result count should be less than or
	// equal to 10
	@Test
	public void testWithTermAndLimit() {
		String URL = "https://itunes.apple.com/search?term=Jack.Jackson&limit=10";
		ResponseBean resObj = serachAPIClient.searchAPIResult(URL);
		assertTrue(resObj.getStatus());
		int count = resObj.getResultCount();
		assertTrue(count > 0 && count <= 10);
		assertTrue(resObj.getResults().size() == count);
	}

	// verifying by passing all parameters
	@Test
	public void testWithAllParameters() {
		String URL = "https://itunes.apple.com/search?term=Jack.Jackson&country=US&mediaType=movie&limit=10";
		ResponseBean resObj = serachAPIClient.searchAPIResult(URL);
		assertTrue(resObj.getStatus());
		int count = resObj.getResultCount();
		assertTrue(resObj.getResultCount() > 0);
		assertTrue(resObj.getResults().size() >= 1);
	}

	@After
	public void tearDown() {
		serachAPIClient = null;
	}
}
