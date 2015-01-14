package talk.ramlbpmn.api.resource;

import org.springframework.core.annotation.AnnotationUtils;
import talk.ramlbpmn.api.model.HalLink;

import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

public class BaseResource {
  @Context
  UriInfo uriInfo;

  HalLink link(Class<?> targetResource, String... paths) {
    return new HalLink().withHref(uriInfo.getBaseUriBuilder().segment(getPathFromResource(targetResource)).segment(paths).toTemplate());
  }

  private String getPathFromResource(Class<?> targetResource) {
    String pathValue = AnnotationUtils.findAnnotation(targetResource, Path.class).value();
    if (pathValue != null && pathValue.equals("/")) {
      return "";
    } else {
      return pathValue;
    }
  }
}
