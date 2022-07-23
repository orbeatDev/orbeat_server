package supporty.orbeat.artist;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = {"Artist"})
@RequiredArgsConstructor
@RestController
@RequestMapping
public class ArtistController {

    private final ArtistService artistService;

}
