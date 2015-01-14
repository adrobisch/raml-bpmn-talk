package talk.ramlbpmn.api.resource;

import brainslug.flow.context.BrainslugContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import talk.ramlbpmn.api.model.Song;
import talk.ramlbpmn.api.model.SongLinks;
import talk.ramlbpmn.api.model.SongList;

import java.math.BigDecimal;
import java.util.Arrays;

@Component
public class SongsImpl extends BaseResource implements Songs {

  @Autowired
  BrainslugContext brainslugContext;

  @Override
  public GetSongsResponse getSongs(String genre, BigDecimal pages) throws Exception {
    Song song = new Song().withTitle("Wonderful Word");
    SongList songList = new SongList().withSongs(Arrays.asList(song));

    return GetSongsResponse.withHaljsonOK(songList);
  }

  @Override
  public PostSongsResponse postSongs() throws Exception {
    throw new UnsupportedOperationException("not implemented yet");
  }

  @Override
  public GetSongsBySongIdResponse getSongsBySongId(String songId) throws Exception {
    Song hello = new Song().withLinks(new SongLinks().withArtist(link(Artists.class, "1"))).withTitle(songId).withArtist("Hello");
    return GetSongsBySongIdResponse.withHaljsonOK(hello);
  }

  @Override
  public DeleteSongsBySongIdResponse deleteSongsBySongId(String songId) throws Exception {
    return DeleteSongsBySongIdResponse.withOK();
  }
}
