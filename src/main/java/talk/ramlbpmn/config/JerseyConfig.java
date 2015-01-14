package talk.ramlbpmn.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import talk.ramlbpmn.api.resource.OrderImpl;
import talk.ramlbpmn.api.resource.RootImpl;
import talk.ramlbpmn.api.resource.SongsImpl;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
  public JerseyConfig() {
    register(SongsImpl.class);
    register(RootImpl.class);
    register(OrderImpl.class);
  }
}
