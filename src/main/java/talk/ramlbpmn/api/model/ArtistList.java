
package talk.ramlbpmn.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A HAL collection
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "count",
    "artists",
    "_links"
})
public class ArtistList {

    @JsonProperty("count")
    private Integer count;
    @JsonProperty("artists")
    private List<Artist> artists = new ArrayList<Artist>();
    /**
     * The links of a Song List
     * 
     */
    @JsonProperty("_links")
    private ArtistListLinks Links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The count
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    public ArtistList withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 
     * @return
     *     The artists
     */
    @JsonProperty("artists")
    public List<Artist> getArtists() {
        return artists;
    }

    /**
     * 
     * @param artists
     *     The artists
     */
    @JsonProperty("artists")
    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public ArtistList withArtists(List<Artist> artists) {
        this.artists = artists;
        return this;
    }

    /**
     * The links of a Song List
     * 
     * @return
     *     The Links
     */
    @JsonProperty("_links")
    public ArtistListLinks getLinks() {
        return Links;
    }

    /**
     * The links of a Song List
     * 
     * @param Links
     *     The _links
     */
    @JsonProperty("_links")
    public void setLinks(ArtistListLinks Links) {
        this.Links = Links;
    }

    public ArtistList withLinks(ArtistListLinks Links) {
        this.Links = Links;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ArtistList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
