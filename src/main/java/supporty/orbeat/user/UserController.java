package supporty.orbeat.user;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import supporty.orbeat.artist.ArtistService;
import supporty.orbeat.config.BaseResponse;


@Api(tags = {"User"})
@RequiredArgsConstructor
@RestController
@RequestMapping
public class UserController {

    private final UserService userService;

}
