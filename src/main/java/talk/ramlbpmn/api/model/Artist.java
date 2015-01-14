
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "_links"
})
public class Artist {

    @JsonProperty("name")
    private String name;
    /**
     * The links of an Artist
     * 
     */
    @JsonProperty("_links")
    private ArtistLinks Links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Artist withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The links of an Artist
     * 
     * @return
     *     The Links
     */
    @JsonProperty("_links")
    public ArtistLinks getLinks() {
        return Links;
    }

    /**
     * The links of an Artist
     * 
     * @param Links
     *     The _links
     */
    @JsonProperty("_links")
    public void setLinks(ArtistLinks Links) {
        this.Links = Links;
    }

    public Artist withLinks(ArtistLinks Links) {
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

    public Artist withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
