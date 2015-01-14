package talk.ramlbpmn.api.resource;

import org.springframework.stereotype.Component;
import talk.ramlbpmn.api.model.ServiceDocument;

@Component
public class RootImpl extends BaseResource implements Root {
  @Override
  public GetResponse get() throws Exception {
    ServiceDocument serviceDocument = new ServiceDocument()
      .withSelf(link(Root.class))
      .withArtists(link(Artists.class))
      .withSongs(link(Songs.class));

    return GetResponse.withHaljsonOK(serviceDocument);
  }
}
