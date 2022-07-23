package supporty.orbeat.music;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = {"Music"})
@RequiredArgsConstructor
@RestController
@RequestMapping
public class MusicController {

    private final MusicService musicService;

}
