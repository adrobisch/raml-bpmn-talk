
package talk.ramlbpmn.api.resource;

import java.math.BigDecimal;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import talk.ramlbpmn.api.model.Song;
import talk.ramlbpmn.api.model.SongList;

@Path("songs")
public interface Songs {


    /**
     * 
     * @param genre
     *     filter the songs by genre
     * @param page
     *     The page to retrieve
     */
    @GET
    @Produces({
        "application/hal+json"
    })
    Songs.GetSongsResponse getSongs(
        @QueryParam("genre")
        String genre,
        @QueryParam("page")
        BigDecimal page)
        throws Exception
    ;

    /**
     * 
     */
    @POST
    Songs.PostSongsResponse postSongs()
        throws Exception
    ;

    /**
     * 
     * @param songId
     *     
     */
    @GET
    @Path("{songId}")
    @Produces({
        "application/hal+json"
    })
    Songs.GetSongsBySongIdResponse getSongsBySongId(
        @PathParam("songId")
        String songId)
        throws Exception
    ;

    /**
     * This method will *delete* an **individual song**
     * 
     * 
     * @param songId
     *     
     */
    @DELETE
    @Path("{songId}")
    Songs.DeleteSongsBySongIdResponse deleteSongsBySongId(
        @PathParam("songId")
        String songId)
        throws Exception
    ;

    public class DeleteSongsBySongIdResponse
        extends talk.ramlbpmn.api.support.ResponseWrapper
    {


        private DeleteSongsBySongIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         */
        public static Songs.DeleteSongsBySongIdResponse withOK() {
            Response.ResponseBuilder responseBuilder = Response.status(200);
            return new Songs.DeleteSongsBySongIdResponse(responseBuilder.build());
        }

    }

    public class GetSongsBySongIdResponse
        extends talk.ramlbpmn.api.support.ResponseWrapper
    {


        private GetSongsBySongIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         * @param entity
         *     
         */
        public static Songs.GetSongsBySongIdResponse withHaljsonOK(Song entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/hal+json");
            responseBuilder.entity(entity);
            return new Songs.GetSongsBySongIdResponse(responseBuilder.build());
        }

    }

    public class GetSongsResponse
        extends talk.ramlbpmn.api.support.ResponseWrapper
    {


        private GetSongsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         * @param entity
         *     
         */
        public static Songs.GetSongsResponse withHaljsonOK(SongList entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/hal+json");
            responseBuilder.entity(entity);
            return new Songs.GetSongsResponse(responseBuilder.build());
        }

    }

    public class PostSongsResponse
        extends talk.ramlbpmn.api.support.ResponseWrapper
    {


        private PostSongsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         */
        public static Songs.PostSongsResponse withOK() {
            Response.ResponseBuilder responseBuilder = Response.status(200);
            return new Songs.PostSongsResponse(responseBuilder.build());
        }

    }

}
