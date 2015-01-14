
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
    "songs",
    "_links"
})
public class SongList {

    @JsonProperty("count")
    private Integer count;
    @JsonProperty("songs")
    private List<Song> songs = new ArrayList<Song>();
    /**
     * The links of a Song List
     * 
     */
    @JsonProperty("_links")
    private SongListLinks Links;
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

    public SongList withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 
     * @return
     *     The songs
     */
    @JsonProperty("songs")
    public List<Song> getSongs() {
        return songs;
    }

    /**
     * 
     * @param songs
     *     The songs
     */
    @JsonProperty("songs")
    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public SongList withSongs(List<Song> songs) {
        this.songs = songs;
        return this;
    }

    /**
     * The links of a Song List
     * 
     * @return
     *     The Links
     */
    @JsonProperty("_links")
    public SongListLinks getLinks() {
        return Links;
    }

    /**
     * The links of a Song List
     * 
     * @param Links
     *     The _links
     */
    @JsonProperty("_links")
    public void setLinks(SongListLinks Links) {
        this.Links = Links;
    }

    public SongList withLinks(SongListLinks Links) {
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

    public SongList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
