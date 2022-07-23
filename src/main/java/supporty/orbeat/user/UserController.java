package supporty.orbeat.user;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = {"User"})
@RequiredArgsConstructor
@RestController
@RequestMapping
public class UserController {

    private final UserService userService;

}
