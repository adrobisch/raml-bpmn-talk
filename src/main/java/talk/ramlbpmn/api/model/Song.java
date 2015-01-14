
package talk.ramlbpmn.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A canonical song
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "title",
    "artist",
    "_links"
})
public class Song {

    @JsonProperty("title")
    private String title;
    @JsonProperty("artist")
    private String artist;
    /**
     * The links of a Song
     * 
     */
    @JsonProperty("_links")
    private SongLinks Links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Song withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * @return
     *     The artist
     */
    @JsonProperty("artist")
    public String getArtist() {
        return artist;
    }

    /**
     * 
     * @param artist
     *     The artist
     */
    @JsonProperty("artist")
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Song withArtist(String artist) {
        this.artist = artist;
        return this;
    }

    /**
     * The links of a Song
     * 
     * @return
     *     The Links
     */
    @JsonProperty("_links")
    public SongLinks getLinks() {
        return Links;
    }

    /**
     * The links of a Song
     * 
     * @param Links
     *     The _links
     */
    @JsonProperty("_links")
    public void setLinks(SongLinks Links) {
        this.Links = Links;
    }

    public Song withLinks(SongLinks Links) {
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

    public Song withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
