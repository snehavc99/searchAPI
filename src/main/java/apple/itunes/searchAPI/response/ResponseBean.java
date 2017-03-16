package apple.itunes.searchAPI.response;
/**
* @author Sneha
*/
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Java bean class to hold the Response parameters
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseBean {
	
	private Integer resultCount;

	private List<Result> results;
	
	private Boolean status;

	public Integer getResultCount() {
		return resultCount;
	}

	public void setResultCount(Integer resultCount) {
		this.resultCount = resultCount;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}


	
}
