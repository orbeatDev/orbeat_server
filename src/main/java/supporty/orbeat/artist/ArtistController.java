package supporty.orbeat.artist;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import supporty.orbeat.config.BaseResponse;


@Api(tags = {"Artist"})
@RequiredArgsConstructor
@RestController
@RequestMapping
public class ArtistController {

    private final ArtistService artistService;

}
