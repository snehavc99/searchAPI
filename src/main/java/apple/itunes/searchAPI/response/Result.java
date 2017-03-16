package apple.itunes.searchAPI.response;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
	/*
	 * @author Sneha
	 */
	public String getWrapperType() {
		return wrapperType;
	}
	
	public void setWrapperType(String wrapperType) {
		this.wrapperType = wrapperType;
	}
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public Integer getArtistId() {
		return artistId;
	}

	public void setArtistId(Integer artistId) {
		this.artistId = artistId;
	}

	public Integer getTrackId() {
		return trackId;
	}

	public void setTrackId(Integer trackId) {
		this.trackId = trackId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getTrackName() {
		return trackName;
	}

	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	public String getTrackCensoredName() {
		return trackCensoredName;
	}

	public void setTrackCensoredName(String trackCensoredName) {
		this.trackCensoredName = trackCensoredName;
	}

	public String getArtistViewUrl() {
		return artistViewUrl;
	}

	public void setArtistViewUrl(String artistViewUrl) {
		this.artistViewUrl = artistViewUrl;
	}

	public String getTrackViewUrl() {
		return trackViewUrl;
	}

	public void setTrackViewUrl(String trackViewUrl) {
		this.trackViewUrl = trackViewUrl;
	}

	public String getPreviewUrl() {
		return previewUrl;
	}

	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}

	public String getArtworkUrl30() {
		return artworkUrl30;
	}

	public void setArtworkUrl30(String artworkUrl30) {
		this.artworkUrl30 = artworkUrl30;
	}

	public String getArtworkUrl60() {
		return artworkUrl60;
	}

	public void setArtworkUrl60(String artworkUrl60) {
		this.artworkUrl60 = artworkUrl60;
	}

	public String getArtworkUrl100() {
		return artworkUrl100;
	}

	public void setArtworkUrl100(String artworkUrl100) {
		this.artworkUrl100 = artworkUrl100;
	}

	public Double getCollectionPrice() {
		return collectionPrice;
	}

	public void setCollectionPrice(Double collectionPrice) {
		this.collectionPrice = collectionPrice;
	}

	public Double getTrackPrice() {
		return trackPrice;
	}

	public void setTrackPrice(Double trackPrice) {
		this.trackPrice = trackPrice;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCollectionExplicitness() {
		return collectionExplicitness;
	}

	public void setCollectionExplicitness(String collectionExplicitness) {
		this.collectionExplicitness = collectionExplicitness;
	}

	public String getTrackExplicitness() {
		return trackExplicitness;
	}

	public void setTrackExplicitness(String trackExplicitness) {
		this.trackExplicitness = trackExplicitness;
	}

	public Integer getTrackTimeMillis() {
		return trackTimeMillis;
	}

	public void setTrackTimeMillis(Integer trackTimeMillis) {
		this.trackTimeMillis = trackTimeMillis;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPrimaryGenreName() {
		return primaryGenreName;
	}

	public void setPrimaryGenreName(String primaryGenreName) {
		this.primaryGenreName = primaryGenreName;
	}

	public String getContentAdvisoryRating() {
		return contentAdvisoryRating;
	}

	public void setContentAdvisoryRating(String contentAdvisoryRating) {
		this.contentAdvisoryRating = contentAdvisoryRating;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public Double getTrackRentalPrice() {
		return trackRentalPrice;
	}

	public void setTrackRentalPrice(Double trackRentalPrice) {
		this.trackRentalPrice = trackRentalPrice;
	}

	public Double getCollectionHdPrice() {
		return collectionHdPrice;
	}

	public void setCollectionHdPrice(Double collectionHdPrice) {
		this.collectionHdPrice = collectionHdPrice;
	}

	public Double getTrackHdPrice() {
		return trackHdPrice;
	}

	public void setTrackHdPrice(Double trackHdPrice) {
		this.trackHdPrice = trackHdPrice;
	}

	public Double getTrackHdRentalPrice() {
		return trackHdRentalPrice;
	}

	public void setTrackHdRentalPrice(Double trackHdRentalPrice) {
		this.trackHdRentalPrice = trackHdRentalPrice;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	private String wrapperType;
	private String kind;
	private Integer artistId;
	private Integer trackId;
	private String artistName;
	private String trackName;
	private String trackCensoredName;
	private String artistViewUrl;
	private String trackViewUrl;
	private String collectionId;
	public String getCollectionId() {
		return collectionId;
	}
	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}
	
	private String collectionName;
	private String collectionCensoredName;
	
	public String getCollectionName() {
		return collectionName;
	}

	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public String getCollectionCensoredName() {
		return collectionCensoredName;
	}

	public void setCollectionCensoredName(String collectionCensoredName) {
		this.collectionCensoredName = collectionCensoredName;
	}

	public Integer getCollectionArtistId() {
		return collectionArtistId;
	}

	public void setCollectionArtistId(Integer collectionArtistId) {
		this.collectionArtistId = collectionArtistId;
	}

	public String getCollectionArtistViewUrl() {
		return collectionArtistViewUrl;
	}

	public void setCollectionArtistViewUrl(String collectionArtistViewUrl) {
		this.collectionArtistViewUrl = collectionArtistViewUrl;
	}

	public String getCollectionViewUrl() {
		return collectionViewUrl;
	}

	public void setCollectionViewUrl(String collectionViewUrl) {
		this.collectionViewUrl = collectionViewUrl;
	}

	public String getDiscCount() {
		return discCount;
	}

	public void setDiscCount(String discCount) {
		this.discCount = discCount;
	}

	public String getDiscNumber() {
		return discNumber;
	}

	public void setDiscNumber(String discNumber) {
		this.discNumber = discNumber;
	}

	public String getTrackCount() {
		return trackCount;
	}

	public void setTrackCount(String trackCount) {
		this.trackCount = trackCount;
	}

	public String getTrackNumber() {
		return trackNumber;
	}

	public void setTrackNumber(String trackNumber) {
		this.trackNumber = trackNumber;
	}

	public Boolean getHasITunesExtras() {
		return hasITunesExtras;
	}

	public void setHasITunesExtras(Boolean hasITunesExtras) {
		this.hasITunesExtras = hasITunesExtras;
	}

	private Integer collectionArtistId;
	private String collectionArtistViewUrl;
	private String collectionViewUrl;
	private String discCount;
	private String discNumber;
	private String trackCount;
	private String trackNumber;
	private Boolean hasITunesExtras;
	private String previewUrl;
	private String artworkUrl30;
	private String artworkUrl60;
	private String artworkUrl100;
	private Double collectionPrice;
	private Double trackPrice;
	private String releaseDate;
	private String collectionExplicitness;
	private String trackExplicitness;
	private Integer trackTimeMillis;
	private String country;
	private String currency;
	private String primaryGenreName;
	private String contentAdvisoryRating;
	private String longDescription;
	private Double trackRentalPrice;
	private Double collectionHdPrice;
	private Double trackHdPrice;
	private Double trackHdRentalPrice;
	private String shortDescription;
}
