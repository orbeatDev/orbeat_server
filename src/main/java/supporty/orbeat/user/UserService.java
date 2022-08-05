package supporty.orbeat.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import supporty.orbeat.user.dto.SignUpReq;
import supporty.orbeat.user.dto.SignUpRes;
import supporty.orbeat.user.entity.User;
import supporty.orbeat.user.repository.UserRepository;

import java.util.Objects;

import static supporty.orbeat.user.entity.User.SignUpUser;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public SignUpRes SignUp(SignUpReq signUpReq){
        User userReq=SignUpUser(signUpReq);
        User save = userRepository.save(userReq);
        SignUpRes res=new SignUpRes(save.getUserId(),save.getUserName(),save.getCreatedAt());
        return res;
    }

}
