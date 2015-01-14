
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
 * The links of a Song List
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "self",
    "artists",
    "songs"
})
public class ServiceDocument {

    /**
     * A HAL link
     * 
     */
    @JsonProperty("self")
    private HalLink self;
    /**
     * A HAL link
     * 
     */
    @JsonProperty("artists")
    private HalLink artists;
    /**
     * A HAL link
     * 
     */
    @JsonProperty("songs")
    private HalLink songs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * A HAL link
     * 
     * @return
     *     The self
     */
    @JsonProperty("self")
    public HalLink getSelf() {
        return self;
    }

    /**
     * A HAL link
     * 
     * @param self
     *     The self
     */
    @JsonProperty("self")
    public void setSelf(HalLink self) {
        this.self = self;
    }

    public ServiceDocument withSelf(HalLink self) {
        this.self = self;
        return this;
    }

    /**
     * A HAL link
     * 
     * @return
     *     The artists
     */
    @JsonProperty("artists")
    public HalLink getArtists() {
        return artists;
    }

    /**
     * A HAL link
     * 
     * @param artists
     *     The artists
     */
    @JsonProperty("artists")
    public void setArtists(HalLink artists) {
        this.artists = artists;
    }

    public ServiceDocument withArtists(HalLink artists) {
        this.artists = artists;
        return this;
    }

    /**
     * A HAL link
     * 
     * @return
     *     The songs
     */
    @JsonProperty("songs")
    public HalLink getSongs() {
        return songs;
    }

    /**
     * A HAL link
     * 
     * @param songs
     *     The songs
     */
    @JsonProperty("songs")
    public void setSongs(HalLink songs) {
        this.songs = songs;
    }

    public ServiceDocument withSongs(HalLink songs) {
        this.songs = songs;
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

    public ServiceDocument withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
