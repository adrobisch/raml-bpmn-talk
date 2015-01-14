
package talk.ramlbpmn.api.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import talk.ramlbpmn.api.support.ResponseWrapper;

@Path("order")
public interface Order {


    /**
     * 
     * @param entity
     *     
     */
    @POST
    @Consumes("application/json")
    Order.PostOrderResponse postOrder(talk.ramlbpmn.api.model.Order entity)
        throws Exception
    ;

    public class PostOrderResponse
        extends ResponseWrapper
    {


        private PostOrderResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         */
        public static Order.PostOrderResponse withCreated() {
            Response.ResponseBuilder responseBuilder = Response.status(201);
            return new Order.PostOrderResponse(responseBuilder.build());
        }

    }

}
