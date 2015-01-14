
package talk.ramlbpmn.api.resource;

import java.math.BigDecimal;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import talk.ramlbpmn.api.model.Artist;
import talk.ramlbpmn.api.model.ArtistList;

@Path("artists")
public interface Artists {


    /**
     * 
     * @param page
     *     The page to retrieve
     */
    @GET
    @Produces({
        "application/hal+json"
    })
    Artists.GetArtistsResponse getArtists(
        @QueryParam("page")
        BigDecimal page)
        throws Exception
    ;

    /**
     * 
     * @param artistId
     *     
     */
    @GET
    @Path("{artistId}")
    @Produces({
        "application/hal+json"
    })
    Artists.GetArtistsByArtistIdResponse getArtistsByArtistId(
        @PathParam("artistId")
        String artistId)
        throws Exception
    ;

    public class GetArtistsByArtistIdResponse
        extends talk.ramlbpmn.api.support.ResponseWrapper
    {


        private GetArtistsByArtistIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         * @param entity
         *     
         */
        public static Artists.GetArtistsByArtistIdResponse withHaljsonOK(Artist entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/hal+json");
            responseBuilder.entity(entity);
            return new Artists.GetArtistsByArtistIdResponse(responseBuilder.build());
        }

    }

    public class GetArtistsResponse
        extends talk.ramlbpmn.api.support.ResponseWrapper
    {


        private GetArtistsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         * @param entity
         *     
         */
        public static Artists.GetArtistsResponse withHaljsonOK(ArtistList entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/hal+json");
            responseBuilder.entity(entity);
            return new Artists.GetArtistsResponse(responseBuilder.build());
        }

    }

}
