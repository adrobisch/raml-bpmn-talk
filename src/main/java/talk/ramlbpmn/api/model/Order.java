
package talk.ramlbpmn.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * The order request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "songId",
    "customerId",
    "mediaFormat"
})
public class Order {

    /**
     * the song which should be ordered
     * 
     */
    @JsonProperty("songId")
    private String songId;
    @JsonProperty("customerId")
    private String customerId;
    /**
     * the customer can choose how in which format he wants to get the song.
     * 
     */
    @JsonProperty("mediaFormat")
    private Order.MediaFormat mediaFormat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * the song which should be ordered
     * 
     * @return
     *     The songId
     */
    @JsonProperty("songId")
    public String getSongId() {
        return songId;
    }

    /**
     * the song which should be ordered
     * 
     * @param songId
     *     The songId
     */
    @JsonProperty("songId")
    public void setSongId(String songId) {
        this.songId = songId;
    }

    public Order withSongId(String songId) {
        this.songId = songId;
        return this;
    }

    /**
     * 
     * @return
     *     The customerId
     */
    @JsonProperty("customerId")
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 
     * @param customerId
     *     The customerId
     */
    @JsonProperty("customerId")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Order withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * the customer can choose how in which format he wants to get the song.
     * 
     * @return
     *     The mediaFormat
     */
    @JsonProperty("mediaFormat")
    public Order.MediaFormat getMediaFormat() {
        return mediaFormat;
    }

    /**
     * the customer can choose how in which format he wants to get the song.
     * 
     * @param mediaFormat
     *     The mediaFormat
     */
    @JsonProperty("mediaFormat")
    public void setMediaFormat(Order.MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    public Order withMediaFormat(Order.MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat;
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

    public Order withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Generated("org.jsonschema2pojo")
    public static enum MediaFormat {

        MP_3("MP3"),
        VINYL("VINYL");
        private final String value;
        private static Map<String, Order.MediaFormat> constants = new HashMap<String, Order.MediaFormat>();

        static {
            for (Order.MediaFormat c: values()) {
                constants.put(c.value, c);
            }
        }

        private MediaFormat(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Order.MediaFormat fromValue(String value) {
            Order.MediaFormat constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
